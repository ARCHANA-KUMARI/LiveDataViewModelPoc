package com.example.workerthread;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.model.Employee;
import com.example.model.User;

/**
 * @Author: Archana Kumari
 * @Date: 15-03-2023
 */
public class LiveDataInWorkerThread implements Runnable {
    private static String TAG = "ArchanaLiveDataInWorkerThread";
    public MutableLiveData<Employee> getLiveData() {
        return liveData;
    }

    private MutableLiveData<Employee> liveData = new MutableLiveData<Employee>();

    @Override
    public void run() {
        Log.i(TAG, "run: ");
        Employee employee = new Employee();
        employee.setmId("11");
        employee.setmName("Peter");
        addEmployee(employee);
    }

    public void addEmployee(Employee employee) {
        if (employee != null) {
            //liveData.setValue(employee);
            liveData.postValue(employee);
        }
    }
}
