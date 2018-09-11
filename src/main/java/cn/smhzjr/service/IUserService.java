package cn.smhzjr.service;
import cn.smhzjr.model.User;
/**
 * @author smh
 * @version V1.0
 * @description
 * @date 2018/8/13 16:53
 */
public interface IUserService {
    User selectUser(long userId);
}
