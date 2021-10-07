package com.ravctrl.trackiss

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ravctrl.trackiss.data.model.remote.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retService = RetrofitService
            .getRetrofitInstance()
            .create(RetrofitService::class.java)

        GlobalScope.launch {
            var lol2 = retService.getResidents().body()

            val lol = lol2
        }
    }
}