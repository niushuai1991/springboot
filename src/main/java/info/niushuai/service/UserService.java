package info.niushuai.service;

/**
 * Created by niushuai on 13/01/2017.
 */
public interface UserService {


    int create(String name, Integer age);

    int deleteByName(String name);

    Integer getAllUsers();

}
