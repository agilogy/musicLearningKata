package com.agilogy.music

enum class NoteName(val pitchClass: Int) {
    A(9), B(11),C(0),D(2),E(4),F(5),G(7);

    operator fun invoke(noteValue: NoteValue): Note = Note(this, noteValue)
    val sharp get() = NoteWithAlteration(this, Alteration.SHARP)

    val doubleSharp get() = NoteWithAlteration(this, Alteration(2))
    val natural get() = NoteWithAlteration(this, Alteration.NATURAL)
    val flat get() = NoteWithAlteration(this, Alteration.FLAT)
    val doubleFlat get() = NoteWithAlteration(this, Alteration(-2))

    fun intervalTo(other: NoteName): IntervalNumber {
        val distance = other.ordinal - ordinal
        val noteCount = NoteName.entries.size
        return IntervalNumber.entries[Math.floorMod(distance, noteCount)]
    }
}
