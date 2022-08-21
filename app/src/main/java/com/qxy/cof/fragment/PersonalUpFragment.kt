package com.qxy.cof.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.qxy.cof.R

class PersonalUpFragment : Fragment(){
    val data : DataPersonal = TODO()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.per_up_frag, container, false)
        val touxiang : ImageView = view.findViewById(R.id.imageView)
        touxiang.setImageBitmap(data.touxiang)
        val nickname : TextView = view.findViewById(R.id.nickname)
        nickname.text = data.nickname
        return view
    }
}