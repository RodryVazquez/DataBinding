package com.example.databinding.Adapters;

import android.view.View;


public class MainActivityViewModelBindingAdapter {

    //@BindingAdapter("visible")
    public static void setVisibility(View view, boolean visibility) {
        if (visibility) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.INVISIBLE);
        }
    }
}
