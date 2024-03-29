package com.example.newsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.ItemListBinding

class RvAdapter(private var dataList:ArrayList<RvModel>, private var context:Context) : RecyclerView.Adapter<RvAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
//        return MyViewHolder(view)
        val binding = ItemListBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }
    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        anim(holder.itemView)
        holder.binding.imgNews.setImageResource(dataList[position].profile)
        holder.binding.txtTitle.text= dataList[position].title
        holder.binding.txtDes.text= dataList[position].desp

    }
    inner class MyViewHolder(var binding:ItemListBinding ): RecyclerView.ViewHolder(binding.root)

    fun anim(view: View){
        val animation = AlphaAnimation(0.0f,1.0f)
        animation.duration= 1700
        view.startAnimation(animation)
    }
}

