package com.agilogy.math.rational

import com.agilogy.math.cat.Field

data class Rational private constructor(val numerator: Long, val denominator: Long) : Field<Rational> {
    val doubleValue: Double get() = numerator.toDouble() / denominator.toDouble()

    override operator fun plus(other: Rational): Rational =
        invoke(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)

    override operator fun unaryMinus(): Rational = invoke(-numerator, denominator)

    override operator fun times(other: Rational): Rational =
        invoke(numerator * other.numerator, denominator * other.denominator)

    override val inverse: Rational get() = invoke(denominator, numerator)

    // Needed to disambiguate
    override fun div(other: Rational): Rational = this * other.inverse

    companion object {
        val zero = Rational(0, 1)
        val one = Rational(1, 1)
        private fun mcd(a: Long, b: Long): Long = if (b == 0L) a else mcd(b, a % b)
        operator fun invoke(numerator: Int, denominator: Int): Rational =
            invoke(numerator.toLong(), denominator.toLong())

        operator fun invoke(numerator: Long, denominator: Long): Rational =
            if (numerator == 0L) zero
            else {
                val mcd = mcd(numerator, denominator)
                val resultNumerator = numerator / mcd
                val resultDenominator = denominator / mcd
                if (resultDenominator < 0) Rational(-resultNumerator, -resultDenominator)
                else Rational(resultNumerator, resultDenominator)
            }
    }
}

object RationalSyntax {

    val UInt.r: Rational get() = Rational(this.toLong(), 1)
    val Int.r: Rational get() = Rational(this, 1)
    val Long.r: Rational get() = Rational(this, 1)

}