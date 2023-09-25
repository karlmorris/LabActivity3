package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {

            if ( findViewById<EditText>(R.id.nameEditText).text.toString() == null ||
                findViewById<EditText>(R.id.nameEditText).text.toString() == ""
                ) {

                displayTextView.text = "Please Enter a Name"

            } else {
                displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            }

        }


    }
}