package com.edu.web.listener;

import com.edu.util.Constants;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 19:12
 * @Description:com.edu.web.listener
 * @Version: 1.0
 */

//监听访问在线人数的监听器
public class UserListener implements HttpSessionListener {


    //当session创建时自动进入
    @Override
    public void sessionCreated(HttpSessionEvent event) {
        //获取servletContext对象
        ServletContext context = event.getSession().getServletContext();
        //获取所有用户共享数据 --页面访问人数userCount
        Integer userCount = (Integer) context.getAttribute("userCount");
        if (null == userCount) {
            userCount = 1;
        } else {
            userCount++;
        }
        //将最新的用户访问人数放在userCOunt中
        context.setAttribute("userCount", userCount);
        System.out.println("+++++++++++++session创建  进入sessionCreate方法++++++++++++++++++++++++");

    }

    //当session销毁时自动进入
    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        //获取servletContext对象
        ServletContext context = event.getSession().getServletContext();
        //获取所有用户共享数据 --页面访问人数userCount
        Integer userCount = (Integer) context.getAttribute("userCount");
        if (null == userCount) {
            userCount = 0;
        } else {
            userCount--;
        }
        //将最新的用户访问人数放在userCOunt中
        context.setAttribute("userCount", userCount);
        System.out.println("+++++++++++++session销毁  ++++++++++++++++++++++++");
    }
}
