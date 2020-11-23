package com.karakulin.project_1.dao.abstractions;

import com.karakulin.project_1.model.UserAccount;
import com.karakulin.project_1.model.UserDTO;
import com.karakulin.project_1.model.UserDTONewPassword;

public interface UserAccountDao extends GenericDao<Long, UserAccount> {
        UserDTO getUserByEmail(String email);

        void saveUserDTOPersonalInformation(UserDTO userDTO);

        boolean checkEmailFromOtherUsers(String email, long id);

        void saveUserDTOPassword(UserDTONewPassword userDTONewPassword);

        String getOldPassword(long id);
        }