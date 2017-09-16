package by.dimalix92.book3.task8;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by LIKHTAROVICH on 06.09.2017.
 * Набрать приведенный пример, откомпилировать его, разместить на сервере
 * (в т.ч зарегестрировать в WEB.xml) и запустить из браузера
 */
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body><h1>First Servlet</h1>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

