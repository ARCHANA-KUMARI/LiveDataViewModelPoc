package com.example.viewmodelpoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.model.Employee;
import com.example.model.User;
import com.example.viewmodelpoc.databinding.ActivityMainBinding;
import com.example.viewmodelpoc.viewmodel.UserModel;
import com.example.workerthread.LiveDataInWorkerThread;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    private UserModel mUserModel;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUserModel = new ViewModelProvider(this).get(UserModel.class);
        mBinding.setUserModel(mUserModel);

        User user = new User();
        user.setmID("1");
        user.setmName("Archana");
        mUserModel.addUser(user);
        try {
            //To check live data set value overriden
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        User user1 = new User();
        user1.setmID("2");
        user1.setmName("Ragini");
        mUserModel.addUser(user1);

        mUserModel.getUserLiveData().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                Log.i(TAG, " User onChanged: user" + user);
                if (user != null) {

                }
            }
        });

        // Live data demo in Background thread
        LiveDataInWorkerThread liveDataInWorkerThread = new LiveDataInWorkerThread();
        liveDataInWorkerThread.getLiveData().observe(this, new Observer<Employee>() {
            @Override
            public void onChanged(Employee employee) {
                Log.i(TAG, "Employee onChanged: " + employee);
            }
        });

        new Thread(liveDataInWorkerThread).start();

    }


}