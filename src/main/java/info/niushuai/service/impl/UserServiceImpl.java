package info.niushuai.service.impl;

import info.niushuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by niushuai on 13/01/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(String name, Integer age) {
        return jdbcTemplate.update("insert into USER(NAME,AGE) values(?,?)", name, age);
    }

    @Override
    public int deleteByName(String name) {
        return jdbcTemplate.update("delete from user where name =  ?", name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from user", Integer.class);
    }

}
