package com.xsuperman.basic.common

import androidx.viewpager.widget.ViewPager

class ViewPagerListener(private val onPageChangedAction: (Int) -> Unit) : ViewPager.OnPageChangeListener {
    var currentPosition = 0

    override fun onPageScrollStateChanged(state: Int) {
        if (state == ViewPager.SCROLL_STATE_IDLE) {
            onPageChangedAction(currentPosition)
        }
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        currentPosition = position
    }

    override fun onPageSelected(position: Int) {
        currentPosition = position
    }

}