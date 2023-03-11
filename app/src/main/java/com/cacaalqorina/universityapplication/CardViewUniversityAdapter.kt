package com.cacaalqorina.universityapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cacaalqorina.universityapplication.UniversityDetailPageActivity.Companion.EXTRA_UNIVERSITY

class CardViewUniversityAdapter (private val listUniversity: ArrayList<University>) :
    RecyclerView.Adapter<CardViewUniversityAdapter.CardViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewUniversityAdapter.CardViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_university, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewUniversityAdapter.CardViewHolder, position: Int) {
        val university = listUniversity[position]

        Glide.with(holder.itemView.context)
            .load(university.cover)
            .apply(RequestOptions().override(350, 550))
            .into(holder.ivCover)

        holder.tvName.text = university.name
        holder.tvAddress.text = university.address


        holder.btnDetail.setOnClickListener { v ->
            val intent = Intent(v.context, UniversityDetailPageActivity::class.java)
            intent.putExtra(EXTRA_UNIVERSITY, university)
            v.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return listUniversity.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivCover: ImageView = itemView.findViewById(R.id.iv_universityPhoto)
        var tvName: TextView = itemView.findViewById(R.id.tv_universityName)
        var tvAddress: TextView = itemView.findViewById(R.id.tv_universityAddress)
        var btnDetail: Button = itemView.findViewById(R.id.bt_detail)
    }

}

