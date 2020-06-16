package com.nicolasmartinez.myrecimarapp.ui.binnacle

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nicolasmartinez.myrecimarapp.R

class BinnacleFragment : Fragment() {

    companion object {
        fun newInstance() = BinnacleFragment()
    }

    private lateinit var viewModel: BinnacleViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.binnacle_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BinnacleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}