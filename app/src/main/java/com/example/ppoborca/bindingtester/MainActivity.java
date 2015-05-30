package com.example.ppoborca.bindingtester;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.example.ppoborca.bindingtester.base.BinderActivity;
import com.example.ppoborca.bindingtester.databinding.RenamedBinding;
import com.example.ppoborca.bindingtester.models.UserModel;

public class MainActivity extends BinderActivity {


    public static final String USERMODEL =  "MainActivityUserModel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBinding().setUser(new UserModel("John", "Doe", 0));

        addObserveable(USERMODEL, getBinding().getUser());

        getBinding().button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getBinding().getUser().setPowerLevel(getBinding().getUser().getPowerLevel() + 1);
            }
        });

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,
                        new MainFragment()).commit();

    }

    public RenamedBinding getBinding() {
        return (RenamedBinding) mBinding;
    }

}
