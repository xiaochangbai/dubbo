package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.CallBack;
import org.apache.dubbo.demo.CallBackService;

public class CallBackServiceImpl implements CallBackService {
    @Override
    public String sayHelloCallback(String name, CallBack callBack) {
        callBack.call(name+"testa");
        return "肖某人-"+name;
    }
}
