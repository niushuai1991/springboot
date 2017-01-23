package info.niushuai.service;

import info.niushuai.domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by niushuai on 13/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Before
    public void setUp() {
        // 准备，清空user表
        //userService.deleteAllUsers();
    }
    @Test
    public void test() throws Exception {
        int count = userService.getAllUsers();
        // 插入5个用户
        userService.create("a", 1);
        userService.create("b", 2);
        userService.create("c", 3);
        userService.create("d", 4);
        userService.create("e", 5);

        // 查数据库，应该有5个用户
        Assert.assertEquals(count+5, userService.getAllUsers().intValue());
        // 删除两个用户
        userService.deleteByName("a");
        userService.deleteByName("e");
        // 查数据库，应该有5个用户
        Assert.assertEquals(count-3, userService.getAllUsers().intValue());

        userService.deleteByName("b");
        userService.deleteByName("c");
        userService.deleteByName("d");

        Assert.assertEquals(count, userService.getAllUsers().intValue());
    }

}
