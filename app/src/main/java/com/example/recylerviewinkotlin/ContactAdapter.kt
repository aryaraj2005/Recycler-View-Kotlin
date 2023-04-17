package com.example.recylerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.collection.SparseArrayCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*
import java.security.AccessControlContext
import java.util.ArrayList
// () INVOCATION THROUGH THAT WE CAN DIRECTLY CREATE OUR OBJECT NO NEED TO MAKE ANY CONSTRUCTOR
class ContactAdapter(val context: Context  , val arrContact:java.util.ArrayList<CintancModel>):
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
          val imgcont = itemView.imgcont
        val txtname=itemView.edtname
        val textnumber = itemView.edtnum

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.row , parent , false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgcont.setImageResource(arrContact[position].img)
        holder.txtname.text = arrContact[position].name
        holder.textnumber.text = arrContact[position].Number
    }

    override fun getItemCount(): Int{
        return  arrContact.size
    }
}



