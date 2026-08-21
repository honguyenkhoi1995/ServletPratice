package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        String[] hobbies =
                request.getParameterValues("hobby");

        out.println("<!DOCTYPE html>");
        out.println("<html>");

        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Kết quả khảo sát</title>");

        out.println("<style>");

        out.println("body {");
        out.println("font-family: Arial;");
        out.println("background: #f2f2f2;");
        out.println("}");

        out.println(".box {");
        out.println("width: 450px;");
        out.println("margin: 80px auto;");
        out.println("padding: 30px;");
        out.println("background: white;");
        out.println("border-radius: 10px;");
        out.println("box-shadow: 0 0 10px #aaa;");
        out.println("}");

        out.println("h2 {");
        out.println("text-align: center;");
        out.println("color: #FF9800;");
        out.println("}");

        out.println("li {");
        out.println("margin: 10px 0;");
        out.println("}");

        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='box'>");

        out.println("<h2>Kết quả khảo sát</h2>");

        out.println("<p>");
        out.println("Xin chào <strong>"
                + name
                + "</strong>!");
        out.println("</p>");

        if (hobbies == null || hobbies.length == 0) {

            out.println("<p>");
            out.println("Bạn chưa chọn sở thích nào.");
            out.println("</p>");

        } else {

            out.println("<p>");
            out.println("Sở thích của bạn:");
            out.println("</p>");

            out.println("<ul>");

            for (String hobby : hobbies) {

                out.println("<li>"
                        + hobby
                        + "</li>");
            }

            out.println("</ul>");
        }

        out.println("<br>");

        out.println("<a href='survey.html'>");
        out.println("Làm lại khảo sát");
        out.println("</a>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}