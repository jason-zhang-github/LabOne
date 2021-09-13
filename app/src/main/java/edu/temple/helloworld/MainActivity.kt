package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.widget.TextView

// import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msg = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button) // assign button from xml
        btn.setOnClickListener{msg.text  = "You clicked the button"}
        // btn.setOnClickListener({v, -> (v as Button).text = "You clicked the button"})

        /* val click = object : View.OnClickListener // create OCL
        {
            override fun onClick(v: View?) //What to do when clicked
            {
                Toast.makeText(this@MainActivity, "You clicked the button", Toast.LENGTH_LONG).show()
                Log.d("Message", "You clicked the button")
            }

        }

        btn.setOnClickListener(click) // assign OCL to button
        */
    }
}