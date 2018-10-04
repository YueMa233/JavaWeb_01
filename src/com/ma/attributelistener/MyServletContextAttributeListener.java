package com.ma.attributelistener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        //放到域中的name
        System.out.println(servletContextAttributeEvent.getName());
        //放到域中的value
        System.out.println(servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        //域中删除的name
        System.out.println(servletContextAttributeEvent.getName());
        //域中删除的value
        System.out.println(servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        //域中修改前的name
        System.out.println(servletContextAttributeEvent.getName());
        //域中修改前的value
        System.out.println(servletContextAttributeEvent.getValue());
    }
}
