package com.agilogy.math.duration

import com.agilogy.math.cat.properties.checkCommutativeGroupProperties
import com.agilogy.math.properties.anyDuration
import io.kotest.core.spec.style.FunSpec

class DurationTest : FunSpec() {
    init {

        test("Test Duration properties") {
            anyDuration.checkCommutativeGroupProperties(Duration.zero)
        }
    }
}
