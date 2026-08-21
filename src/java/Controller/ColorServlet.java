package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ColorServlet")
public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String color = request.getParameter("color");

        if (color == null || color.trim().isEmpty()) {
            color = "white";
        }

        // Chỉ cho phép các màu được yêu cầu
        if (!color.equals("red")
                && !color.equals("blue")
                && !color.equals("green")) {

            color = "white";
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");

        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Đổi màu nền</title>");
        out.println("</head>");

        out.println("<body style='"
                + "background-color:" + color + ";"
                + "font-family:Arial;"
                + "text-align:center;"
                + "padding-top:100px;'>");

        out.println("<h1>Đã đổi màu nền!</h1>");

        out.println("<p>");
        out.println("Màu hiện tại: <strong>"
                + color
                + "</strong>");
        out.println("</p>");

        out.println("<br>");

        out.println("<a href='color.html'>");
        out.println("Chọn màu khác");
        out.println("</a>");

        out.println("</body>");

        out.println("</html>");
    }
}
