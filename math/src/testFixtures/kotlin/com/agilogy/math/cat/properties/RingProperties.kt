package com.agilogy.math.cat.properties

import com.agilogy.math.cat.Ring
import io.kotest.property.Arb
import io.kotest.property.checkAll

suspend fun <A : Ring<A>> Arb<A>.checkRingProperties(
    zero: A,
    one: A,
    equality: (A, A) -> Boolean = { a, b -> a == b },
) {
    val arb = this
    checkCommutativeGroupProperties(zero, equality)
    with(EqualityContext(equality)) {
        checkAll(arb) { a ->
            assertEquals(a * one, a, "Failed product identity: a * 1 != a")
            assertEquals(one * a, a, "Failed product identity: 1 * a != a")
        }
        checkAll(arb, arb, arb) { a, b, c ->
            assertEquals(a * (b * c), (a * b) * c, "Failed product associativity: a * (b * c) != (a * b) * c")
            assertEquals(
                a * (b + c),
                (a * b) + (a * c),
                "Failed product distributivity: a * (b + c) != (a * b) + (a * c)"
            )
            assertEquals(
                (a + b) * c,
                (a * c) + (b * c),
                "Failed product distributivity: (a + b) * c != (a * c) + (b * c)"
            )
        }
    }
}

suspend fun <A : Ring<A>> Arb<A>.checkCommutativeRingProperties(
    zero: A,
    one: A,
    equality: (A, A) -> Boolean = { a, b -> a == b },
) {
    val arb = this
    checkRingProperties(zero, one, equality)
    with(EqualityContext(equality)) {
        checkAll(arb, arb) { a, b ->
            assertEquals(a * b, b * a, "Failed product commutativity: a * b != b * a")
        }
    }
}
