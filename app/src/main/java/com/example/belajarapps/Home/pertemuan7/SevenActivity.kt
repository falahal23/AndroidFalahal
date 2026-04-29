package com.example.belajarapps.Home.pertemuan7

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.belajarapps.R
import com.example.belajarapps.databinding.ActivitySevenBinding
import com.google.android.material.snackbar.Snackbar

class SevenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySevenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySevenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setSupportActionBar(binding.toolbar2)
        supportActionBar?.apply {
            title = "Halaman Seventh"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        replaceFragment(SatuFragment())

        binding.Btnfragmen1.setOnClickListener {
            replaceFragment(SatuFragment())
        }
        binding.Btnfragment2.setOnClickListener {
            replaceFragment(DuaFragment())
        }
        binding.Btnfragment3.setOnClickListener {
            replaceFragment(TigaFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .addToBackStack(null)
            .commit()
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }

            R.id.action_search -> {
                Snackbar
                    .make(
                        binding.root,
                        "Search Clicked 🔍",
                        Snackbar.LENGTH_SHORT
                    )
                    .show()
                true
            }

            R.id.action_settings -> {
                Snackbar
                    .make(
                        binding.root,
                        "Search Clicked 🔍",
                        Snackbar.LENGTH_SHORT
                    )
                    .show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }
}