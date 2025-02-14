package com.agilogy.math.rational

import com.agilogy.math.cat.properties.checkFieldProperties
import com.agilogy.math.rational.properties.anyRational
import io.kotest.core.spec.style.FunSpec

class RationalTest : FunSpec() {
    init {

        test("Test Rational properties") {
            anyRational.checkFieldProperties(Rational.zero, Rational.one)
        }
    }
}
