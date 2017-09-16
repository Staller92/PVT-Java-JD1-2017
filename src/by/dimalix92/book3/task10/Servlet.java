package by.dimalix92.book3.task10;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LIKHTAROVICH on 09.09.2017.
 * Создать форму с вводом имени, телефона и электронной почты.
 * Создать сервлет, который будет получать эти данные, и распечатывать на страницe.
 * Если пользователь не ввел имя, или одновременно пропущены телефон и электронная почта
 * следует выводить сообщение об ошибке.
 */
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String telefonNumber = req.getParameter("telefonNumber");
        String email = req.getParameter("email");


        if (name.isEmpty() || telefonNumber.isEmpty() || email.isEmpty()) {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/error");
            requestDispatcher.forward(req, resp);
        } else {


            PrintWriter out = resp.getWriter();
            out.println("<html><head><title>Personal data</title></head>");
            out.println("<body><h3> name: " + name + "</h3>");
            out.println("<h3> mobile phone:" + telefonNumber + "</h3>");
            out.println("<h3> email: " + email + "</h3></body></html>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
