package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)



        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val nameEditText = findViewById<EditText>(R.id.nameEditText)
            val name = nameEditText.text.toString()

            if (name.isEmpty()) {
                nameEditText.error = "Please enter your name"
            } else {
                displayTextView.text = "Hello, $name"
            }

        }
    }
}