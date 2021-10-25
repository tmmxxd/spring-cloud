package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

/**
 * 用户服务
 *
 * @author tsz
 * @date 2021/10/25
 */
public interface UserService {
    /**
     * 模拟根据用户id获取用户
     *
     * @param id id
     * @return {@link User}
     */
    User getUser(Integer id);

    /**
     * 添加分数
     *
     * @param id    用户id
     * @param score 分数
     */
    void addScore(Integer id, Integer score);
}

