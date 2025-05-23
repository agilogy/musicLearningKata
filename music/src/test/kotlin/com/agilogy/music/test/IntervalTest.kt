package com.agilogy.music.test

import com.agilogy.music.IntervalNumber
import com.agilogy.music.NoteName
import io.kotest.core.spec.style.FunSpec
import org.junit.jupiter.api.Assertions.assertEquals

class IntervalTest: FunSpec({

    test("The IntervalNumber between a note and itself is Unisone") {
        for (noteName in NoteName.entries) {
            assertEquals(IntervalNumber.UNISON, noteName.intervalTo(noteName))
        }
    }

    test("The IntervalNumber between A and B is Second") {
        assertEquals(IntervalNumber.SECOND, NoteName.A.intervalTo(NoteName.B))
    }

    test("The IntervalNumber between A and C is Third") {
        assertEquals(IntervalNumber.THIRD, NoteName.A.intervalTo(NoteName.C))
    }

    test("The IntervalNumber between B and A is Seventh") {
        assertEquals(IntervalNumber.SEVENTH, NoteName.B.intervalTo(NoteName.A))
    }

})
