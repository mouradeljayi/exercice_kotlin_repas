package com.example.exlistviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

lateinit var listmeals:ArrayList<meal>
    //my adapter
    lateinit var MonAdapteur:Adapter
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listmeals= ArrayList()
        listmeals.add(meal(R.drawable.burger,"burger","7"))
        listmeals.add(meal(R.drawable.pasta,"pasta","4"))
        listmeals.add(meal(R.drawable.pizza,"pizza","5"))
        listmeals.add(meal(R.drawable.soupe,"soupe","3"))

        MonAdapteur=Adapter(this,R.layout.layout_perso , listmeals)

        malistview.adapter=MonAdapteur
    }
}
