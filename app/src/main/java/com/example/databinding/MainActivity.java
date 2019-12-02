package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.databinding.Models.UserModel;
import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mainActivityViewModel;
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mainBinding.setMainActivityViewModel(mainActivityViewModel);
        mainActivityViewModel.getUserModelMutableLiveData().observe(this, this::validateUser);

        mainBinding.setLifecycleOwner(this);

    }

    private void validateUser(UserModel userModel) {
        boolean cancel = false;
        View focusView = null;

        if (TextUtils.isEmpty(userModel.getPassword())) {
            mainBinding.edtPassword.setError("Password field is required");
            focusView = mainBinding.edtPassword;
            cancel = true;
        }

        if (TextUtils.isEmpty(userModel.getUserName())) {
            mainBinding.edtUserName.setError("Username is required");
            cancel = true;
            focusView = mainBinding.edtUserName;
        }

        if (cancel) {
            focusView.requestFocus();
        } else {
            mainBinding.txtErrorLegend.setText("Successfully Login");
        }
    }
}
