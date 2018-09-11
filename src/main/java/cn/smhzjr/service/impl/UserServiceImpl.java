package cn.smhzjr.service.impl;

import cn.smhzjr.dao.IUserDao;
import cn.smhzjr.service.IUserService;
import org.springframework.stereotype.Service;
import cn.smhzjr.model.User;
import javax.annotation.Resource;

/**
 * @author smh
 * @version V1.0
 * @description
 * @date 2018/8/13 16:54
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
