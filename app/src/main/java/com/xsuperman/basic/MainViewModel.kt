package com.xsuperman.basic

import androidx.lifecycle.ViewModel
import com.xsuperman.basic.home.*

class MainViewModel : ViewModel() {

    val pageContents = listOf(
        PageContent(R.id.navigation_home) { HomeFragment.newInstance(1) },
        PageContent(R.id.navigation_dashboard) { DashboardFragment.newInstance() },
        PageContent(R.id.navigation_notifications) { WorkFragment.newInstance("a", "b") },
        PageContent(R.id.navigation_mine) { MineFragment.newInstance("a", "b") }
    )
}