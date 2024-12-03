package com.example.notes.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [NoteDao::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}