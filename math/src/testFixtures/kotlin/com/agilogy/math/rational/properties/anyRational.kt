package com.agilogy.math.rational.properties

import com.agilogy.math.rational.Rational
import io.kotest.property.Arb
import io.kotest.property.arbitrary.bind
import io.kotest.property.arbitrary.filter
import io.kotest.property.arbitrary.int

val anyRational: Arb<Rational> =
    Arb.bind(Arb.int(-1000..1000), Arb.int(-1000..1000).filter { it != 0 }) { n, d -> Rational(n, d) }
