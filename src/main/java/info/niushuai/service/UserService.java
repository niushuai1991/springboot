package info.niushuai.service;

import info.niushuai.domain.User;

/**
 * Created by niushuai on 13/01/2017.
 */
public interface UserService {


    void create(String name, Integer age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();

}
