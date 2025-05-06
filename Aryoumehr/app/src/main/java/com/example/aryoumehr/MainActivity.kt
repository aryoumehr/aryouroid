package com.example.aryoumehr

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val callButton: Button = findViewById(R.id.call_button)
        val smsButton: Button = findViewById(R.id.sms_button)
        val emailButton: Button = findViewById(R.id.email_button)

        callButton.setOnClickListener { onCallClick() }
        smsButton.setOnClickListener { onSmsClick() }
        emailButton.setOnClickListener { onEmailClick() }
    }

    private fun onCallClick() {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:00989306901298")
        startActivity(intent)
    }

    private fun onSmsClick() {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("smsto:00989306901298")
        intent.putExtra("sms_body", "Hello Aryoumehr!")
        startActivity(intent)
    }

    private fun onEmailClick() {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:aryoumehr@gmail.com")
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello Aryoumehr!")
        startActivity(intent)
    }
}