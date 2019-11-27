package com.xh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.entity.SysUser;
import com.xh.service.SysUserService;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 * @author xiaohe
 * @since 2019-06-04
 */
@RestController
@RequestMapping("/sysuser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/1")
    public SysUser findUserByFirstDb(long id) {
        return this.sysUserService.findUserByFirstDb(id);
    }

    @RequestMapping("/2")
    public SysUser findUserBySecondDb(long id) {
        return this.sysUserService.findUserBySecondDb(id);
    }
}
