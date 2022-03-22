package org.apache.dubbo.demo.vo;

import java.io.Serializable;

/**
 * @author xiaochangbai
 * @project dubbo-parent
 * @date 2022/3/22
 * @description
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 6540986378219518531L;

    private String name;

    private String other;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
