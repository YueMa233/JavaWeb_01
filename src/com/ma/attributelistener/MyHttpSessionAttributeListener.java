package com.ma.attributelistener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    @Override
        public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        //放到域中的name
        System.out.println(httpSessionBindingEvent.getName());
        //放到域中的value
        System.out.println(httpSessionBindingEvent.getValue());
        }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        //域中删除的name
        System.out.println(httpSessionBindingEvent.getName());
        //域中删除的value
        System.out.println(httpSessionBindingEvent.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        //域中修改前的name
        System.out.println(httpSessionBindingEvent.getName());
        //域中修改前的value
        System.out.println(httpSessionBindingEvent.getValue());
    }
}
