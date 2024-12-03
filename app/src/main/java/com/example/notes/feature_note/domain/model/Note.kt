package com.example.notes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notes.ui.theme.BabyBlue
import com.example.notes.ui.theme.DarkGray
import com.example.notes.ui.theme.LightBlue
import com.example.notes.ui.theme.LightGreen
import com.example.notes.ui.theme.RedOrange
import com.example.notes.ui.theme.RedPink
import com.example.notes.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            DarkGray, LightBlue, RedOrange, RedPink, BabyBlue, Violet, LightGreen
        )
    }
}

class InvalidNoteException(message: String): Exception(message)