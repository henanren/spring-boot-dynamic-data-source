package com.xh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xh.entity.SysUser;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 * @author xiaohe
 * @since 2019-06-04
 */
public interface SysUserService extends IService<SysUser> {

    SysUser findUserByFirstDb(long id);

    SysUser findUserBySecondDb(long id);

    int insertFirstDb(SysUser sysUser);

    int insertSecondDb(SysUser sysUser);
}
