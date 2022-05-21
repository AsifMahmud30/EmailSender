package com.example.emailsenderv0.ui.aboutus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutUsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("A simple email sending android application built with java.\n\nAuthors:\n    Name: Minar Mahmud Rafi\n   Email: minar.mahmud.cse@ulab.edu.bd\n   Name:Asif Mahmud\n  Email: asif.mahmud.cse@ulab.edu.bd");
    }

    public LiveData<String> getText() {
        return mText;
    }
}