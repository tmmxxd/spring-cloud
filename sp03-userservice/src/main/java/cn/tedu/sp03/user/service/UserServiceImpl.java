package cn.tedu.sp03.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.service.UserService;
import cn.tedu.web.util.JsonUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * UserServiceImpl
 *
 * @author tsz
 * @date 2021/10/25
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    /**
     * 用户json
     */
    @Value("${sp.user-service.users}")
    private String userJson;

    /**
     * 获取用户
     *
     * @param id id
     * @return {@link User}
     */
    @Override
    public User getUser(Integer id) {
        log.info("users json string : " + userJson);
        List<User> list = JsonUtil.from(userJson, new TypeReference<List<User>>() {
        });
        for (User u : list) {
            if (u.getId().equals(id)) {
                return u;
            }
        }

        return new User(id, "name-" + id, "pwd-" + id);
    }

    /**
     * 添加分数
     *
     * @param id    id
     * @param score 分数
     */
    @Override
    public void addScore(Integer id, Integer score) {
        // 这里增加积分
        log.info("user " + id + " - 增加积分 " + score);
    }

}
