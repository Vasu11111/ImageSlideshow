# ImageSlideshow

Android Image Slider Kotlin

#Setup

allprojects {
	   repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
      //	maven { url 'https://jitpack.io' }

    }
}

dependencies {
	implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")
}

#Used

XML layout 
<androidx.cardview.widget.CardView
      app:cardCornerRadius="6dp"
      android:layout_margin="16dp"
      android:layout_width="match_parent"
      android:layout_height="wrap_content">

    <com.denzcoskun.imageslider.ImageSlider
        android:id="@+id/image_slider"
        android:layout_width="match_parent"
        android:layout_height="250dp"
        app:iss_auto_cycle="true"
        app:iss_period="1000"
        app:iss_delay="0" />

  </androidx.cardview.widget.CardView>

#Add ImageSlider to your Activity

        // Find ImageSlider in the layout
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)

        // Create a list of SlideModel (images can be URLs or drawable resources)
        val imageList = ArrayList<SlideModel>()

        // Adding images to the list
        imageList.add(SlideModel("https://example.com/image1.jpg", "Image 1"))
        imageList.add(SlideModel("https://example.com/image2.jpg", "Image 2"))
        imageList.add(SlideModel("https://example.com/image3.jpg", "Image 3"))
        imageList.add(SlideModel("https://example.com/image3.jpg", "Image 4"))
        imageList.add(SlideModel("https://example.com/image3.jpg", "Image 5"))

        // Set the images to the slider
        imageSlider.setImageList(imageList)




