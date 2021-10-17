package com.hemanthDev.noteapp.presentation.notes

import com.hemanthDev.noteapp.domain.model.Note
import com.hemanthDev.noteapp.domain.util.NoteOrder
import com.hemanthDev.noteapp.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)