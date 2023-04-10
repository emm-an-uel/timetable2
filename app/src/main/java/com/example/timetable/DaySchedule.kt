package com.example.timetable

data class DaySchedule (
    val dayName: String,
    val times: ArrayList<Int> // stores the starting times of each 'lesson' in minutes (eg 2pm is 840 - 840min after 12am)
        )