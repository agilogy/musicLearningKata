package com.agilogy.music

data class Tuplet(val noteValue: NoteValue, val notesToReplace: UInt, val notes: List<NoteName>) {

    val relativeValue: RelativeValue get() = noteValue.relativeValue * notesToReplace

    companion object {
        operator fun invoke(noteValue: NoteValue, notesToReplace: UInt, vararg notes: NoteName) =
            Tuplet(noteValue, notesToReplace, notes.toList())
        operator fun invoke(noteValue: NoteValue, vararg notes: NoteName): Tuplet {
            val notesList = notes.toList()
            val notesToReplace = when(notesList.size){
                2 -> 3u
                else -> notesList.size.toUInt() - 1u
            }
            return Tuplet(noteValue, notesToReplace, notesList)
        }
    }
}