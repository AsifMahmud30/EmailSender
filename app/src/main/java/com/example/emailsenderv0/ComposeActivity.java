package com.example.emailsenderv0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ComposeActivity extends AppCompatActivity {

    EditText receiverAddress, subject,composeEmail;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        receiverAddress=findViewById(R.id.receiverAddress);
        subject=findViewById(R.id.subject);
        composeEmail=findViewById(R.id.composeEmail);

    }

    public void buttonSendEmail(View view){

        try {
            String stringSenderEmail = "infinitydomain43@gmail.com";
            String stringPasswordSenderEmail = "infinity1234";
            String stringReceiverEmail = receiverAddress.getText().toString();
            String stringSubject = subject.getText().toString();
            String stringEmail = composeEmail.getText().toString();

            String stringHost = "smtp.gmail.com";

            Properties properties = System.getProperties();

            properties.put("mail.smtp.host", stringHost);
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");

            javax.mail.Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);


                }
            });

            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));

            mimeMessage.setSubject(stringSubject);
            mimeMessage.setText(stringEmail);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Transport.send(mimeMessage);
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();


        } catch (MessagingException e) {
            e.printStackTrace();
        }

        Toast.makeText(getApplicationContext(),
                "Mail Sent",
                Toast.LENGTH_LONG)
                .show();
        Intent detailsActivity = new Intent(ComposeActivity.this, MainActivity.class);
        startActivity(detailsActivity);
    }

    public void backButton(View view){
        Intent detailsActivity = new Intent(ComposeActivity.this, MainActivity.class);
        startActivity(detailsActivity);
    }

}