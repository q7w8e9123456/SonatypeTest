package com.gamania.sonatypetest.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gamania.sonatypetest.R
import com.gamania.testlibrary.TestModel

class SampleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = TestModel(1,1)
    }
}