package com.example.ehirplakakodubul

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ehirplakakodubul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.isNotEmpty()) {
                var plakakodu = binding.editTextNumber.text.toString().toInt()
                when(plakakodu){

                    1 -> binding.textView.text = "Adana"
                    2 -> binding.textView.text = "Adıyaman"
                    3 -> binding.textView.text = "Afyon"
                    4 -> binding.textView.text = "Ağrı "
                    5 -> binding.textView.text = "Amasya   "
                    6 -> binding.textView.text = "Ankara "
                    7 -> binding.textView.text = "Antalya  "
                    8 -> binding.textView.text = "Artvin"
                    9 -> binding.textView.text = "Aydın "
                    10 -> binding.textView.text = "Balıkesir "
                    11 -> binding.textView.text = "Bilecik "
                    12 -> binding.textView.text = "Bingöl "
                    13 -> binding.textView.text = "Bitlis "
                    14 -> binding.textView.text = "Bolu "
                    15 -> binding.textView.text = "Burdur "
                    16 -> binding.textView.text = "Bursa "
                    17 -> binding.textView.text = "Çanakkale "
                    18 -> binding.textView.text = "Çankırı "
                    19 -> binding.textView.text = "Çorum "
                    20 -> binding.textView.text = "Denizli "
                    21 -> binding.textView.text = "Diyarbakır "
                    22 -> binding.textView.text = "Edirne "
                    23 -> binding.textView.text = "Elazığ "
                    24 -> binding.textView.text = "Erzincan"
                    25 -> binding.textView.text = "Erzurum"
                    26 -> binding.textView.text = "Eskişehir"
                    27 -> binding.textView.text = "Gaziantep"
                    28 -> binding.textView.text = "Giresun"
                    29 -> binding.textView.text = "Gümüşhane"
                    30-> binding.textView.text = "Hakkari"
                    31-> binding.textView.text = "Hatay"
                    32-> binding.textView.text = "Isparta"
                    33-> binding.textView.text = "Mersin İçel"
                    34-> binding.textView.text = "İstanbuld"
                    35-> binding.textView.text = "İzmir"
                    36-> binding.textView.text = "Kars"
                    37-> binding.textView.text = "Kastamonu"
                    38-> binding.textView.text = "Kayseri"
                    39-> binding.textView.text = "Kırklareli"
                    40-> binding.textView.text = "Kırşehir"
                    41-> binding.textView.text = "Kocaeli"
                    42-> binding.textView.text = "Konya"
                    43-> binding.textView.text = "Kocaeli"
                    44-> binding.textView.text = "Malatya"
                    45-> binding.textView.text = "Manisa"
                    46-> binding.textView.text = "Kahramanmaraş"
                    47-> binding.textView.text = "Mardin"
                    48-> binding.textView.text = "Muğla"
                    49-> binding.textView.text = "Muş"
                    50-> binding.textView.text = "Nevşehir"
                    51-> binding.textView.text = "Niğde"
                    52-> binding.textView.text = "ordu"
                    53-> binding.textView.text = "Rize"
                    54-> binding.textView.text = "Sakarya"
                    55-> binding.textView.text = "Samsun"
                    56-> binding.textView.text = "Siirt"
                    57-> binding.textView.text = "Sinop"
                    58-> binding.textView.text = "Sivas"
                    59-> binding.textView.text = "Tekirdağ"
                    60-> binding.textView.text = "Tokat"
                    61-> binding.textView.text = "Trabzon"
                    62-> binding.textView.text = "Tunceli"
                    63-> binding.textView.text = "Şanlıurfa"
                    64-> binding.textView.text = "Uşak"
                    65-> binding.textView.text = "Van"
                    66-> binding.textView.text = "Yozgat"
                    67-> binding.textView.text = "Zonguldak"
                    68-> binding.textView.text = "Aksaray"
                    69-> binding.textView.text = "Bayburt"
                    70-> binding.textView.text = "Karaman"
                    71-> binding.textView.text = "Tunceli"
                    72-> binding.textView.text = "Batman"
                    73-> binding.textView.text = "Şırnak"
                    74-> binding.textView.text = "Bartın"
                    75-> binding.textView.text = "Ardahan"
                    76-> binding.textView.text = "Iğdır"
                    77-> binding.textView.text = "Yalova"
                    78-> binding.textView.text = "Karabük"
                    79-> binding.textView.text = "Kilis"
                    80-> binding.textView.text = "Osmaniye"
                    81-> binding.textView.text =  "Düzce"
                    82-> binding.textView.text =  "MELİH"
                    83-> binding.textView.text =  "ELMAS"
                    84-> binding.textView.text =  "ALAADDİN"
                    85-> binding.textView.text =  "AYSİMA"
                    86-> binding.textView.text =  "NUR SENA"
                    87-> binding.textView.text =  "ESMA"
                    88-> binding.textView.text =  "RABİA"
                    89-> binding.textView.text =  "SADİYE"
                    90-> binding.textView.text =  "MERYEM"
                    91-> binding.textView.text =  "AHMET"

                    else -> binding.textView.text = "BULUNAMADI"
            }

            }
            else {
                binding.textView.text = "Lütfen Plaka Kodunu Giriniz."
            }
binding.editTextNumber.text.clear()

        }

        }

    }

