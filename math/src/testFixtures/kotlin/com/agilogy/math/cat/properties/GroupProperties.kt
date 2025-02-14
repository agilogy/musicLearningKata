package com.agilogy.math.cat.properties

import com.agilogy.math.cat.Group
import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.checkAll

class EqualityContext<A>(val equality: (A, A) -> Boolean) {

    fun assertEquals(expected: A, actual: A, message: String) {
        if (!equality(expected, actual)) assertEquals(expected, actual, message)
    }
}

suspend fun <A : Group<A>> Arb<A>.checkGroupProperties(zero: A, equality: (A, A) -> Boolean = { a, b -> a == b }) {
    val arb = this
    with(EqualityContext(equality)) {
        checkAll(arb) { a ->
            assertEquals(a, a + zero, "Failed addition identity: a + 0 != a")
            assertEquals(zero, a + -a, "Failed addition opposite: a + (-a) != 0")
            assertEquals(a, -(-a), "Failed addition opposite of an opposite: -(-a) != a")
        }
        checkAll(arb, arb) { a, b ->
            assertEquals(-a + -b, -(a + b), "Failed opposite of an addition: -(a + b) != -a + -b")
            assertEquals(a + -b, a - b, "Failed substraction: a + (-b) != a - b")
        }
        checkAll(arb, arb, arb) { a, b, c ->
            assertEquals(a + (b + c), (a + b) + c, "Failed addition associativity: a + (b + c) != (a + b) + c")
        }
        checkAll(arb, Arb.int(-10..10)) { a, i ->
            assertEquals(a + (a * (i - 1)), a * i, "Failed multiplication by integer: a * i != a + a * (i - 1)")
        }
    }
}

suspend fun <A : Group<A>> Arb<A>.checkCommutativeGroupProperties(
    zero: A,
    equality: (A, A) -> Boolean = { a, b -> a == b },
) {
    val arb = this
    checkGroupProperties(zero, equality)
    with(EqualityContext(equality)) {
        checkAll(arb, arb) { a, b ->
            assertEquals(a + b, b + a, "Failed addition commutativity: a + b != b + a")
        }
    }
}
