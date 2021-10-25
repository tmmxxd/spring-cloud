package cn.tedu.web.util;

import lombok.Getter;
import lombok.Setter;

/**
 * 结果封装对象
 *
 * @author tsz
 * @date 2021/10/25
 */
@Getter
@Setter
@SuppressWarnings("rawtypes")
public class JsonResult<T> {
    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 不登录
     */
    public static final int NOT_LOGIN = 400;

    /**
     * 异常
     */
    public static final int EXCEPTION = 401;

    /**
     * 系统错误
     */
    public static final int SYS_ERROR = 402;

    /**
     * 参数错误
     */
    public static final int PARAMS_ERROR = 403;

    /**
     * 不支持
     */
    public static final int NOT_SUPPORTED = 410;

    /**
     * 无效的验证码
     */
    public static final int INVALID_AUTH_CODE = 444;

    /**
     * 太频繁的
     */
    public static final int TOO_FREQUENT = 445;

    /**
     * 未知的错误
     */
    public static final int UNKNOWN_ERROR = 499;

    /**
     * 响应码
     */
    private int code;
    /**
     * 响应消息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;


    /**
     * 构建封装对象
     *
     * @return {@link JsonResult}
     */
    public static JsonResult build() {
        return new JsonResult();
    }

    /**
     * 构建封装对象
     *
     * @param code 响应码
     * @return {@link JsonResult}
     */
    public static JsonResult build(int code) {
        return new JsonResult().code(code);
    }

    /**
     * 构建封装对象
     *
     * @param code 响应码
     * @param msg  响应消息
     * @return {@link JsonResult}
     */
    public static JsonResult build(int code, String msg) {
        return new JsonResult<String>().code(code).msg(msg);
    }

    /**
     * 构建封装对象
     *
     * @param code 响应码
     * @param data 数据
     * @return {@link JsonResult}<{@link T}>
     */
    public static <T> JsonResult<T> build(int code, T data) {
        return new JsonResult<T>().code(code).data(data);
    }

    /**
     * 构建封装对象
     *
     * @param code 响应码
     * @param msg  响应消息
     * @param data 数据
     * @return {@link JsonResult}<{@link T}>
     */
    public static <T> JsonResult<T> build(int code, String msg, T data) {
        return new JsonResult<T>().code(code).msg(msg).data(data);
    }

    /**
     * 响应码
     *
     * @param code 响应码
     * @return {@link JsonResult}<{@link T}>
     */
    public JsonResult<T> code(int code) {
        this.code = code;
        return this;
    }

    /**
     * 响应消息
     *
     * @param msg 响应消息
     * @return {@link JsonResult}<{@link T}>
     */
    public JsonResult<T> msg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 数据
     *
     * @param data 数据
     * @return {@link JsonResult}<{@link T}>
     */
    public JsonResult<T> data(T data) {
        this.data = data;
        return this;
    }


    /**
     * 返回正确响应
     *
     * @return {@link JsonResult}
     */
    public static JsonResult ok() {
        return build(SUCCESS);
    }

    /**
     * 返回正确响应
     *
     * @param msg 响应消息
     * @return {@link JsonResult}
     */
    public static JsonResult ok(String msg) {
        return build(SUCCESS, msg);
    }

    /**
     * 返回正确响应
     *
     * @param data 数据
     * @return {@link JsonResult}<{@link T}>
     */
    public static <T> JsonResult<T> ok(T data) {
        return build(SUCCESS, data);
    }

    /**
     * 返回错误响应
     *
     * @return {@link JsonResult}
     */
    public static JsonResult err() {
        return build(EXCEPTION);
    }

    /**
     * 返回错误响应
     *
     * @param msg 响应消息
     * @return {@link JsonResult}
     */
    public static JsonResult err(String msg) {
        return build(EXCEPTION, msg);
    }

    /**
     * 重写toString输出
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        return JsonUtil.to(this);
    }
}
