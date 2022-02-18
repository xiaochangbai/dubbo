package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.demo.CallBack;
import org.apache.dubbo.demo.CallBackService;

import java.io.Serializable;

public class Call implements CallBack, Serializable {
    @Override
    public void call(String name) {
        System.out.println("aha哦");
    }
}
