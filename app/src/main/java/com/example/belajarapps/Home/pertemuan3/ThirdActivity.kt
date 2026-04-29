package com.example.belajarapps.Home.pertemuan3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.belajarapps.R
import com.example.belajarapps.databinding.ActivityThirdBinding
import kotlin.jvm.java

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //val inputNomor = findViewById<EditText>(R.id.inputNoTujuan)
        //val btnsubmit = findViewById<Button>(R.id.btnKirim)

        binding.btnKirim.setOnClickListener {
            val nomor = binding.inputNoTujuan.text
            Toast.makeText(this, "Pesan Berhasil di kirim ke  = $nomor", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ThirdResultAcitvity::class.java)
            startActivity(intent)
        }


    }
}
