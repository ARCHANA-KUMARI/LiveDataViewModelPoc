package com.example.viewmodelpoc.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodelpoc.databinding.FragmentViewModelPocBinding;

public class ViewModelPocFragment extends Fragment {
    private FragmentViewModelPocBinding mModelPocBinding;

    public ViewModelPocFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mModelPocBinding = FragmentViewModelPocBinding.inflate(inflater, container, false);

        return mModelPocBinding.getRoot();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mModelPocBinding = null;
    }
}