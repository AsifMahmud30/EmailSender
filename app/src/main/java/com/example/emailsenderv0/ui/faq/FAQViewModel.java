package com.example.emailsenderv0.ui.faq;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FAQViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FAQViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Q.What does our application do?" +
                "\nA.It is a Gmail sender app based on the Android operating system.You can send emails through our application." +
                "\n\nQ.What else this application can do?" +
                "\nA.Currently our application is only capable of sending emails." +
                "\n\nQ.What features will be available in the future." +
                "\nA.We will be adding database system, email receiving and custom smtp port selection in the future.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}