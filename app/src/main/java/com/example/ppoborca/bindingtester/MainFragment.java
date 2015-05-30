package com.example.ppoborca.bindingtester;

import android.app.Activity;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ppoborca.bindingtester.base.BindableEditText;
import com.example.ppoborca.bindingtester.base.BinderFragment;
import com.example.ppoborca.bindingtester.databinding.MainFragmentBinding;
import com.example.ppoborca.bindingtester.databinding.RenamedBinding;
import com.example.ppoborca.bindingtester.models.UserModel;

public class MainFragment extends BinderFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        final UserModel model = (UserModel) getBinderActivity().findObservable(MainActivity.USERMODEL);

        getFragmentBinding().setUser(model);

        getFragmentBinding().button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentBinding().getUser().setPowerLevel(getFragmentBinding().getUser().getPowerLevel() + 1);
            }
        });

        getFragmentBinding().text.addObserveable(model.getFirstName(),
                new BindableEditText.ShortTextWatcher(){
                    @Override
                    public void afterTextChanged(Editable editable) {
                        model.setFirstName(editable.toString());
                    }
                });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);
    }

    private MainFragmentBinding getFragmentBinding() {
        return ((MainFragmentBinding) mBinding);
    }
}
