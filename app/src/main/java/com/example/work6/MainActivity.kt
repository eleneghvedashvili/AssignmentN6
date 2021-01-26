package com.example.work6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val carsadd = ArrayList<Cars>()

        carsadd.add(Cars("https://s3.amazonaws.com/toyota-cms-media/wp-content/uploads/2019/03/2020_Supra_LaunchEdition_01_DA98A3EF24330A1E359D4DA496D4CF667DC03BAE-1500x900.jpg" ))
        carsadd.add(Cars("https://hips.hearstapps.com/amv-prod-gp.s3.amazonaws.com/gearpatrol/wp-content/uploads/2019/12/New-Cars-We-Cant-Wait-to-Meet-in-2020-gear-patrol-lead-full.jpg" ))
        carsadd.add(Cars("https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fdam%2Fimageserve%2F99ebe31da6594b2bbfe2944db8909411%2F0x0.jpg%3Ffit%3Dscale" ))
        carsadd.add(Cars("https://i.pinimg.com/originals/e6/d2/63/e6d2639c2df509ab0b9e22110c14c9ce.jpg" ))
        carsadd.add(Cars("https://specials-images.forbesimg.com/imageserve/5d35eacaf1176b0008974b54/960x0.jpg?cropX1=790&cropX2=5350&cropY1=784&cropY2=3349" ))
        carsadd.add(Cars("https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5d35eacaf1176b0008974b54%2F0x0.jpg%3FcropX1%3D790%26cropX2%3D5350%26cropY1%3D784%26cropY2%3D3349" ))
        carsadd.add(Cars("https://carsguide-res.cloudinary.com/image/upload/f_auto,fl_lossy,q_auto,t_cg_hero_large/v1/editorial/story/hero_image/2019-Porsche-911-coupe-red-press-image-1001x565p-%281%29.jpg" ))
        carsadd.add(Cars("https://cars.usnews.com/pics/size/640x420/static/images/article/202008/128312/2120x920_MS-RedSunset_Cropped.jpg" ))
        carsadd.add(Cars("https://thumbor.forbes.com/thumbor/trim/299x201:2851x1638/fit-in/711x400/smart/https://specials-images.forbesimg.com/imageserve/5d37046395e0230008f64edf/0x0.jpg" ))
        carsadd.add(Cars("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/the-bugatti-chiron-is-shown-to-the-goodwood-festival-of-news-photo-1600106522.jpg?crop=0.641xw:1.00xh;0.127xw,0&resize=640:*" ))
        carsadd.add(Cars("https://carwow-uk-wp-3.imgix.net/bmw-ix-electric-car-1-driving-lead-scaled.jpg?auto=format&cs=tinysrgb&fit=clip&ixlib=rb-1.1.0&q=60&w=750" ))
        carsadd.add(Cars("https://www.mercedes-benz.com/en/vehicles/passenger-cars/cla/_jcr_content/image/MQ6-8-image-20200129105810/00-mercedes-benz-vehicles-cla-br118-2560x1440.jpeg" ))
        carsadd.add(Cars("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2021-mercedes-benz-cls-class-1591735006.jpg?crop=0.708xw:0.531xh;0.0737xw,0.353xh&resize=1200:*" ))
        carsadd.add(Cars("https://images.financialexpress.com/2020/09/Mercedes-AMG-G63.jpg?w=1200&h=870&imflag=true" ))
        carsadd.add(Cars("https://images.hgmsites.net/hug/2021-mercedes-benz-cla-class_100771169_h.jpg" ))

        val adapter= caradapter(carsadd)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}