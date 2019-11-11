package com.example.viewanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
/*
* View animation
* firstly add following dependencies in our gradle file
* implementation'com.daimajia.androidanimations:library:2.3@aar'
* Changing in our View is called View Animation
* It consist on following
* Alpha
* Scale
* some others used in animate app*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anim.setOnClickListener {
           // playOn set kray ga jis pr lgani hai jasy mny text=id pr lgai h
            YoYo.with(Techniques.Landing)
                .duration(700).repeat(3).playOn(text)
        }
        /*
        * There are many view property when we will click on our YoYo.with(inside)
        * just type techniques all the functionality will be automatically appear
        * just select it and used in our project
        *Following i have used in functionality when i work on it
        *
        * RubberBand
        * Textview ko kheenchay ga dono atraf se
        *
        * Bounce
        * textview uper nechay hily gi
        * isi trha bounce up and down uper ko or nechy hilay gi
        *
        *
        *
        * */
    }
}
