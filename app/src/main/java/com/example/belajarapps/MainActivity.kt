package com.example.belajarapps

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.belajarapps.Home.Pertemuan_2.SecondActivity
import com.example.belajarapps.databinding.ActivityMainBinding
import com.example.belajarapps.Home.pertemuan3.ThirdActivity
import com.example.belajarapps.Home.pertemuan4.FourthActivity
import com.example.belajarapps.Home.pertemuan5.WebViewActivity
import com.example.belajarapps.Home.pertemuan7.SevenActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Lebih aman pakai binding.root
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        // SharedPreferences
        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

        // Ke FourthActivity (dengan data)
        binding.btnToFourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)
            startActivity(intent)
        }

        // Pertemuan 2
        binding.btnPertemuan2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        // Pertemuan 3
        binding.btnPertemuan3.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        // Pertemuan 4
        binding.btnPertemuan4.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        // Pertemuan 5
        binding.btnPertemuan5.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }

        // Pertemuan 7
        binding.btnPertemuan7.setOnClickListener {
            val intent = Intent(this, SevenActivity::class.java)
            startActivity(intent)
        }

        // Logout
        binding.btnLogout.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Logout")
                .setMessage("Apakah Anda yakin ingin keluar?")
                .setPositiveButton("Ya") { dialog, _ ->
                    sharedPref.edit().clear().apply()

                    val intent = Intent(this, SplashScreenActivity::class.java)
                    startActivity(intent)
                    finish()

                    dialog.dismiss()
                }
                .setNegativeButton("Tidak", null)
                .show()
        }
    }
}