package com.hemanthDev.noteapp.presentation.notes

import com.hemanthDev.noteapp.domain.model.Note
import com.hemanthDev.noteapp.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
