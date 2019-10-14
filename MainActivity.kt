package com.example.listku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val al_flower=ArrayList<Model_flower>()
        al_flower.add(Model_flower("Ruby",R.drawable.ruby,"Ruby is en open-source and full object-oriented programing language."))

        al_flower.add(Model_flower("Ralls",R.drawable.rails,"Ruby on Ralls is a server-side web appication development framework written In Ruby language."))

        al_flower.add(Model_flower("Python",R.drawable.python,"Python in interpreted scripiting and object-oriented programming language"))

        al_flower.add(Model_flower("java Script",R.drawable.js,"Java Script is an object-based scripting language"))

        al_flower.add(Model_flower("PHP",R.drawable.php,"PHP is an interpreted language, Le.., there is on need for compilation"))

        val obj_adapter : CustomAdapter
        obj_adapter = CustomAdapter(applicationContext,al_flower)
       lv_flower.adapter=obj_adapter
    }
}
