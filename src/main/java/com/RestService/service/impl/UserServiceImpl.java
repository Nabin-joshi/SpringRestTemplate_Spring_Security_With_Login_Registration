package com.RestService.service.impl;

import com.RestService.model.Role;
import com.RestService.model.User;
import com.RestService.service.DbService;
import com.RestService.dao.UserDAO;
import com.RestService.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jdbi.v3.core.JdbiException;
import org.jdbi.v3.core.statement.UnableToExecuteStatementException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * {@code UserServiceImpl} is an implementation class of
 * {@link UserService} interface which does all the
 * user related CRUD operations.
 * @author Umesh Bhujel
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private  final DbService dbService;
    @Override
    public Optional<User> getUserByUsername(String username) {
        UserDAO userDao = dbService.getDao(UserDAO.class);
        User user = null;
        try {
            user = userDao.getUserByEmail(username).get();
        } catch(UnableToExecuteStatementException ex) {
            log.info("Exception occured: " + ex.getMessage());
        }

        if(user != null) {
            return Optional.of(user);
        }

        throw new UsernameNotFoundException("Incorrect Credentials!");
    }

    @Override
    public User getUserById(int userId) {
        UserDAO userDao = dbService.getDao(UserDAO.class);
        User user = null;
        try{
            user = userDao.getUserById(userId).get();
        } catch(UnableToExecuteStatementException ex){
            log.info("Exception occured " +ex.getMessage());
        }
        if(user != null){
            return user;
        }
        throw new UsernameNotFoundException("userId is not valid!");


    }

    @Override
    public int addUser(User user, int roleId) {
        UserDAO userDAO = dbService.getDao(UserDAO.class);
        int savedUserId =0;
        try{
            savedUserId = userDAO.addUserWithRole(user, roleId);
        } catch(JdbiException jdbiException){
            log.error("error occured while adding user");
        }
        return savedUserId;
    }



    @Override
    public List<Role> getAllRole() {
        UserDAO userDAO = dbService.getDao(UserDAO.class);
        return userDAO.getAllRole();
    }


}
