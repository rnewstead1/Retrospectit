package com.powderach;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import static org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS;

public class ServletServer {

    private static final String ROOT_CONTEXT = "/retrospectit";

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler baseContextHandler = new ServletContextHandler(SESSIONS);
        baseContextHandler.setContextPath(ROOT_CONTEXT);

        BaseServlet baseServlet = new BaseServlet();
        baseContextHandler.addServlet(new ServletHolder(baseServlet), "");

        ResourceHandler staticResourceHandler = new ResourceHandler();
        staticResourceHandler.setResourceBase("../retrospectit/src/main/webapp");

        ContextHandler resourceContextHandler = new ContextHandler(ROOT_CONTEXT);
        resourceContextHandler.setHandler(staticResourceHandler);


        ContextHandlerCollection handlers = new ContextHandlerCollection();
        handlers.addHandler(baseContextHandler);
        handlers.addHandler(resourceContextHandler);

        server.setHandler(handlers);
        server.start();
        server.join();
    }

}