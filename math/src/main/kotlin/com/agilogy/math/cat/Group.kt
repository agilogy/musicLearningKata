package com.agilogy.math.cat

import com.agilogy.math.rational.Rational
import com.agilogy.math.rational.RationalSyntax.r

interface Group<A : Group<A>> {

    operator fun plus(other: A): A
    operator fun unaryMinus(): A
    operator fun minus(other: A) = this + (-other)

    operator fun times(other: Rational): A
    operator fun times(other: Int): A = times(other.r)
    operator fun times(other: UInt): A = times(other.r)
    operator fun times(other: Long): A = times(other.r)

    operator fun div(other: Rational): A = times(other.inverse)
    operator fun div(other: Int): A = div(other.r)
    operator fun div(other: UInt): A = div(other.r)
    operator fun div(other: Long): A = div(other.r)

}