package com.quxionglie.tsm.service;

import com.quxionglie.tsm.model.User;
import com.quxionglie.tsm.util.PageQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author: xionglie.qu
 * Date:   2015-05-31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-config.xml"})
public class UserServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void testGetByUsername() throws Exception {
        User u1 = insertUser();

        User u2 = userService.getByUsername(u1.getUsername());
        assertEquals(u1.getUid(), u2.getUid());
        assertEquals(u1.getUsername(), u2.getUsername());
    }

    @Test
    public void testGetByPk() throws Exception {
        User u1 = insertUser();

        User u2 = userService.getByPk(u1.getUid());
        assertEquals(u1.getUid(), u2.getUid());
        assertEquals(u1.getUsername(), u2.getUsername());
    }

    private User insertUser() {
        User u1 = createUser();
        userService.insert(u1);
        return u1;
    }

    @Test
    public void testInsert() throws Exception {
        User user = createUser();
        int row = userService.insert(user);
        assertTrue(row > 0);
        assertTrue(user.getUid() > 0);
    }

    private User createUser() {
        User user = new User();
        user.setUsername("u_" + System.currentTimeMillis());
        user.setPassword("pwd");
        return user;
    }

    @Test
    public void testUpdate() throws Exception {
        User u1 = createUser();
        userService.insert(u1);

        u1.setUsername(u1.getUsername() + "_update");
        int row = userService.update(u1);
        assertTrue(row > 0);


        User u2 = userService.getByPk(u1.getUid());
        assertEquals(u1.getUid(), u2.getUid());
        assertEquals(u1.getUsername(), u2.getUsername());
    }

    @Test
    public void testDeleteByPk() throws Exception {
        User u1 = createUser();
        userService.insert(u1);

        int row = userService.deleteByPk(u1.getUid());
        assertTrue(row > 0);

    }

    @Test
    public void testFindPage() throws Exception {
        PageQuery pageQuery = new PageQuery();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", "ccc");

        pageQuery.setParams(params);
        List<User> users = userService.findPage(pageQuery);
        assertTrue(users.size()==0);
    }
}