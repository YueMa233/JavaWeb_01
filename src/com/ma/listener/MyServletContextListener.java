package com.ma.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyServletContextListener implements ServletContextListener {
    @Override
    //监听Context域对象创建
    public void contextInitialized(ServletContextEvent sce) {
        //就是被监听的对象
        ServletContext servletContext = sce.getServletContext();
        //通用方法
        ServletContext source = (ServletContext)sce.getSource();

        System.out.println("Context创建了...");
        //开启一个计息任务调度---每晚12点计息一次
        Timer timer = new Timer();

        //修改为真实银行计息
        //1.起始时间：当晚12点
        //2.间隔时间：24小时
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String currentTime = "2018-10-04 00:00:00";
        Date parse = null;
        try {
             parse = format.parse(currentTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("银行计息了...");
            }
        }, parse, 24*60*60*1000);

    }

    @Override
    //监听Context域对象销毁
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context销毁了...");
    }
}
