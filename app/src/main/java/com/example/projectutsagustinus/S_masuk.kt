package com.example.projectutsagustinus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class S_masuk : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smasuk)

        val btnYa: Button = findViewById(R.id.button_ya)
        btnYa.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_ya -> {
                val intent = Intent(this@S_masuk, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}