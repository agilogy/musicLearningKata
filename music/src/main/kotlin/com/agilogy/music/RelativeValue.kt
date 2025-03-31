package com.agilogy.music

import com.agilogy.math.rational.Rational

data class RelativeValue(val r: Rational) {
    operator fun plus(other: RelativeValue): RelativeValue = RelativeValue(r + other.r)
    operator fun div(value: Int): RelativeValue = RelativeValue(r / value)
}