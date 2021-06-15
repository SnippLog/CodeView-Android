package io.github.kbiakov.codeviewexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.javaAction).setOnClickListener {
            startActivity(Intent(this, ListingsActivity::class.java))
        }

        findViewById<Button>(R.id.kotlinAction).setOnClickListener {
            startActivity(Intent(this, KotlinActivity::class.java))
        }

        findViewById<Button>(R.id.swiftAction).setOnClickListener {
            startActivity(Intent(this, SwiftActivity::class.java))
        }
    }
}