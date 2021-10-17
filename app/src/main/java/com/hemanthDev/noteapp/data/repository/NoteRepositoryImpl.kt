package com.hemanthDev.noteapp.data.repository

import com.hemanthDev.noteapp.data.dataSource.NoteDoa
import com.hemanthDev.noteapp.domain.model.Note
import com.hemanthDev.noteapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val doa: NoteDoa
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> = doa.getNotes()

    override suspend fun getNoteById(id: Int): Note? = doa.getNoteById(id)

    override suspend fun insertNote(note: Note) = doa.insertNote(note = note)

    override suspend fun deleteNote(note: Note) = doa.deleteNote(note = note)

}