package com.example.firebasecurdtest

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast

fun MainActivity.loginFunction() {

    MainActivity.auth.signInWithEmailAndPassword(MainActivity.EMAIL,MainActivity.PASS)
        .addOnCompleteListener(this)
        {
            task ->
            if(task.isSuccessful)
            {
              Toast.makeText(this,"you login successfully ",Toast.LENGTH_LONG).show()

                val userName : String? = MainActivity.auth.currentUser!!.displayName

                Toast.makeText(this,"Welcome $userName",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"you login Failed ",Toast.LENGTH_LONG).show()
                Toast.makeText(this,task.exception.toString(),Toast.LENGTH_LONG).show()
                Log.d(TAG,task.exception.toString())
            }
        }


}