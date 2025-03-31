package com.agilogy.music

enum class NoteName {
    A, B, C, D, E, F, G;
    operator fun invoke(quarter: NoteValue):Note = Note(this, quarter)
}
