package webapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseServlet extends HttpServlet {

    private final Page page;

    public BaseServlet(Page page) {
        this.page = page;
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            writeToResponse(response, page.generate(), 200);
        } catch (RuntimeException e) {
            writeToResponse(response, e.getMessage(), 400);
        }
    }

    private void writeToResponse(HttpServletResponse response, String content, int status) throws IOException {
        response.setStatus(status);
        response.setContentLength(content.length());
        response.setContentType("text/html");
        response.getWriter().write(content);
    }

}
