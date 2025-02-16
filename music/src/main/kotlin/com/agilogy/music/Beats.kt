package com.agilogy.music

import com.agilogy.math.cat.Group
import com.agilogy.math.rational.Rational

@JvmInline
value class Beats(val value: Rational): Group<Beats> {
    override fun plus(other: Beats): Beats = Beats(value + other.value)
    override fun unaryMinus(): Beats = Beats(-value)
    override fun times(other: Rational): Beats = Beats(value + other)
}

val Rational.beats: Beats get() = Beats(this)