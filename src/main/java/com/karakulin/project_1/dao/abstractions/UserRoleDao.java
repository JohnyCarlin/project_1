package com.karakulin.project_1.dao.abstractions;

import com.karakulin.project_1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRoleDao extends JpaRepository<Role, Long> {
    Role findUserRoleByRoleName(String roleName);
    List<Role> findByRoleName(String roleName);
}
