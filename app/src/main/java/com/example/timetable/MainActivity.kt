package com.example.timetable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var rvAdapter: RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (viewModel.daySchedules == null) {
            viewModel.getDaySchedules()
        }

        createRecyclerView()
    }

    private fun createRecyclerView() {
        rvAdapter = RVAdapter(listOf(
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
        ))
        binding.rvDays.adapter = rvAdapter
    }
}