package com.nicolasmartinez.myrecimarapp.ui.registerBinnacle

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nicolasmartinez.myrecimarapp.R

class BinnacleRegisterFragment : Fragment() {

    companion object {
        fun newInstance() = BinnacleRegisterFragment()
    }

    private lateinit var viewModel: BinnacleRegisterViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.binnacle_register_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BinnacleRegisterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}