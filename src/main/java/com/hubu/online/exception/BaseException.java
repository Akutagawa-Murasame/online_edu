package com.hubu.online.exception;

/**
 * 业务异常
 */
public class BaseException extends IException {
    private static final long serialVersionUID = 5450935008012318697L;

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Integer code, String message) {
        super(code, message);
    }

    @Override
    public Integer getCode() {
        Integer code = super.getCode();
        if (code == null) {
            code = 500;
        }
        return code;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "系统错误";
        }
        return message;
    }
}
