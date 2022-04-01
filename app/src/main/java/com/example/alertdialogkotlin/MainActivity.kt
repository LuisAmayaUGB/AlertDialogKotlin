package com.example.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)

        builder.setTitle("Title")
        builder.setMessage("Message")
        builder.setIcon(R.mipmap.ic_launcher)

        builder.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, id ->
            Toast.makeText(this,"ok", Toast.LENGTH_LONG).show()

            dialog.dismiss()
        })
        builder.setNegativeButton("cancel", { dialog, id ->
            Toast.makeText(this,"Cancel", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        })

        builder.setNeutralButton("Can't Say", { dialog, i ->
            Toast.makeText(this,"Can't Say", Toast.LENGTH_LONG).show()

            dialog.dismiss()
        })

        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()


    }
}