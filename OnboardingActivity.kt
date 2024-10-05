package com.app.examples.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.tech.studyapplication.R
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbording)


        // Find ImageSlider in the layout
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)

        // Create a list of SlideModel (images can be URLs or drawable resources)
        val imageList = ArrayList<SlideModel>()

            // Adding images to the list
            imageList.add(SlideModel(R.drawable.logo))
            imageList.add(SlideModel(R.drawable.logo))
            imageList.add(SlideModel(R.drawable.images_3))

        // Set the images to the slider
        imageSlider.setImageList(imageList)

    }
}
