package com.dlxcapp.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.github.pagehelper.PageInfo;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result genSuccessResult(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
    public static Result genListResult(PageInfo pageInfo){
    	return new Result()
                .setCode(ResultCode.CODE0)
                .setCount(pageInfo.getTotal())
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(pageInfo.getList());
    }
    public static Result genListSuccessResult(PageInfo pageInfo){
    	return new Result()
                .setCode(ResultCode.SUCCESS)
                .setCount(pageInfo.getTotal())
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(pageInfo.getList());
    }
    public static void outJSONString(String json){
    	HttpServletResponse response = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
    	response.setCharacterEncoding("UTF-8");  
        response.setContentType("application/json; charset=utf-8");  
        PrintWriter out = null; 
    	try {
    		out = response.getWriter();
    		out.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {  
	        if (out != null) {  
	            out.close();  
	        }  
	    }  
    	
    }
}
