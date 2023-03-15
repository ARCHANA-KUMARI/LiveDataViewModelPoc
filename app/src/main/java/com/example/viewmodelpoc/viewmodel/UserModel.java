package com.example.viewmodelpoc.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.model.User;

/**
 * @Author: Archana Kumari
 * @Date: 26-01-2023
 */
public class UserModel  extends ViewModel {
    public UserModel() {
    }

    public MutableLiveData<User> getUserLiveData() {
        return userLiveData;
    }
    private final MutableLiveData<User> userLiveData = new MutableLiveData<>();

    public void addUser(User user){
        if(user != null){
           // userLiveData.setValue(user);
            userLiveData.postValue(user);
        }
    }
}
