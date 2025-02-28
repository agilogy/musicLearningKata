package com.agilogy.music

import com.agilogy.math.rational.RationalSyntax.r

enum class NoteValue(val relativeValue: RelativeValue) {
    Whole(RelativeValue(1.r)),
    Half(RelativeValue(1.r / 2)),
    Quarter(RelativeValue(1.r / 4)),
    Eighth(RelativeValue(1.r / 8)),
    Sixteenth(RelativeValue(1.r / 16)),
    ThirtySecond(RelativeValue(1.r / 32)),
    SixtyFourth(RelativeValue(1.r / 64));

    companion object {
        fun of(relativeValue: RelativeValue): NoteValue = NoteValue.entries.find { it.relativeValue == relativeValue }
            ?: throw IllegalArgumentException("No note value for $relativeValue")
    }


}
