package com.jiko_daiki.countmvvm.Model;

public class CountModel {
    private int count;

    public CountModel() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }
}
