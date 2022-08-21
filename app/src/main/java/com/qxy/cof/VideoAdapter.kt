package com.qxy.cof

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter(val videoList: List<Int>) : RecyclerView.Adapter<VideoAdapter.ViewHolder> (){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val videoImage: ImageView = view.findViewById(R.id.videoImage)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.video, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val videoID = videoList[position]
        holder.videoImage.setImageResource(videoID)
    }
    override fun getItemCount() = videoList.size
}