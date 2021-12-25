package com.example.firebasecurdtest

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.UserProfileChangeRequest

fun MainActivity.registerFunction() {

          Log.d(TAG,"you call Registration Function")
    // we create user
    MainActivity.auth.createUserWithEmailAndPassword(MainActivity.EMAIL, MainActivity.PASS)
        .addOnCompleteListener(this){
            task ->

            if(task.isSuccessful)
            {
                // we add a name for the user
                val profileUpdates = UserProfileChangeRequest.Builder()
                    .setDisplayName(MainActivity.NAME)
                    .build()
                MainActivity.auth.currentUser!!.updateProfile(profileUpdates)

               Toast.makeText(this,"Registration Succeeded", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Registration Failed", Toast.LENGTH_LONG).show()
                Toast.makeText(this,task.exception.toString(),Toast.LENGTH_LONG).show()
                Log.d(TAG, task.exception.toString())
            }
        }


}