package com.atguigu.lease.common.constant;

/**
 * Redis缓存键名及过期时间常量类
 * 统一管理项目中所有Redis缓存的键名前缀和时间设置
 */
public class RedisConstant {

    // 管理员登录相关缓存键
    public static final String ADMIN_LOGIN_PREFIX = "admin:login:";
    // 管理员登录验证码过期时间（秒）
    public static final Integer ADMIN_LOGIN_CAPTCHA_TTL_SEC = 60;

    // 应用端登录相关缓存键
    public static final String APP_LOGIN_PREFIX = "app:login:";
    // 应用端短信验证码重发间隔（秒）
    public static final Integer APP_LOGIN_CODE_RESEND_TIME_SEC = 60;
    // 应用端短信验证码有效期（秒）
    public static final Integer APP_LOGIN_CODE_TTL_SEC = 60 * 10;

    // 应用端房间数据缓存键
    public static final String APP_ROOM_PREFIX = "app:room:";
}