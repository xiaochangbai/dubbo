package org.apache.dubbo.demo;

import org.apache.dubbo.config.annotation.Argument;

import java.io.Serializable;


public interface CallBackService extends Serializable {

    String sayHelloCallback(String name, CallBack callBack);

}
