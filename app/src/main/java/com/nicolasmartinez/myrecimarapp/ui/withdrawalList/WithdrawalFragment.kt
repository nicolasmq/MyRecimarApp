package com.nicolasmartinez.myrecimarapp.ui.withdrawalList

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nicolasmartinez.myrecimarapp.R

class WithdrawalFragment : Fragment() {

    companion object {
        fun newInstance() = WithdrawalFragment()
    }

    private lateinit var viewModel: WithdrawalViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.withdrawal_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WithdrawalViewModel::class.java)
        // TODO: Use the ViewModel
    }

}