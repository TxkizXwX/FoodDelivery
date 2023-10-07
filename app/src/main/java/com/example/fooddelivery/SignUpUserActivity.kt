package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.example.fooddelivery.databinding.ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {

    lateinit var binding : ActivitySignUpUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goLoginUserPage.setOnClickListener{
            val intent = Intent(this@SignUpUserActivity, LoginUserActivity :: class.java)
            startActivity(intent)
        }

        binding.createAccountBtn.setOnClickListener {
            val intent = Intent(this,LocationActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}