package com.example.belajarapps.Pertemuan_2

    fun main(){
        println("Hai Rekan rekan .....")
        println("Selamat Datang di bahasa Pemprograman Kotlin")

        println("============")

        var angka = 15
        println("Hasl dr 15 + 10 =  ${angka + 10}")

        val nilaiInt = 10000
        val nilaiDouble = 100.003
        val nilaiFloat = 1000.0f

        println("Nilai Intgr = $nilaiInt")
        println("NILAI Double = $nilaiDouble")
        println("Nilai Float = $nilaiFloat")

        println("=====Str=====")

        val huruf = 'a'
        println("ini mengguakan karakter '$huruf'")

        val nilaiStr ="Mawar"
        println("Halo $nilaiStr!\nApa Kabar?")

        println("===kondisi===")
        val nilai =10
        if(nilai<0)
            println("BILANGAN NEGATIF")
        else{
            if (nilai%2 == 0)
                println("Bilangan Genap")
            else
                println("bilangan Ganil")
        }

        println("====perulangan===")
        val kampusKu: Array<String> = arrayOf("kampus", "politeknik", "Caltex", "Riau")
        for (kampus: String in kampusKu)
            println(kampus)
    }
