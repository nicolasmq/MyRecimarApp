package com.nicolasmartinez.myrecimarapp.ui.registerVoucher

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nicolasmartinez.myrecimarapp.R

class VoucherRegisterFragment : Fragment() {

    companion object {
        fun newInstance() = VoucherRegisterFragment()
    }

    private lateinit var viewModel: VoucherRegisterViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.voucher_register_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VoucherRegisterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}