package com.xh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xh.entity.SysUser;
import com.xh.service.SysUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDynamicCurDataSourceApplicationTests {

    @Autowired
    private SysUserService userService;

    // @Test
    public void contextLoads() {
        SysUser user = userService.getById(1);
        log.info(user.toString());
    }

    // @Test
    public void test1() {
        SysUser user = userService.findUserByFirstDb(1);
        log.info("第一个数据库 : [{}]", user.toString());
        SysUser user2 = userService.findUserBySecondDb(1);
        log.info("第二个数据库 : [{}]", user2.toString());
    }

    @Test
    public void test() {
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        int i = userService.insertFirstDb(user);
        log.info("第一个数据库 : [{}]", i);

        user = new SysUser();
        user.setUsername("lisi");
        int ii = userService.insertSecondDb(user);
        log.info("第二个数据库 : [{}]", ii);
    }
}
