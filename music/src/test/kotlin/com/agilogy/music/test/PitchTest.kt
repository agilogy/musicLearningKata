package com.agilogy.music.test

import com.agilogy.music.NoteName
import com.agilogy.music.Pitch
import io.kotest.core.spec.style.FunSpec
import org.junit.jupiter.api.Assertions.assertEquals

class PitchTest : FunSpec({

    test("Return the correct frequency for A4") {
        val a4 = Pitch(NoteName.A.natural, 4)
        assertEquals(440.0, a4.frequency)
    }

    test("Return the correct frequency for A5") {
        val a5 = Pitch(NoteName.A.natural, 5)
        val expected = 880.0
        assertEquals(expected, a5.frequency)
    }

    test("Return the correct frequency for c4") {
        val c4 = Pitch(NoteName.C.natural, 4)
        val expected = 261.626
        assertEquals(expected, c4.frequency, 0.001)
    }

    test("Return the correct frequency for c3") {
        val note = Pitch(NoteName.C.natural, 3)
        val expected = 130.813
        assertEquals(expected, note.frequency, 0.001)
    }

    test("Return the correct frequency for c1") {
        val note = Pitch(NoteName.C.natural, 1)
        val expected = 32.703
        assertEquals(expected, note.frequency, 0.001)
    }

    test("Return the correct frequency for c7") {
        val note = Pitch(NoteName.C.natural, 7)
        val expected = 2093.005
        assertEquals(expected, note.frequency, 0.001)
    }

    test("Return the correct frequency for A#4") {
        val as4 = Pitch(NoteName.A.sharp, 4)
        assertEquals(466.164, as4.frequency, 0.001)
    }

    test("Return the correct frequency for Af4") {
        val af4 = Pitch(NoteName.A.flat, 4)
        assertEquals(415.304, af4.frequency, 0.001)
    }

    test("Return the correct frequency for A##4") {
        val ass4 = Pitch(NoteName.A.doubleSharp, 4)
        val b4 = Pitch(NoteName.B.natural, 4)
        assertEquals(b4.frequency, ass4.frequency)
    }

})