package com.nicolasmartinez.myrecimarapp.ui.withdrawalsMade.withdrawResume;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicolasmartinez.myrecimarapp.R;

public class WithdrawResumeFragment extends Fragment {

    private WithdrawResumeViewModel mViewModel;

    public static WithdrawResumeFragment newInstance() {
        return new WithdrawResumeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.withdraw_resume_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(WithdrawResumeViewModel.class);
        // TODO: Use the ViewModel
    }

}