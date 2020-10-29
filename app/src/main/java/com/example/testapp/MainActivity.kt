package com.example.testapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import com.example.esblue.*
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import okhttp3.ResponseBody

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = JNIBase.libraryTest()
        OuterFun()

        button.setOnClickListener {
            println("result = $result")
        }
    }
}
