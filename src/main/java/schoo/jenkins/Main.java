package schoo.jenkins;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String value = req.getParameter("value");
        String text = "Pass a number as value parameter";
        if (value != null && !value.isEmpty() && isInteger(value)) {
            FizzBuzz fizzBuzz = new FizzBuzz();
            text = fizzBuzz.execute(Integer.parseInt(value));
        }
        String html = "<html>" +
                "<title>Schoo Jenkins</title>" +
                "<body>" +
                "<h1>" +
                text +
                "</h1>" +
                "</body" +
                "</html>";
        out.println(html);
        out.close();
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
