package com.aditech.docmo.home.dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aditech.docmo.R
import com.aditech.docmo.model.Tips
import com.bumptech.glide.Glide

class TipsAdapter(private var data : List<Tips>,
                  private var listener: (Tips) -> Unit)
    : RecyclerView.Adapter<TipsAdapter.ViewHolder>() {

    lateinit var contextAdapter : Context

    override fun onCreateViewHolder (
        parent: ViewGroup,
        viewType: Int
    ): TipsAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        contextAdapter = parent.context
        val inflatedView = layoutInflater.inflate(R.layout.row_item_tips, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: TipsAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position], listener, contextAdapter)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val tvTitle: TextView = view.findViewById(R.id.tv_judul)
        private val ivImage: ImageView = view.findViewById(R.id.iv_poster_image)

        fun bindItem(data: Tips, listener: (Tips) -> kotlin.Unit, context: Context) {
            tvTitle.setText(data.judul)
            Glide.with(context)
                .load(data.poster)
                .into(ivImage)

            itemView.setOnClickListener{
                listener(data)
            }
        }
    }
}
