package com.example.firebasecurdtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton :Button = findViewById(R.id.registerButton)
        val loginButton :Button = findViewById(R.id.loginButton)

        val writeSimpleDataButton : Button = findViewById(R.id.writeSimpleDataButton)
        val readSimpleDataButton : Button = findViewById(R.id.readSimpleDataButton)

        val writeObjectButton : Button = findViewById(R.id.writeObjectButton)
        val readObjectButton : Button = findViewById(R.id.readObjectButton)

        val writeManyObjectButton :Button = findViewById(R.id.writeManyObjectButton)
        val readManyObjectButton :Button = findViewById(R.id.readManyObjectButton)

        val readContinuouslyButton :Button = findViewById(R.id.readContinuouslyButton)

         // -- register button action
        registerButton.setOnClickListener()
        {

        }

        // -- login button action
        loginButton.setOnClickListener()
        {

        }

        // -- write simple data button action
        writeSimpleDataButton.setOnClickListener()
        {

        }

        // -- read simple data button action
        readSimpleDataButton.setOnClickListener()
        {

        }

        // -- write object button action
        writeObjectButton.setOnClickListener()
        {

        }

        // -- read object button action
        readObjectButton.setOnClickListener()
        {

        }

        // -- write many objects action
        writeManyObjectButton.setOnClickListener()
        {

        }

        // -- read many objects action
        readManyObjectButton.setOnClickListener()
        {

        }

        // --read Continuously Button

        readContinuouslyButton.setOnClickListener()
        {

        }





    }
}