package com.xsuperman.basic.home.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.xsuperman.basic.R
import com.xsuperman.basic.home.dummy.DummyContent
import kotlinx.android.synthetic.main.home_fragment_home_list.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_fragment_home_list, container, false)

        with(recyclerView) {
            layoutManager = LinearLayoutManager(context)
            adapter = HomeRecyclerViewAdapter(DummyContent.ITEMS)
        }
        return view
    }

}
