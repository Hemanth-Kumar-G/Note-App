package com.hemanthDev.noteapp.domain.usecase

import com.hemanthDev.noteapp.domain.model.Note
import com.hemanthDev.noteapp.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}