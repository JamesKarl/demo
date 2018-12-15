package com.xsuperman.basic.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.xsuperman.basic.R
import com.xsuperman.basic.common.ViewPagerListener
import com.xsuperman.basic.home.home.HomePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        setContentView(R.layout.activity_main)
        initViews()
        setCurrentPage(1)
    }

    private fun initViews() {
        with(viewPager) {
            adapter = HomePagerAdapter(mainViewModel.pageContents, supportFragmentManager)
            addOnPageChangeListener(ViewPagerListener { updateTab(mainViewModel.pageContents[it].first) })
        }

        with(navigation) {
            setOnNavigationItemSelectedListener { updateTabContent(it.itemId) }
        }
    }

    private fun setCurrentPage(index: Int) {
        if (index >= 0 && index < mainViewModel.pageContents.size) {
            val tabId = mainViewModel.pageContents[index].first
            updateTab(tabId)
            updateTabContent(tabId)
        }
    }

    private fun updateTab(tabId: Int) {
        navigation.selectedItemId = tabId
    }

    private fun updateTabContent(itemId: Int): Boolean {
        val pageContent = mainViewModel.pageContents.first { it.first == itemId }
        viewPager.setCurrentItem(mainViewModel.pageContents.indexOf(pageContent), true)
        return true
    }
}