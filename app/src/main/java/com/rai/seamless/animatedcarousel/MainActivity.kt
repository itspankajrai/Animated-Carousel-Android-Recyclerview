package com.rai.seamless.animatedcarousel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.carousel.CarouselLayoutManager
import com.rai.seamless.animatedcarousel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _binding:ActivityMainBinding
    private val binding :ActivityMainBinding
        get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val imageList = mutableListOf<String>()

        val imageSix =
            "https://www.shutterstock.com/image-photo/fantastic-mountain-landscape-during-sunset-260nw-2348115333.jpg"
        val imageFive = "https://pics.craiyon.com/2023-10-13/64ea0631d7a943cbae06233d510019e6.webp"
        val imageFour =
            "https://easy-peasy.ai/cdn-cgi/image/quality=80,format=auto,width=700/https://fdczvxmwwjwpwbeeqcth.supabase.co/storage/v1/object/public/images/3cef1bdd-cfdc-4c57-83a0-261a5e731120/3ef535f1-2ea0-47b4-8ab0-9e86ac8199eb.png"
        val imageThree =
            "https://www.shutterstock.com/image-photo/stunning-view-rippled-sand-dunes-260nw-700881616.jpg"
        val imageOne =
            "https://img.lovepik.com/bg/20240426/Enhanced-Travel-App-Stunning-3D-Illustration_7497587_wh860.jpg!/fw/860"
        val imageTwo =
            "https://img.lovepik.com/bg/20240415/Enhance-Flight-Booking-Experience-with-a-Stunning-3D-Smartphone-App_5830949_wh860.jpg!/fw/860"

        imageList.add(imageSix)
        imageList.add(imageFive)
        imageList.add(imageFour)
        imageList.add(imageThree)
        imageList.add(imageTwo)
        imageList.add(imageOne)
        imageList.add(imageSix)



        binding.apply {
            carouselRecyclerView.adapter=CarouselAdapter(imageList)
            carouselRecyclerView.layoutManager= CarouselLayoutManager()

        }




    }
}