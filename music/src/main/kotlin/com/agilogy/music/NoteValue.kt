package com.agilogy.music

import com.agilogy.math.rational.Rational
import com.agilogy.math.rational.RationalSyntax.r

interface NoteDuration {
    val relativeValue: RelativeValue
}

enum class NoteValue(relativeValue: Rational) : NoteDuration {
    Whole(1.r),
    Half(1.r / 2),
    Quarter(1.r / 4),
    Eighth(1.r / 8),
    Sixteenth(1.r / 16),
    ThirtySecond(1.r / 32),
    SixtyFourth(1.r / 64);

    val dot: DottedNoteValue get() = DottedNoteValue(this, 1u)
    override val relativeValue: RelativeValue = RelativeValue(relativeValue)

    companion object {
        fun of(relativeValue: RelativeValue): NoteValue? = entries.find { it.relativeValue == relativeValue }
    }
}

data class DottedNoteValue(val noteValue: NoteValue, val dots: UInt) : NoteDuration {
    val dot: DottedNoteValue get() = DottedNoteValue(noteValue, dots + 1u)
    override val relativeValue: RelativeValue
        get() {
            var lastValue = noteValue.relativeValue
            var sum = noteValue.relativeValue
            for (d in 1u..dots) {
                lastValue /= 2.r
                sum += lastValue
            }
            return sum
        }
}