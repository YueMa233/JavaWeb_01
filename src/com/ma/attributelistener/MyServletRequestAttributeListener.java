package com.ma.attributelistener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //放到域中的name
        System.out.println(servletRequestAttributeEvent.getName());
        //放到域中的value
        System.out.println(servletRequestAttributeEvent.getValue());

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //域中删除的name
        System.out.println(servletRequestAttributeEvent.getName());
        //域中删除的value
        System.out.println(servletRequestAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //域中修改前的name
        System.out.println(servletRequestAttributeEvent.getName());
        //域中修改前的value
        System.out.println(servletRequestAttributeEvent.getValue());
    }
}
