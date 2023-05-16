import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

import java.io.IOException;

@WebServlet(name = "PageViewCounterServlet", urlPatterns = "/count")
public class PageViewCounterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer count = (Integer) context.getAttribute("pageViewCount");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        context.setAttribute("pageViewCount", count);

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>Page View Count: " + count + "</h1></body></html>");
    }
}


