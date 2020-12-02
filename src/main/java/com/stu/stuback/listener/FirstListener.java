package com.stu.stuback.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 整合监听器
 */
@WebListener
public class FirstListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent event) {

    }

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Listener Init");
    }
}
