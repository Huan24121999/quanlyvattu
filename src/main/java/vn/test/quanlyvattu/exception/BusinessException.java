package vn.test.quanlyvattu.exception;

public class BusinessException extends RuntimeException {
    private String code;
    private String message;

    public BusinessException(String message, String code) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
