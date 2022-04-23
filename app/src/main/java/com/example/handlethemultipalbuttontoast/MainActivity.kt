package com.example.handlethemultipalbuttontoast

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idtxt.setOnClickListener {
            var cal = Calendar.getInstance()
            var year = cal.get(Calendar.YEAR)
            var month = cal.get(Calendar.MONTH)
            var day = cal.get(Calendar.DAY_OF_MONTH)
            var datePicker = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { datePicker, year,month,day ->
                  idtxt.setText(  "This is a Date You Select " + " $year/${month + 1}/ $day")
                },year,month,day ).show()




        }

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
        else if (view.id == R.id.btn3 )
        {
            var cal = Calendar.getInstance()
            var year = cal.get(Calendar.YEAR)
            var month = cal.get(Calendar.MONTH)
            var day = cal.get(Calendar.DAY_OF_MONTH)
            var datePicker = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { datePicker, year,month,day ->
                    Toast.makeText(this,"This is a Date You Select " + " $year/${month + 1}/ $day",Toast.LENGTH_LONG ).show()
                },year,month,day ).show()




        }
        else if (view.id == R.id.btn4 )
        {
            var timePicker = TimePickerDialog(this,null,5,47,false)
            timePicker.show()

        }

    }


}