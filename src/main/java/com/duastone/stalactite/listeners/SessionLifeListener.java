package com.duastone.stalactite.listeners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Session Life Listener
 *
 * Created by Fernando on 12/11/2016.
 */
public class SessionLifeListener implements HttpSessionListener{

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("*********** Created Session Detail ***********");
        System.out.println("Session ID: " + session.getId());
        System.out.println("Session Creation Time: " + session.getCreationTime());
        System.out.println("Session Last Accessed Time: " + session.getLastAccessedTime());
        System.out.println("Session Max Inactive Interval: " + session.getMaxInactiveInterval());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("*********** Destroyed Session Detail ***********");
        System.out.println("Session ID: " + session.getId());
        System.out.println("Session Creation Time: " + session.getCreationTime());
        System.out.println("Session Last Accessed Time: " + session.getLastAccessedTime());
        System.out.println("Session Max Inactive Interval: " + session.getMaxInactiveInterval());
    }
}
