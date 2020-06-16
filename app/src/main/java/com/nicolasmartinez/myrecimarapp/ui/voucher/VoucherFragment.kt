package com.nicolasmartinez.myrecimarapp.ui.voucher

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nicolasmartinez.myrecimarapp.R

class VoucherFragment : Fragment() {

    companion object {
        fun newInstance() = VoucherFragment()
    }

    private lateinit var viewModel: VoucherViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.voucher_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VoucherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}