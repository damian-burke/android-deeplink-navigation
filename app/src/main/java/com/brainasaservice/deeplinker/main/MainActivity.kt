package com.brainasaservice.deeplinker.main

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate(${javaClass.simpleName})")
        setContentView(R.layout.activity_main)

        deepButton.setOnClickListener {
            println("Going deeper.")
            val intent = Intent(ACTION_VIEW, Uri.parse("deep://deep/content"))
            startActivity(intent)
        }

        helloButton.setOnClickListener {
            println("Hello, you.")
            val intent = Intent(ACTION_VIEW, Uri.parse("deep://deep/custom/damian"))
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart(${javaClass.simpleName})")
    }

    override fun onStop() {
        super.onStop()
        println("onStop(${javaClass.simpleName})")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy(${javaClass.simpleName})")
    }
}
