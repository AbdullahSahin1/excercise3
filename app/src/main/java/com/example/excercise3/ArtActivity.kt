package com.example.excercise3

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.excercise3.databinding.ActivityArtBinding
import com.example.excercise3.databinding.ActivityMainBinding

class ArtActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArtBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun saveButtonClicked(view: View){

    }
    fun selectImage(view: View){

    }
}