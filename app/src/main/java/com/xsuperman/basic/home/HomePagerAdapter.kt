package com.xsuperman.basic.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import timber.log.Timber


typealias FragmentFactory = () -> Fragment

typealias PageContent = Pair<Int, FragmentFactory>


class HomePagerAdapter(private val pageContents: List<PageContent>, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        Timber.d("getItem called $position")
        return pageContents[position].second()
    }

    override fun getCount(): Int {
        return pageContents.size
    }

}