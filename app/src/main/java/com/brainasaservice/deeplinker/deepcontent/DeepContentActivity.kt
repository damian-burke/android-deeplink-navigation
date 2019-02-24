package com.brainasaservice.deeplinker.deepcontent

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.R
import kotlinx.android.synthetic.main.activity_deep_content.buttonBack
import kotlinx.android.synthetic.main.activity_deep_content.textTitle

class DeepContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate(${javaClass.simpleName})")
        setContentView(R.layout.activity_deep_content)

        buttonBack.setOnClickListener {
            NavUtils.getParentActivityIntent(this)?.let { intent ->
                intent.component?.className?.let { print("Component Class: $it") }
                startActivity(intent)
            }
            super.onBackPressed()
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
