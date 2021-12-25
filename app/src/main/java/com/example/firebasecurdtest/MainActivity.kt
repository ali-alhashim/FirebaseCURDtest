package com.example.firebasecurdtest

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object
    {
        lateinit var auth : FirebaseAuth

        const val EMAIL = "test@aliAlhashim.com"
        const val NAME = "ALI"
        const val PASS = "StrongPass1234@"

        // Real Time Database
        val database = Firebase.database
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Log.d(ContentValues.TAG,"init FirebaseAuth")
        auth = FirebaseAuth.getInstance()

         val registerButton : Button = findViewById(R.id.registerButton)
         registerButton.setOnClickListener(this)

         val loginButton : Button = findViewById(R.id.loginButton)
         loginButton.setOnClickListener(this)



        val writeSimpleDataButton : Button = findViewById(R.id.writeSimpleDataButton)
        writeSimpleDataButton.setOnClickListener(this)

        val readSimpleDataButton : Button = findViewById(R.id.readSimpleDataButton)
        readSimpleDataButton.setOnClickListener(this)



        val writeObjectButton : Button = findViewById(R.id.writeObjectButton)
        writeObjectButton.setOnClickListener(this)

        val readObjectButton : Button = findViewById(R.id.readObjectButton)
        readObjectButton.setOnClickListener(this)



        val writeManyObjectButton : Button = findViewById(R.id.writeManyObjectButton)
        writeManyObjectButton.setOnClickListener(this)

        val readManyObjectButton : Button = findViewById(R.id.readManyObjectButton)
        readManyObjectButton.setOnClickListener(this)



        val readContinuouslyButton :Button = findViewById(R.id.readContinuouslyButton)
        readContinuouslyButton.setOnClickListener(this)





    }

    override fun onClick(button: View?) {

        Log.d(ContentValues.TAG,"you click on the view")

        when(button!!.id)
        {
            R.id.registerButton -> registerFunction()
            R.id.loginButton -> loginFunction()

            R.id.writeSimpleDataButton -> writeSimpleDataFunction()
            R.id.readSimpleDataButton -> readSimpleDataFunction()

            R.id.writeObjectButton -> writeObjectFunction()
            R.id.readObjectButton -> readObjectFunction()

            R.id.writeManyObjectButton -> writeManyObjectFunction()
            R.id.readManyObjectButton -> readManyObjectFunction()

            R.id.readContinuouslyButton -> readContinuouslyFunction()
        }

    }


}