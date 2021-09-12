package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
// import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        val click = object : View.OnClickListener
        {
            override fun onClick(v: View?)
            {
                Toast.makeText(this@MainActivity, "You clicked the button", Toast.LENGTH_LONG).show()
                Log.d("Message", "You clicked the button. congrats.")
            }

        }
        /* btn.setOnClickListener(new View.OnClickListener)
        {
            public void onClick(View v)
        } */
    }
}