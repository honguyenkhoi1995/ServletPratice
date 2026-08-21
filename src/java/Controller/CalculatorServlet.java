package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String aString = request.getParameter("a");
        String bString = request.getParameter("b");
        String op = request.getParameter("op");

        try {

            double a = Double.parseDouble(aString);
            double b = Double.parseDouble(bString);

            double result;

            if ("+".equals(op)) {
                result = a + b;
            } else {
                result = a - b;
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Kết quả</title>");

            out.println("<style>");
            out.println("body { font-family: Arial; background: #f2f2f2; }");
            out.println(".result {");
            out.println("width: 400px;");
            out.println("margin: 100px auto;");
            out.println("padding: 30px;");
            out.println("background: white;");
            out.println("text-align: center;");
            out.println("border-radius: 10px;");
            out.println("box-shadow: 0 0 10px #aaa;");
            out.println("}");
            out.println(".number { color: #2196F3; }");
            out.println("</style>");

            out.println("</head>");
            out.println("<body>");

            out.println("<div class='result'>");

            out.println("<h2>Kết quả phép tính</h2>");

            out.println("<p>"
                    + a
                    + " "
                    + op
                    + " "
                    + b
                    + " = "
                    + "<strong class='number'>"
                    + result
                    + "</strong>"
                    + "</p>");

            out.println("<br>");
            out.println("<a href='calculator.html'>Quay lại</a>");

            out.println("</div>");

            out.println("</body>");
            out.println("</html>");

        } catch (NumberFormatException e) {

            out.println("<h2>Dữ liệu không hợp lệ!</h2>");
            out.println("<a href='calculator.html'>Quay lại</a>");
        }
    }
}
