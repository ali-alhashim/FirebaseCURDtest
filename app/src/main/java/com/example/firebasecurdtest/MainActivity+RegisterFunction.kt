package com.example.firebasecurdtest

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast

fun MainActivity.registerFunction() {

          Log.d(TAG,"you call Registration Function")

    MainActivity.auth.createUserWithEmailAndPassword(MainActivity.EMAIL, MainActivity.PASS)
        .addOnCompleteListener(this){
            task ->

            if(task.isSuccessful)
            {
               Toast.makeText(this,"Registration Succeeded", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Registration Failed", Toast.LENGTH_LONG).show()
                Log.d(TAG, task.exception.toString())
            }
        }


}