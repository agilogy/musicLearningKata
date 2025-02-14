package com.agilogy.math.cat

interface Ring<A : Ring<A>> : Group<A> {

    operator fun times(other: A): A

}