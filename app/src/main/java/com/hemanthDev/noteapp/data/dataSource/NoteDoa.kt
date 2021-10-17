package com.hemanthDev.noteapp.data.dataSource

import androidx.room.*
import com.hemanthDev.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDoa {

    @Query("Select * from Note")
    fun getNotes(): Flow<List<Note>>

    @Query("select * from Note where id=:id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}