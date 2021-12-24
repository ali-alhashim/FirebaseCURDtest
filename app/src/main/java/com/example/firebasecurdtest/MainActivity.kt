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
            registerFunction()
        }

        // -- login button action
        loginButton.setOnClickListener()
        {
            loginFunction()
        }

        // -- write simple data button action
        writeSimpleDataButton.setOnClickListener()
        {
            writeSimpleDataFunction()
        }

        // -- read simple data button action
        readSimpleDataButton.setOnClickListener()
        {
            readSimpleDataFunction()
        }

        // -- write object button action
        writeObjectButton.setOnClickListener()
        {
            writeObjectFunction()
        }

        // -- read object button action
        readObjectButton.setOnClickListener()
        {
            readObjectFunction()
        }

        // -- write many objects action
        writeManyObjectButton.setOnClickListener()
        {
            writeManyObjectFunction()
        }

        // -- read many objects action
        readManyObjectButton.setOnClickListener()
        {
            readManyObject()
        }

        // --read Continuously Button

        readContinuouslyButton.setOnClickListener()
        {
            readContinuously()
        }





    }



}