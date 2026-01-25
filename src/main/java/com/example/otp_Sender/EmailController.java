package com.example.otp_Sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-mail")
    public String sendMail(@RequestBody MailRequest req) {
        emailService.send(req.getTo(), req.getSubject(), req.getText());
        return "Email sent successfully!";
    }


}
