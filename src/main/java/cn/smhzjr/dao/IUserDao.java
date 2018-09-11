package cn.smhzjr.dao;


import cn.smhzjr.model.User;

/**
 * @author smh
 * @version V1.0
 * @description
 * @date 2018/8/13 16:52
 */
public interface IUserDao {
    User selectUser(long id);
}
