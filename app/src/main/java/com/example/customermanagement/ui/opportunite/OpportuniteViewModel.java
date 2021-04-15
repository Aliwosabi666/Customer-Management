package com.example.customermanagement.ui.opportunite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OpportuniteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OpportuniteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is opportunite fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}