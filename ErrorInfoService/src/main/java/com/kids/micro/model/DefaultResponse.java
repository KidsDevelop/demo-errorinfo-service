package com.kids.micro.model;

import java.io.Serializable;

public class DefaultResponse implements Serializable {

    private static final long serialVersionUID = 3187502631101148198L;

    private String errorCode;
    private String errorMessageTh;
    private String errorMessageEn;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessageTh() {
        return errorMessageTh;
    }

    public void setErrorMessageTh(String errorMessageTh) {
        this.errorMessageTh = errorMessageTh;
    }

    public String getErrorMessageEn() {
        return errorMessageEn;
    }

    public void setErrorMessageEn(String errorMessageEn) {
        this.errorMessageEn = errorMessageEn;
    }
}
