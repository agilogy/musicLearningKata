package com.agilogy.music

import com.agilogy.math.duration.Duration
import com.agilogy.math.duration.seconds
import com.agilogy.math.rational.RationalSyntax.r

interface Tempo {
    val bpm: UInt

    val beatDuration: Duration get() = 60.r.seconds / bpm

    @JvmInline
    value class Bpm(override val bpm: UInt): Tempo

    companion object {
        val UInt.bpm: Bpm get() = Bpm(this)
    }
}