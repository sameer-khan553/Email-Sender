package com.example.otp_Sender;


import lombok.Data;

@Data
public class MailRequest {

    private String to;
    private String subject;
    private String text;
}
