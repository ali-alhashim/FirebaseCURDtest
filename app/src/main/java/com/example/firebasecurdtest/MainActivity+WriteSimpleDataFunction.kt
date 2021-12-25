package com.example.firebasecurdtest

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import com.google.firebase.database.DatabaseReference

fun MainActivity.writeSimpleDataFunction() {


    Log.d(TAG,"you clicked on Write Simple Data Button")

    MainActivity.database.getReference("data").child("tests")
        .setValue("this is from android", DatabaseReference.CompletionListener {
            error, ref ->
            if(error == null)
            {
              //No error
                Toast.makeText(this,"your write to database successfully ",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,error.toString(),Toast.LENGTH_LONG).show()
            }
        })

}