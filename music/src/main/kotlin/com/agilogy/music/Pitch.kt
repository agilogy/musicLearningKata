package com.agilogy.music

import kotlin.math.pow

data class Pitch(
    /** Number of semitones from A4 */
    private val value: Int
) {

    val frequency: Double = A4_FREQUENCY * 2.0.pow(value / SEMITONES_IN_OCTAVE.toDouble())

    companion object {
        const val A4_FREQUENCY = 440.0
        const val SEMITONES_IN_OCTAVE = 12
        const val MIDDLE_OCTAVE = 4
        operator fun invoke(notePitch: NotePitch, octave: Int): Pitch =
            Pitch((notePitch.pitchClass - NoteName.A.pitchClass) + (octave - MIDDLE_OCTAVE) * SEMITONES_IN_OCTAVE)
    }

}
