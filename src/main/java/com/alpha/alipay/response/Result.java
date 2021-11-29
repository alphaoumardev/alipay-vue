package com.alpha.alipay.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
@Data
public class Result
{
    private String code;
    private String message;
    private Object data;

    public Result() {}

    public Result(Object data)
    {
        this.data = data;
    }
    @NotNull
    public static  Result success()
    {
        Result result = new Result();
        result.setCode("200");
        result.setMessage("success");
        return result;
    }

    @NotNull
    public static Result success(Object data)
    {
        Result result = new Result(data);
        result.setCode("200");
        result.setMessage("success");
        return result;
    }
    @NotNull
    public static  Result error(String code, String message)
    {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
