package org.lxh.mvcdemo.dao;
import org.lxh.mvcdemo.vo.User;
public interface IUserDAO {
    /**
     * 用户登录验证
     * @author smallyu
     * @version 1.0
     */
    public boolean findLogin(User user) throws Exception;
}