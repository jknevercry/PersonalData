package com.qxy.cof.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.qxy.cof.R
import com.qxy.cof.VideoAdapter

class PersonalLowFragment : Fragment() {
    private val videoList = ArrayList<Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        initVideos()
        val view = inflater.inflate(R.layout.per_low_frag, container, false)
        val recyclerView:RecyclerView = view.findViewById(R.id.recyclerView)
        val layoutManager = StaggeredGridLayoutManager(3,
            StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = VideoAdapter(videoList)
        recyclerView.adapter = adapter
        return view
    }
    private fun initVideos() {
        repeat(2) {
            videoList.add(R.drawable.apple_pic)
            videoList.add(R.drawable.banana_pic)
            videoList.add(R.drawable.orange_pic)
            videoList.add(R.drawable.pear_pic)
            videoList.add(R.drawable.grape_pic)
            videoList.add(R.drawable.pineapple_pic)
            videoList.add(R.drawable.strawberry_pic)
            videoList.add(R.drawable.cherry_pic)
            videoList.add(R.drawable.mango_pic)
        }
    }

}