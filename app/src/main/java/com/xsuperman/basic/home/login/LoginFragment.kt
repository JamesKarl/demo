package com.xsuperman.basic.home.login

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil

import com.xsuperman.basic.R
import com.xsuperman.basic.databinding.LoginFragmentBinding
import kotlinx.android.synthetic.main.login_fragment.*
import org.jetbrains.anko.support.v4.toast
import timber.log.Timber

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        val binding = DataBindingUtil.bind<LoginFragmentBinding>(view)

        binding?.user = viewModel.user

        button.setOnClickListener {
            Timber.d(viewModel.user.toString())
            toast("you clicked me. ${viewModel.user}")
        }
    }
}
