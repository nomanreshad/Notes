package com.example.notes.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)

    fun copy(orderType: OrderType): NoteOrder {
        return when (this) {
            is Date -> Date(orderType)
            is Title -> Title(orderType)
            is Color -> Color(orderType)
        }
    }
}