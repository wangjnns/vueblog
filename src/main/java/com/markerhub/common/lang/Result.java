package com.markerhub.common.lang;

import java.io.Serializable;

/**
 * @Author 王晋南
 * @Date 2020/6/5
 */
public class Result implements Serializable {
    private  int code;//200是正常,非200表示异常
    private String msg;
    private Object data;

}
