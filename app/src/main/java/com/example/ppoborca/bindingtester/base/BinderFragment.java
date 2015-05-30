package com.example.ppoborca.bindingtester.base;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ppoborca.bindingtester.R;

public class BinderFragment extends Fragment {

    public ViewDataBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);
        return mBinding.getRoot();
    }


    @Nullable
    public BinderActivity getBinderActivity(){
        return getActivity() instanceof BinderActivity
                ? ((BinderActivity)getActivity())
                : null;
    }

}
