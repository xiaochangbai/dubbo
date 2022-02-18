package org.apache.dubbo.springboot.demo;

import java.io.Serializable;

public interface CallBack extends Serializable {

    String call(String text);

}
