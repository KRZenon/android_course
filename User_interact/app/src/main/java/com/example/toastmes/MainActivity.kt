package com.example.toastmes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var btnSB: Button
    lateinit var myLayout: ConstraintLayout
    lateinit var btnDM: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        btnSB = findViewById(R.id.btnSB)
        myLayout = findViewById(R.id.myLayout)
        btnDM = findViewById(R.id.btnDM)

        btn.setOnClickListener {
            Toast.makeText(applicationContext,"This is a Toast Message",Toast.LENGTH_LONG).show()
        }

        btnSB.setOnClickListener {
            Snackbar.make(myLayout,"This is a Snackbar Message",Snackbar.LENGTH_SHORT).setAction("Close",
                View.OnClickListener {  }).show()
        }

        btnDM.setOnClickListener {
            //showAlertDialog()
            var alertDialog = AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Change").setMessage("Do you want to change the text of the button?")
                .setIcon(R.drawable.waring)
                .setCancelable(false)
                .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                    dialog.cancel()
                })

                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                    btnDM.text = "Hello fuckers"
                })
            alertDialog.create().show()
        }
    }

   /* fun showAlertDialog() {
        var alertDialog = AlertDialog.Builder(this@MainActivity)
        alertDialog.setTitle("Change").setMessage("Do you want to change the text of the button?")
            .setIcon(R.drawable.waring)
            .setCancelable(false)
            .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                dialog.cancel()
            })

            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                btnDM.text = "Hello fuckers"
            })
        alertDialog.create().show()
    }*/
}