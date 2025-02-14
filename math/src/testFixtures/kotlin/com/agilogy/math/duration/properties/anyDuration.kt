package com.agilogy.math.properties

import com.agilogy.math.duration.Duration
import io.kotest.property.arbitrary.map

val anyDuration = com.agilogy.math.rational.properties.anyRational.map { Duration.ofSeconds(it) }