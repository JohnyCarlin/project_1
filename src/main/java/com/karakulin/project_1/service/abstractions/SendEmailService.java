package com.karakulin.project_1.service.abstractions;

import com.karakulin.project_1.model.UserAccount;

import javax.mail.MessagingException;

public interface SendEmailService {

    void confirmAccount(UserAccount user, String url) throws MessagingException;

    void confirmAccount1ClickReg(UserAccount user, String password, String login, String url) throws MessagingException;

}