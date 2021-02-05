package com.niyati.mongodb.dao;

import com.niyati.mongodb.domain.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(String userId);

    User addNewUser(User user);

    Object getAllUserSettings(String userId);

    String getUserSetting(String userId, String key);

    String addUserSetting(String userId, String key, String value);
}
