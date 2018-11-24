package com.xsuperman.basic.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.xsuperman.basic.R
import com.xsuperman.basic.db.objectbox.AppAccount
import com.xsuperman.basic.db.objectbox.appAccountStore
import kotlinx.android.synthetic.main.home_dashboard_fragment.*
import timber.log.Timber

class DashboardFragment : Fragment() {

    companion object {
        fun newInstance() = DashboardFragment()
    }

    private lateinit var viewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_dashboard_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DashboardViewModel::class.java)

        val testAccount = AppAccount(userId = "userA", password = "pww")
        appAccountStore.put(testAccount)
        Timber.d(testAccount.toString())
        hello.text = testAccount.toString()
        // TODO: Use the ViewModel
    }

}
