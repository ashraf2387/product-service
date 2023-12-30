package com.dailycodebuffer.productService.exception;

import lombok.Getter;

@Getter
public class ProductServiceCustomException extends RuntimeException {
    private final String errorCode;

    public ProductServiceCustomException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }
}
