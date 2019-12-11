package com.example.databinding.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databinding.data.UserModel

class MainActivityViewModel : ViewModel() {
    var userModelMutableLiveData: MutableLiveData<UserModel>
    var userName = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    fun loginUser() {
        val userModel = UserModel(userName.value!!, password.value!!)
        userModelMutableLiveData.value = userModel
    }

    init {
        userModelMutableLiveData = MutableLiveData()
    }
}