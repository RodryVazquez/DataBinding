package com.example.databinding.ViewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.databinding.Models.UserModel;

public class MainActivityViewModel extends ViewModel {

    public MutableLiveData<UserModel> userModelMutableLiveData;

    public MainActivityViewModel(){
        userModelMutableLiveData = new MutableLiveData<>();
    }

    public void loginUser(String userName, String password){
        if(userName != null && password != null){
            UserModel userModel = new UserModel();
            userModel.setUserName(userName);
            userModel.setPassword(password);
            userModelMutableLiveData.setValue(userModel);
        }

    }
}
