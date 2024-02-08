package com.example.nariman_explicit_implicit_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplicit_0 = findViewById<Button>(R.id.button_0) //
        val btnImplicit_0 = findViewById<Button>(R.id.button_1)
        val btnExplicit_1 = findViewById<Button>(R.id.button_2)

        btnExplicit_0.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

        btnImplicit_0.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://warhammer40k.fandom.com/wiki/Imperium_of_Man")
            startActivity(intent)
        }

        btnExplicit_1.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}