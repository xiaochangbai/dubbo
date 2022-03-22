package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.RestDemoService;
import org.apache.dubbo.demo.vo.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author xiaochangbai
 * @project dubbo-parent
 * @date 2022/3/22
 * @description
 */
@Path("users")
@Service(protocol = "p2")
public class RestDemoServiceImpl implements RestDemoService {

    @GET
    @Path("detail")
    @Produces({MediaType.APPLICATION_JSON}) //返回json格式
    @Override
    public Student sayHello(@QueryParam("name") String name) {
        Student student = new Student();
        student.setName(name);
        student.setOther("好好学习，天天向上!");
        return student;
    }
}
