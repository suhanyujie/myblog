package com.su.web.utils;

import lombok.Data;

@Data
public class Response<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> Response<T> success(T data) {
        Response<T> resp = new Response<>();
        resp.setCode(200);
        resp.setMsg("success");
        resp.setData(data);
        return resp;
    }

    public static <T> Response<T> error(String msg) {
        Response<T> resp = new Response<>();
        resp.setCode(1001);
        resp.setMsg(msg);
        return resp;
    }
}
