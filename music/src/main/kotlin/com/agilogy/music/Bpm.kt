package com.agilogy.music

import com.agilogy.math.duration.Duration
import com.agilogy.math.duration.Duration.Companion.seconds
import com.agilogy.math.rational.RationalSyntax.r

@JvmInline
value class Bpm(private val bpm: UInt) {
    val beatDuration: Duration get() = 60.r.seconds / bpm

    companion object {
        val UInt.bpm: Bpm get() = Bpm(this)
    }
}