package cn.tedu.web.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie 操作工具类
 *
 * @author tsz
 * @date 2021/10/25
 */
public class CookieUtil {

    /**
     * 设置Cookie
     *
     * @param response 响应
     * @param name     Cookie名字
     * @param value    Cookie值
     * @param domain   可以访问该Cookie的域名
     * @param path     生效路径
     * @param maxAge   Cookie存活时间
     */
    public static void setCookie(HttpServletResponse response,
                                 String name, String value, String domain, String path, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        if (domain != null) {
            cookie.setDomain(domain);
        }
        cookie.setPath(path);
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     * 设置Cookie
     *
     * @param response 响应
     * @param name     Cookie名字
     * @param value    Cookie值
     * @param maxAge   Cookie存活时间
     */
    public static void setCookie(HttpServletResponse response, String name, String value, int maxAge) {
        setCookie(response, name, value, null, "/", maxAge);
    }

    /**
     * 设置Cookie
     *
     * @param response 响应
     * @param name     Cookie名字
     * @param value    Cookie值
     */
    public static void setCookie(HttpServletResponse response, String name, String value) {
        setCookie(response, name, value, null, "/", 3600);
    }

    /**
     * 设置Cookie
     *
     * @param response 响应
     * @param name     Cookie名字
     */
    public static void setCookie(HttpServletResponse response, String name) {
        setCookie(response, name, "", null, "/", 3600);
    }

    /**
     * 把Cookie
     *
     * @param request 请求
     * @param name    Cookie名字
     * @return {@link String}
     */
    public static String getCookie(HttpServletRequest request, String name) {
        String value = null;
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    value = cookie.getValue();
                }
            }
        }
        return value;
    }

    /**
     * 删除Cookie
     *
     * @param response 响应
     * @param name     Cookie名字
     * @param domain   可以访问该Cookie的域名
     * @param path     生效路径
     */
    public static void removeCookie(HttpServletResponse response, String name, String domain, String path) {
        setCookie(response, name, "", domain, path, 0);
    }

}
