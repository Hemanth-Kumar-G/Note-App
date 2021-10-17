package com.hemanthDev.noteapp.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hemanthDev.noteapp.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDoa

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}