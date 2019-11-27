package com.xh.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xh.datasource.CurDataSource;
import com.xh.datasource.DataSourceNames;
import com.xh.entity.SysUser;
import com.xh.mapper.SysUserMapper;
import com.xh.service.SysUserService;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 * @author xiaohe
 * @since 2019-06-04
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @CurDataSource(name = DataSourceNames.SECOND)
    @Override
    public SysUser findUserBySecondDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @Override
    public int insertFirstDb(SysUser sysUser) {
        return this.baseMapper.insert(sysUser);
    }

    @CurDataSource(name = DataSourceNames.SECOND)
    @Override
    public int insertSecondDb(SysUser sysUser) {
        return this.baseMapper.insert(sysUser);
    }

}
