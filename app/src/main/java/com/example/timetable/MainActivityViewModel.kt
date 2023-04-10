package com.example.timetable

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainActivityViewModel (val app: Application): AndroidViewModel(app) {
    var daySchedules: ArrayList<DaySchedule>? = null

    fun getDaySchedules() {
        daySchedules = arrayListOf()
        // TODO: read from local file later on
        // hardcoded schedule
        for (i in 0 until 5) { // monday to friday
            when (i) {
                0 -> { // monday
                    val times = arrayListOf(
                        520,
                        575,
                        630,
                        655,
                        710,
                        765,
                        815,
                        870,
                        925
                    )

                    val daySchedule = DaySchedule("Monday", times)
                    daySchedules!!.add(daySchedule)
                }

                1 -> { // tuesday
                    val times = arrayListOf(
                        520,
                        575,
                        630,
                        655,
                        710,
                        765,
                        815,
                        870,
                        925
                    )

                    val daySchedule = DaySchedule("Tuesday", times)
                    daySchedules!!.add(daySchedule)
                }

                2 -> { // wednesday
                    val times = arrayListOf(
                        580,
                        635,
                        660,
                        715,
                        770,
                        830,
                        885
                    )

                    val daySchedule = DaySchedule("Wednesday", times)
                    daySchedules!!.add(daySchedule)
                }

                3 -> { // thursday
                    val times = arrayListOf(
                        545,
                        600,
                        650,
                        675,
                        730,
                        780,
                        830,
                        880,
                        925
                    )

                    val daySchedule = DaySchedule("Thursday", times)
                    daySchedules!!.add(daySchedule)
                }

                4 -> { // friday
                    val times = arrayListOf(
                        545,
                        600,
                        650,
                        675,
                        730,
                        780,
                        830,
                        880,
                        925
                    )

                    val daySchedule = DaySchedule("Friday", times)
                    daySchedules!!.add(daySchedule)
                }
            }
        }
    }
}