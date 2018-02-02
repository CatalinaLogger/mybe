package com.core.handle;

import com.core.util.MybeException;
import com.core.util.Result;
import com.core.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof MybeException){
            MybeException me = (MybeException) e;
            return ResultUtil.error(me.getCode(),me.getMessage());
        }else{
            return ResultUtil.error(-1,e.getMessage());
        }

    }
}
