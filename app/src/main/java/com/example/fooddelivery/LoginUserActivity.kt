package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.example.fooddelivery.databinding.ActivityLogginBinding
import com.example.fooddelivery.databinding.ActivitySignUpUserBinding

class LoginUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goSignUpUser.setOnClickListener{
            val intent = Intent(this@LoginUserActivity, SignUpUserActivity :: class.java)
            startActivity(intent)
        }

        binding.loginBtn.setOnClickListener {
            val intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}