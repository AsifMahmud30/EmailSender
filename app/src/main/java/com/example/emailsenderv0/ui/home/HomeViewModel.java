package com.example.emailsenderv0.ui.home;

import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    String recipientEmail, subject;

    public HomeViewModel(String subject,String recipientEmail) {
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}