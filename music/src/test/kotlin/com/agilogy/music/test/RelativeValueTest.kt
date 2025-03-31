package com.agilogy.music.test

import com.agilogy.math.rational.RationalSyntax.r
import com.agilogy.music.RelativeValue
import io.kotest.core.spec.style.FunSpec
import org.junit.jupiter.api.Assertions.assertEquals

class RelativeValueTest: FunSpec( {
    test("operator plus should sum 2 relative values") {
        assertEquals(RelativeValue(1.r + 1.r / 2), RelativeValue(1.r) + RelativeValue(1.r / 2) )
    }
    test("operator div by an integer should divide a RelativeValue by that integer") {
        assertEquals(RelativeValue(1.r / 2), RelativeValue(1.r) / 2 )
    }
})