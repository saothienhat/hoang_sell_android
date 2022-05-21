package com.saothienhat.hoagsell.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.saothienhat.hoagsell.model.AppConst;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> sloganText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        sloganText = new MutableLiveData<>();
        sloganText.setValue(AppConst.SLOGAN);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getSloganText() {
        return sloganText;
    }
}