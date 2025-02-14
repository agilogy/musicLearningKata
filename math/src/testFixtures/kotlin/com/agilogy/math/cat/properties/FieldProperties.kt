package com.agilogy.math.cat.properties

import com.agilogy.math.cat.Field
import io.kotest.property.Arb
import io.kotest.property.checkAll

suspend fun <A : Field<A>> Arb<A>.checkFieldProperties(
    zero: A,
    one: A,
    equality: (A, A) -> Boolean = { a, b -> a == b }
) {
    val arb = this
    checkCommutativeRingProperties(zero, one, equality)
    with(EqualityContext(equality)) {
        checkAll(arb) { a ->
            if (a != zero) {
                assertEquals(one, a / a, "Failed division identity: a / a != 1")
            }
        }
        checkAll(arb, arb) { a, b ->
            if (b != zero) {
                assertEquals(a * b.inverse, a / b, "Failed division definition: a / b != a * (1 / b)")
            }
        }
    }
}
