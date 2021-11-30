package com.alpha.alipay.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Result
{
    private String code;
    private String message;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {}

    public Result(Object data) {
        this.data = data;
    }

    public static Result success()
    {
        Result result = new Result();
        result.setCode("200");
        result.setMessage("Success");
        return result;
    }

    public static  Result success(Object data)
    {
        Result result = new Result(data);
        result.setCode("200");
        result.setMessage("Success");
        return result;
    }

    public static Result error(String code, String message)
    {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
