package com.agilogy.music

import com.agilogy.math.duration.Duration
import com.agilogy.math.rational.RationalSyntax.r

data class TimeSignature(val beats: UInt, val beatValue: NoteValue) {
    val numerator: UInt = beats
    val denominator: UInt = beatValue.relativeValue.value.denominator.toUInt()

    fun durationInBeats(noteDuration: NoteDuration): Beats =
        (noteDuration.relativeValue.value / beatValue.relativeValue.value).beats

    fun duration(noteDuration: NoteDuration, tempo: Bpm): Duration =
        tempo.beatDuration * durationInBeats(noteDuration).value

    companion object {
        operator fun invoke(numerator: UInt, denominator: UInt): TimeSignature =
            TimeSignature(
                numerator,
                NoteValue.of(RelativeValue(1.r / denominator)) ?:
                throw IllegalArgumentException("Illegal TimeSignature denominator $denominator")
            )
    }
}