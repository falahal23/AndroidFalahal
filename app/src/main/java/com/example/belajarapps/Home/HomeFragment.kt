package com.example.belajarapps.Home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.belajarapps.Home.Pertemuan_2.SecondActivity
import com.example.belajarapps.Home.pertemuan3.ThirdActivity
import com.example.belajarapps.Home.pertemuan4.FourthActivity
import com.example.belajarapps.Home.pertemuan5.FifthActivity
import com.example.belajarapps.Home.pertemuan5.WebViewActivity
import com.example.belajarapps.Home.pertemuan7.SevenActivity
import com.example.belajarapps.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnPertemuan2.setOnClickListener {
            val intent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }

        binding.btnPertemuan3.setOnClickListener {
            val intent = Intent(requireContext(), ThirdActivity::class.java)
            startActivity(intent)
        }

//        binding.btnToFourth.setOnClickListener {
//            val intent = Intent(requireContext(), FourthActivity::class.java)
//            startActivity(intent)
//        }

        binding.btnPertemuan4.setOnClickListener {
            val intent = Intent(requireContext(), FifthActivity::class.java)
            startActivity(intent)
        }

        binding.btnPertemuan5.setOnClickListener {
            val intent = Intent(requireContext(), WebViewActivity::class.java)
            startActivity(intent)
        }
        binding.btnPertemuan7.setOnClickListener {
            val intent = Intent(requireContext(), SevenActivity::class.java)
            startActivity(intent)
        }

    }
}