package com.xsuperman.basic.home.mine


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.xsuperman.basic.R
import kotlinx.android.synthetic.main.mine_fragment_mine.*

class MineFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.mine_fragment_mine, container, false)
    }
}
