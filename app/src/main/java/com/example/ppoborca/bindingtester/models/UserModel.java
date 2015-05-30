package com.example.ppoborca.bindingtester.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class UserModel extends BaseObservable {

    @Bindable
    private String firstName;

    @Bindable
    private String lastName;

    @Bindable
    private int powerLevel;

    public UserModel(String firstName, String lastName, int powerLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerLevel = powerLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        notifyPropertyChanged(com.example.ppoborca.bindingtester.BR.firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        notifyPropertyChanged(com.example.ppoborca.bindingtester.BR.lastName);
        this.lastName = lastName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        notifyPropertyChanged(com.example.ppoborca.bindingtester.BR.powerLevel);
        this.powerLevel = powerLevel;
    }
}
