package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihan.databinding.ActivityMainBinding
import com.example.latihan.databinding.ActivityProfilBinding

class profil : AppCompatActivity() {
    lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
    binding.btnkeluar.setOnClickListener{
        Toast.makeText( this,"Tidak Bisa Keluar", Toast.LENGTH_LONG).show()
    }

    }
}