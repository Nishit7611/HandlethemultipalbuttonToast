package com.example.handlethemultipalbuttontoast

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick(view: android.view.View ){
        if (view.id == R.id.btn1){

            var builder = AlertDialog.Builder(this)
            builder.setTitle("This is alert Box")
            builder.setIcon(R.mipmap.ic_launcher)
            builder.setMessage("Really You Want Exit")
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { DialogInterface, id ->
                Toast.makeText(this, "Thank you for Postivite FeedBack", Toast.LENGTH_LONG).show()

            }
            )
            builder.setNegativeButton("No", DialogInterface.OnClickListener{
                dialogInterface, i ->
                Toast.makeText(this,"Thank you for give Feedback , Will we imporve ",Toast.LENGTH_LONG).show()
            })

            var dialog = builder.create()
            dialog.setCancelable(false)
            dialog.show()

        }
        else if(view.id == R.id.btn2){
            Toast.makeText(this,"This is a Button 2",Toast.LENGTH_LONG).show()
        }
    }
}