package com.agilogy.music

enum class NoteName {
    A,B,C,D,E,F,G;

    operator fun invoke(noteValue: NoteValue): Note = Note(this, noteValue)

}