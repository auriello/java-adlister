import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class HelloWorldServlet extends HttpServlet {

            protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String name = request.getParameter("name");
                String greeting = "Hello, " + (name != null ? name : "World") + "!";

                response.setContentType("text/html");
                response.getWriter().println("<html><body><h1>" + greeting + "</h1></body></html>");
            }
        };





