package com.powderach.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import static org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS;

public class ServletServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler contextHandler = new ServletContextHandler(SESSIONS);
        contextHandler.setContextPath("/retrospectit");

        BaseServlet baseServlet = new BaseServlet();
        contextHandler.addServlet(new ServletHolder(baseServlet), "");

        server.setHandler(contextHandler);
        server.start();
        server.join();
    }

}