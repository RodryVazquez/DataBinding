package com.example.databinding.ui.adapters;

import android.view.View;

import androidx.databinding.BindingAdapter;


public class MainActivityViewModelBindingAdapter {

    @BindingAdapter("visible")
    public static void setVisibility(View view, boolean visibility) {
        if (visibility) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.INVISIBLE);
        }
    }
}
