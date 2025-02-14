package com.agilogy.math.cat

interface Field<A: Field<A>> : Ring<A>{

    val inverse: A

    operator fun div(other: A) = this * other.inverse

}