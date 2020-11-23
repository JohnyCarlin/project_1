package com.karakulin.project_1.service.abstractions;

import com.karakulin.project_1.model.RegistrationUserDTO;
import com.karakulin.project_1.model.UserAccount;
import org.hibernate.exception.ConstraintViolationException;


import java.util.List;


public interface UserAccountService {

    UserAccount findUserByToConfirmEmail(String token);

    UserAccount save(RegistrationUserDTO user, String url) throws ConstraintViolationException;

    boolean emailExist(String email);

    UserAccount save1Clickreg(RegistrationUserDTO user) throws ConstraintViolationException;

//    void sendMessageOneClickReg(UserAccount userAccount, String url, OrderDTO orderDTO, RegistrationUserDTO user);

    void setLocaleAndAuthDate(String email, String locale, long lastAuthDate);

    UserAccount save(UserAccount user);

    UserAccount getUserById(Long id);

    UserAccount update(UserAccount userAccount);

    UserAccount findByLogin(String login);

    List<String> getUsersEmailsByStatus(Boolean isEnabled);

//    String emailExistForShowError(ContactsOfOrderDTO contacts);

    Long getCartIdByUserEmail(String email);
}

