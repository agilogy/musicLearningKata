package com.agilogy.music.test

import io.kotest.core.spec.style.FunSpec

class NoteValueTest : FunSpec({

//    // https://en.wikipedia.org/wiki/Note_value#List
//    test("Note value relative value") {
//        assertEquals(RelativeValue(1.r), NoteValue.Whole.relativeValue)
//        assertEquals(RelativeValue(1.r / 2), NoteValue.Half.relativeValue)
//        assertEquals(RelativeValue(1.r / 4), Quarter.relativeValue)
//        assertEquals(RelativeValue(1.r / 8), NoteValue.Eighth.relativeValue)
//        assertEquals(RelativeValue(1.r / 16), NoteValue.Sixteenth.relativeValue)
//        assertEquals(RelativeValue(1.r / 32), NoteValue.ThirtySecond.relativeValue)
//        assertEquals(RelativeValue(1.r / 64), NoteValue.SixtyFourth.relativeValue)
//    }
//
//    test("Syntax: RelativeValue.of") {
//        NoteValue.entries.forEach { noteValue ->
//            assertEquals(noteValue, NoteValue.of(noteValue.relativeValue))
//        }
//    }
//
//    test("Syntax: Note") {
//        assertEquals(Note(C, Quarter), C(Quarter))
//    }
//
//    test("Syntax: Note value with dots") {
//        assertEquals(DottedNoteValue(Quarter, 1u), Quarter.dot)
//        assertEquals(DottedNoteValue(Quarter, 2u), Quarter.dot.dot)
//    }
//
//    test("Note value with one dot") {
//        assertEquals(RelativeValue(1.r + 1.r / 2), NoteValue.Whole.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 2 + 1.r / 4), NoteValue.Half.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 4 + 1.r / 8), Quarter.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 8 + 1.r / 16), NoteValue.Eighth.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 16 + 1.r / 32), NoteValue.Sixteenth.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 32 + 1.r / 64), NoteValue.ThirtySecond.dot.relativeValue)
//    }
//
//    test("Note value with two dots") {
//        assertEquals(RelativeValue(1.r + 1.r / 2 + 1.r / 4), NoteValue.Whole.dot.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 2 + 1.r / 4 + 1.r / 8), NoteValue.Half.dot.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 4 + 1.r / 8 + 1.r / 16), Quarter.dot.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 8 + 1.r / 16 + 1.r / 32), NoteValue.Eighth.dot.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 16 + 1.r / 32 + 1.r / 64), NoteValue.Sixteenth.dot.dot.relativeValue)
//        assertEquals(RelativeValue(1.r / 32 + 1.r / 64 + 1.r / 128), NoteValue.ThirtySecond.dot.dot.relativeValue)
//    }
//
//    test("Syntax: Time signature syntax") {
//        assertEquals(TimeSignature(2u, 4u), TimeSignature(2u, Quarter))
//        val twoFour = TimeSignature(2u, 4u)
//        assertEquals(2u, twoFour.numerator)
//        assertEquals(4u, twoFour.denominator)
//        assertEquals(2u, twoFour.beats)
//        assertEquals(Quarter, twoFour.beatValue)
//    }
//
//    test("illegal time signature denominator") {
//        assertThrows<IllegalArgumentException> {
//            TimeSignature(2u, 5u)
//        }
//    }
//
//    xtest("Property: The denominator of a time signature must be one of the denominators of a note duration figure") {
//        TODO()
//        // TODO: Once implemented, remove previous unnecessary tests
//    }
//
//    xtest("Property: The note value of a time signature is the note value with the same denominator") {
//        TODO()
//        // TODO: Once implemented, remove previous unnecessary tests
//    }
//
//    test("Tempo beat duration") {
//        val tempo = 120u.bpm
//        assertEquals((1.r / 2).seconds, tempo.beatDuration)
//    }
//
//    xtest("Property: The tempo beat duration is 1 minute / bpm") {
//        TODO()
//        // TODO: Once implemented, remove previous unnecessary tests
//    }
//
//    test("Note duration in beats in time signature") {
//        val timeSignature = TimeSignature(2u, 4u)
//        assertEquals(2.r.beats, timeSignature.durationInBeats(NoteValue.Half))
//        assertEquals((1.r / 2).beats, timeSignature.durationInBeats(NoteValue.Eighth))
//    }
//
//    xtest("Property: Note duration in beats is...") {
//        TODO()
//    }
//
//    test("Note duration in tempo") {
//        val timeSignature = TimeSignature(2u, Quarter)
//        val tempo = 120u.bpm
//        assertEquals((1.r / 2).seconds, timeSignature.duration(Quarter, tempo))
//        assertEquals(1.r.seconds, timeSignature.duration(NoteValue.Half, tempo))
//        assertEquals((1.r / 4).seconds, timeSignature.duration(NoteValue.Eighth, tempo))
//    }
//
//    xtest("Property: Note duration in tempo is...") {
//        TODO()
//    }
//
//    test("Generic tuplet note value") {
//        val numberOfNotesToReplace = 4u
//        val tuplet = Tuplet(Quarter, numberOfNotesToReplace, A, A, B, B, C, C, D)
//        assertEquals(Quarter.relativeValue * numberOfNotesToReplace, tuplet.relativeValue)
//    }
//
//    test("Duet note value") {
//        val tuplet = Tuplet(Quarter, C, D)
//        assertEquals(Quarter.relativeValue * 3, tuplet.relativeValue)
//    }
//
//    test("Triplet note value") {
//        val tuplet = Tuplet(Quarter, C, D, C)
//        assertEquals(Quarter.relativeValue * 2, tuplet.relativeValue)
//    }
//
//    test("Quintuplet note value") {
//        val tuplet = Tuplet(Quarter, C, D, C, A, B)
//        assertEquals(Quarter.relativeValue * 4, tuplet.relativeValue)
//    }

})