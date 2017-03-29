package com.mouse.moon.disconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2017/3/28.
 */
public class AppMain {
    public static void main(String[] args)throws Exception {
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:disconf.xml");
        SimpleConfig  redis = (SimpleConfig )factory.getBean("simpleConfig");
        System.out.println(redis.getHost() + "\t================>\t" + redis.getPort());

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:disconf.xml"});
//        context.start();
//        SimpleConfig  redis = (SimpleConfig )context.getBean("simpleConfig");
//        System.out.println(redis.getHost() + "\t================>\t" + redis.getPort());
//        System.in.read();
    }
}
