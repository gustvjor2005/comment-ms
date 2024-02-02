package com.gtv.comment.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseMessage {

    @JsonProperty("status")
    private String status;

    @JsonProperty("detail")
    private String detail;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
