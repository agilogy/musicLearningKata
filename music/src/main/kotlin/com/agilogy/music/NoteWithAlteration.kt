package com.agilogy.music

@JvmInline
value class Alteration(val pitchClass: Int){
    companion object{
        val SHARP = Alteration(1)
        val FLAT = Alteration(-1)
        val NATURAL = Alteration(0)
    }
}

data class NoteWithAlteration(val noteName: NoteName, val alteration: Alteration){
    val pitchClass: Int get() = noteName.pitchClass + alteration.pitchClass
}
