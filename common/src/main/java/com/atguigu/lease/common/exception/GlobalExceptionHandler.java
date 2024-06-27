package com.atguigu.lease.common.exception;

import com.atguigu.lease.common.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 彭文斌
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //当前方法负责Exception异常，又因为其是父类，因此该方法是可以捕获到所有异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handler(Exception e){

        e.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(LeaseException.class)
    @ResponseBody
    public Result handler(LeaseException e){

        e.printStackTrace();
        return Result.fail(e.getCode(),e.getMessage());
    }
}
