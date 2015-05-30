package com.example.ppoborca.bindingtester.base;

import android.databinding.BaseObservable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.example.ppoborca.bindingtester.R;

import java.util.WeakHashMap;

/**
 * This is an activity which is meant to wrap any activity who's content view is a binder
 */
public class BinderActivity extends FragmentActivity{

    private WeakHashMap<String, BaseObservable> mObservables;
    public ViewDataBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mObservables = new WeakHashMap<>();
        mBinding = DataBindingUtil.setContentView(this, R.layout.main_activity);
    }

    public void addObserveable(String key, BaseObservable binding){
        mObservables.put(key, binding);
    }

    public void removeObservable(String key){
        mObservables.remove(key);
    }

    @Nullable
    public BaseObservable findObservable(String key){
        if(mObservables.containsKey(key)) {
          return mObservables.get(key);
        }
        return null;
    }

}
