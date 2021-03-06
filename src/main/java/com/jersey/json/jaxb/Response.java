package com.jersey.json.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author landyl
 * @date 2/23/2018 9:19 AM
 */
@XmlRootElement
public class Response {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
