package com.agilogy.music

enum class NoteName(val pitchClass: Int) {
    A(9), B(11),C(0),D(2),E(4),F(5),G(7);

    operator fun invoke(noteValue: NoteValue): Note = Note(this, noteValue)

    val sharp get() = NotePitch(this, Alteration.SHARP)
    val doubleSharp get() = NotePitch(this, Alteration(2))
    val natural get() = NotePitch(this, Alteration.NATURAL)
    val flat get() = NotePitch(this, Alteration.FLAT)
    val doubleFlat get() = NotePitch(this, Alteration(-2))
}