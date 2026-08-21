package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        if (name == null || name.trim().isEmpty()) {
            name = "bạn";
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Xin chào</title>");

        out.println("<style>");
        out.println("body {");
        out.println("font-family: Arial;");
        out.println("background: #e3f2fd;");
        out.println("}");

        out.println(".box {");
        out.println("width: 450px;");
        out.println("margin: 100px auto;");
        out.println("padding: 40px;");
        out.println("background: white;");
        out.println("text-align: center;");
        out.println("border-radius: 15px;");
        out.println("box-shadow: 0 0 10px #aaa;");
        out.println("}");

        out.println("h1 { color: #2196F3; }");

        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='box'>");

        out.println("<h1>Xin chào " + name + "!</h1>");

        out.println("<p>Chào mừng bạn đến với Servlet.</p>");

        out.println("<a href='hello.html'>Quay lại</a>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
