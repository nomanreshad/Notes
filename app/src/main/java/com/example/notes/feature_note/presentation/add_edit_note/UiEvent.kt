package com.example.notes.feature_note.presentation.add_edit_note

sealed class UiEvent {
    data class ShowSnackbar(val message: String): UiEvent()
    data object SaveNote: UiEvent()
}