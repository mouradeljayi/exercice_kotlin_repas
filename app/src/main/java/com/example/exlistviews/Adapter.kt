package com.example.exlistviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(var mCtx:Context, var ressources:Int, var items:List<meal>):ArrayAdapter<meal>(mCtx,ressources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater= LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(ressources,null)
        val imageView:ImageView=view.findViewById(R.id.imageView)
        val nomtextView:TextView=view.findViewById(R.id.Nom)
        val prixtextView:TextView=view.findViewById(R.id.Prix)
        val meal=items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(meal.image))
        nomtextView.text=meal.nom
        prixtextView.text=meal.prix.toString()+"$"
        return view
    }
}