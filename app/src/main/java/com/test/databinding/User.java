package com.test.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by lady_zhou on 2018/1/23.
 */

public class User extends BaseObservable {
    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.test.databinding.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.test.databinding.BR.lastName);
    }
}
