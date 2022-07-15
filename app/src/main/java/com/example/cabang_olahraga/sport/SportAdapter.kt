package com.example.cabang_olahraga.sport

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.cabang_olahraga.R
import com.example.submission2.sport.Sport

class SportAdapter (val listSport: ArrayList<Sport>) : RecyclerView.Adapter<SportAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(itemView: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(itemView.context)
            .inflate(R.layout.layout_sport, itemView,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSport.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val sport = listSport[position]

        Glide.with(holder.itemView.context)
            .load(sport.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = sport.name
        holder.tvDetail.text = sport.detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, SportDetail::class.java).apply {
                putExtra(SportDetail.EXTRA_NAME, sport.name)
                putExtra(SportDetail.EXTRA_PHOTO, sport.photo)
                putExtra(SportDetail.EXTRA_DETAIL, sport.detail)
            }
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}