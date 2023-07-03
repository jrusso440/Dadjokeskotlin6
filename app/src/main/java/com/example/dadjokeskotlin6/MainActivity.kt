package com.example.dadjokeskotlin6

import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.ui.AppBarConfiguration
import com.example.dadjokeskotlin6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickShowPunchLine(view: View?) {
        val jokes = findViewById(R.id.punchLines) as TextView
        val jokeChoice = findViewById(R.id.joke) as Spinner
        val jokeSelected = jokeChoice.selectedItem.toString()
        val jokesList: List<String> = jokeMan.getJokes(jokeSelected)
        val jokesFormatted = StringBuilder()
        for (joke in jokesList) {
            jokesFormatted.append(joke).append('\n')
        }
        jokes.text = jokesFormatted
    }

}