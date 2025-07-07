package com.atguigu.lease.common.exception;

import com.atguigu.lease.common.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * 统一捕获和处理控制器层抛出的异常，返回标准JSON响应
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 通用异常处理器
     * 处理所有未被其他处理器捕获的异常
     * @param e 捕获的异常对象
     * @return 统一错误响应结果
     */
    @ExceptionHandler(Exception.class)
    public Result handle(Exception e) {
        // 打印堆栈信息用于调试
        e.printStackTrace();
        // 返回默认失败结果（状态码500，错误信息"操作失败"）
        return Result.fail();
    }

    /**
     * 业务异常处理器
     * 处理项目自定义的业务异常LeaseException
     * @param e 业务异常对象
     * @return 包含自定义错误码和错误信息的响应结果
     */
    @ExceptionHandler(LeaseException.class)
    public Result handle(LeaseException e) {
        // 获取业务异常中自定义的错误码和错误信息
        String message = e.getMessage();
        Integer code = e.getCode();
        // 打印堆栈信息用于调试
        e.printStackTrace();
        // 返回自定义错误码和错误信息的结果
        return Result.fail(code, message);
    }
}
