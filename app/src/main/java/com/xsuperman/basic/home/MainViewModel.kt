package com.xsuperman.basic.home

import androidx.lifecycle.ViewModel
import com.xsuperman.basic.R
import com.xsuperman.basic.home.dashboard.DashboardFragment
import com.xsuperman.basic.home.home.HomeFragment
import com.xsuperman.basic.home.home.PageContent
import com.xsuperman.basic.home.mine.MineFragment
import com.xsuperman.basic.home.work.WorkFragment

class MainViewModel : ViewModel() {

    val pageContents = listOf(
        PageContent(R.id.navigation_home) {
            HomeFragment.newInstance(
                1
            )
        },
        PageContent(R.id.navigation_dashboard) { DashboardFragment.newInstance() },
        PageContent(R.id.navigation_notifications) { WorkFragment.newInstance("a", "b") },
        PageContent(R.id.navigation_mine) { MineFragment.newInstance("a", "b") }
    )
}