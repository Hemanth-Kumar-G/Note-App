package com.hemanthDev.noteapp.domain.usecase

import com.hemanthDev.noteapp.domain.model.Note
import com.hemanthDev.noteapp.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}