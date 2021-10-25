package cn.tedu.sp03.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.service.UserService;
import cn.tedu.web.util.JsonResult;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * 用户控制器
 *
 * @author tsz
 * @date 2021/10/25
 */
@Slf4j
@RestController
@SuppressWarnings("rawtypes")
public class UserController {

    /**
     * 用户服务
     */
    @Resource
    private UserService userService;

    /**
     * 获取用户
     *
     * @param userId 用户id
     * @return {@link JsonResult}<{@link User}>
     */
    @GetMapping("/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId) {
        log.info("get user, userId=" + userId);
        User u = userService.getUser(userId);
        return JsonResult.ok(u);
    }

    /**
     * 添加分数
     *
     * @param userId 用户id
     * @param score  分数
     * @return {@link JsonResult}
     */
    @GetMapping("/{userId}/score")
    public JsonResult addScore(
            @PathVariable Integer userId, Integer score) {
        userService.addScore(userId, score);
        return JsonResult.ok();
    }
}

