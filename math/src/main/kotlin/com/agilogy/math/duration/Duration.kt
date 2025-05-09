package com.agilogy.math.duration

import com.agilogy.math.rational.RationalSyntax.r
import com.agilogy.math.cat.Group
import com.agilogy.math.rational.Rational

interface Duration : Group<Duration> {

    val inSeconds: Rational

    override operator fun times(r: Rational): Duration = ofSeconds(inSeconds * r)
    override fun plus(other: Duration): Duration = (inSeconds + other.inSeconds).seconds
    override fun unaryMinus(): Duration = (-inSeconds).seconds

    private data class SecondsDuration(override val inSeconds: Rational) : Duration

    companion object {
        val zero: Duration = ofSeconds(0.r)
        fun ofSeconds(value: Rational): Duration = SecondsDuration(value)
        val Rational.seconds get() = ofSeconds(this)
        val Rational.minutes get() = ofSeconds(this * 60)
    }
}


