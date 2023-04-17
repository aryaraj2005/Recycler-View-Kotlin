package com.example.recylerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val arrcontact = ArrayList<CintancModel>()
          arrcontact.add(CintancModel(R.drawable.food1 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food2 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food3 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food4 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food5 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food6 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.images , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food1 , "A" , "9026420905"))

        arrcontact.add(CintancModel(R.drawable.food3 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food4 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food6 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food1 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food3 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food2 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food6 , "A" , "9026420905"))
        arrcontact.add(CintancModel(R.drawable.food4 , "A" , "9026420905"))
           // WE CAN DIRECTLY SET THE LAYOUT
            recylerviewkotlin.layoutManager= GridLayoutManager(this , 3)
            val recycleradapter = ContactAdapter(this , arrcontact)
           recylerviewkotlin.adapter = recycleradapter

    }
}