package com.example.belajarapps.pertemuan5

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.belajarapps.databinding.ActivityFifthBinding
import com.example.belajarapps.R

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Artificial Intelligence"
            subtitle = "Teknologi Masa Depan"
            setDisplayHomeAsUpEnabled(true)

            // Icon back custom
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        }

        // ✅ Button WebView
        binding.btnWebView.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }
    }

    // ✅ Menu di toolbar
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // ✅ Klik menu + submenu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }

            R.id.action_search -> {
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_settings -> {
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
                true
            }

            // ✅ Submenu Checkbox
            R.id.menu_dark_mode -> {
                item.isChecked = !item.isChecked
                Toast.makeText(this, "Dark Mode: ${item.isChecked}", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.menu_notifications -> {
                item.isChecked = !item.isChecked
                Toast.makeText(this, "Notifications: ${item.isChecked}", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}