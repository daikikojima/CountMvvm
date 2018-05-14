package com.jiko_daiki.countmvvm.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.jiko_daiki.countmvvm.Model.CountModel;
import com.jiko_daiki.countmvvm.ViewModel.util.ButtonTag;


public class CountViewModel extends BaseObservable {
    public CountModel countModel;

    public CountViewModel() {
        countModel = new CountModel();
        notifyChange();
    }

    @Bindable
    public int getCount() {
        return countModel.getCount();
    }

    public void setCount(int count) {
        countModel.setCount(count);
    }

    public void update(ButtonTag tag) {
        switch (tag) {
            case ADD:
                countModel.increment();
                break;
            case MINUS:
                countModel.decrement();
        }
        notifyChange();
    }
}