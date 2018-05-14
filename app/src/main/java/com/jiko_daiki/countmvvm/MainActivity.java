package com.jiko_daiki.countmvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jiko_daiki.countmvvm.ViewModel.CountViewModel;
import com.jiko_daiki.countmvvm.databinding.ActivityMainBinding;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {
    private CountViewModel countViewModel;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        countViewModel = new CountViewModel();
        activityMainBinding.setCountViewModel(countViewModel);
    }
}
