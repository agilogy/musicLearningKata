package com.agilogy.music

import com.agilogy.math.cat.Group
import com.agilogy.math.rational.Rational

data class RelativeValue(val value: Rational): Group<RelativeValue>, Comparable<RelativeValue> {
    override fun plus(other: RelativeValue): RelativeValue = RelativeValue(value + other.value)
    override fun unaryMinus(): RelativeValue = RelativeValue(-value)
    override fun times(other: Rational): RelativeValue = RelativeValue(value * other)

    override fun div(other: Rational): RelativeValue = this * other.inverse

    companion object {
        val zero: RelativeValue = RelativeValue(Rational.zero)
        val whole: RelativeValue = RelativeValue(Rational.one)
    }

    override fun compareTo(other: RelativeValue): Int = this.value.compareTo(other.value)
}