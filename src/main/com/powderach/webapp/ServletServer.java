package webapp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import static org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS;

public class ServletServer {

    private static final String ROOT_CONTEXT = "/retrospectit";
    private final Server server;

    public ServletServer(int port) {
        this.server = new Server(port);

        ServletContextHandler baseContextHandler = new ServletContextHandler(SESSIONS);
        baseContextHandler.setContextPath(ROOT_CONTEXT);

        BaseServlet baseServlet = new BaseServlet();
        baseContextHandler.addServlet(new ServletHolder(baseServlet), "");

        ResourceHandler staticResourceHandler = new ResourceHandler();
        staticResourceHandler.setResourceBase("../retrospectit/src/main/com/powderach/webapp");

        ContextHandler resourceContextHandler = new ContextHandler(ROOT_CONTEXT);
        resourceContextHandler.setHandler(staticResourceHandler);

        ContextHandlerCollection handlers = new ContextHandlerCollection();
        handlers.addHandler(baseContextHandler);
        handlers.addHandler(resourceContextHandler);

        server.setHandler(handlers);
    }

    public void start() throws Exception {
        server.start();
        server.join();
    }
}
