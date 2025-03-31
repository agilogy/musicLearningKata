package com.agilogy.music

import com.agilogy.math.rational.RationalSyntax.r

data class DottedNoteValue(val noteValue: NoteValue, val dots: UInt) {
    val relativeValue get(): RelativeValue =
        (1u..dots).fold(noteValue.relativeValue) { acc, i -> acc + RelativeValue(1.r / (acc.r.denominator * 2)) }
    val dot get(): DottedNoteValue = copy(dots = dots + 1u)
}
