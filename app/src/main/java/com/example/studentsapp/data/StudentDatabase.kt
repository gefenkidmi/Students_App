package com.example.studentsapp.data

import com.example.studentsapp.models.Student

object StudentDatabase {
    val students = mutableListOf(
        Student("1", "Michael Brown", "0541234567", "789 Pine Road"),
        Student("2", "Emily Johnson", "0529876543", "321 Elm Street"),
        Student("3", "David Wilson", "0531122334", "654 Cedar Blvd"),
        Student("4", "Sophia Martinez", "0508765432", "987 Maple Lane")
    )
}
