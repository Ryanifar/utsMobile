package com.example.utsmobile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.MainActivity
import com.example.utsmobile.R
import com.example.utsmobile.model.MobilModel

class ItemAdapter(
    private val context: Context,
    private val data: List<MobilModel>
) :RecyclerView.Adapter<ItemAdapter.mobilViewHolder>(){
    class mobilViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = itemView.findViewById(R.id.pic)
        val nama = view.findViewById<TextView?>(R.id.textNamaMobil)
        val tahun_produksi = view.findViewById<TextView?>(R.id.textTahunProduksi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mobilViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return mobilViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: mobilViewHolder, position: Int) {
        val item = data[position]
        holder.image.setImageResource(item.imageResourceId)
        holder.nama.text = item.name
        holder.tahun_produksi.text = item.tahunProduksi
    }

    override fun getItemCount()=data.size

}