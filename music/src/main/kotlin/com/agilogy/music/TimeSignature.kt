package com.agilogy.music

import com.agilogy.math.rational.RationalSyntax.r

data class TimeSignature(val numerator: UInt, val beatValue: NoteValue) {
    val beats: UInt = numerator
    val denominator: UInt = beatValue.relativeValue.r.denominator.toUInt()

    companion object {
        operator fun invoke( numerator: UInt, denominator: UInt): TimeSignature = TimeSignature(numerator, NoteValue.of(RelativeValue(1.r / denominator)))
    }
}