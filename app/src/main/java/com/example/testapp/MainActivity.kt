package com.example.testapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import com.example.esblue.*
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import okhttp3.ResponseBody

const val EXTRA_MESSAGE = "com.example.testapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arg1: Int = 0
        var arg2: Int = 0


        fun sendMessage(message: String) {
            val nextIntent = Intent(this, MessageActivity::class.java)
            nextIntent.putExtra("addResult", message)
            startActivity(nextIntent)
//            val intent = Intent(this, MessageActivity::class.java).apply {
//                putExtra(EXTRA_MESSAGE, message)
//            }
        }

        button.setOnClickListener {
            arg1 = edArg2.text.toString().toInt()
            arg2 = edArg.text.toString().toInt()
            var result = JNIBase.libraryTest(arg1, arg2).toString()
            println("$arg1 + $arg2 = $result")
            sendMessage(result)
        }
        //startActivity(intent)
    }
}
