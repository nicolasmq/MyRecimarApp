package com.nicolasmartinez.myrecimarapp.ui.withdrawalRegister;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicolasmartinez.myrecimarapp.R;

public class RegisterFormFragment extends Fragment {

    private RegisterFormViewModel mViewModel;

    public static RegisterFormFragment newInstance() {
        return new RegisterFormFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.register_form_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RegisterFormViewModel.class);
        // TODO: Use the ViewModel
    }

}
