import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

/**
 * @author pengzhe
 * @date 2019-03-04 14:53
 */
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() {
        System.out.println("注意! 注意 !Servlet被初始化了");
        // 执行必需的初始化
        message = "Debug Tomcat";

    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {
        // 什么也不做
    }
}
