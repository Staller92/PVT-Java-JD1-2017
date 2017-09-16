package by.dimalix92.book3.task14;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import java.util.Properties;

/**
 * Created by LIKHTAROVICH on 11.09.2017.
 * Создать сервлет, который будет отображать на странице содержимое базы платежей, из модуля 2
 * Информацию о URL базы, имени пользователя и пароле хранить в начальных данных.
 */

public class ServletDB extends HttpServlet {


    private Dao myDao;

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Connection to the database....");
        Properties properties = new Properties();
        Enumeration<String> initParamNames = getServletConfig().getInitParameterNames();
        while (initParamNames.hasMoreElements()) {
            String paramName = initParamNames.nextElement();
            properties.put(paramName, getServletConfig().getInitParameter(paramName));
            System.out.println(properties.getProperty(paramName));
        }

        myDao = DaoImpl.getDaoImpl(properties);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        showTables(req, resp);
        addExpense(req, resp);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void showTables(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Expense> expenses = myDao.getExpences();
        ArrayList<Receiver> reseivers = myDao.getReceivers();

        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println(" <a href=\"/test/expenses\"><h3>Return to add expenses</h3></a>");
        out.println("<html><head><title>Personal data</title></head>");
        out.println("<body>");
        out.println("<table border=\"1\" align=\"center\" width=\"600\" bgcolor=\"#702e89\">");
        out.println("<tr align=\"center\"><td> Num </td><td> Paydate</td><td>Receiver  </td><td>Value</td></tr>");
        for (Expense expense : expenses) {
            out.println("<tr align=\"center\"><td>" + expense.getNum() + "</td><td>" + expense.getPaydate() + "</td><td>" + expense.getReceiver() + "</td><td>" + expense.getValue() + "</td></tr>");
        }

        out.println("</table>");

        out.println("<table border=\"1\" align=\"left\" width=\"200\" bgcolor=\"#1d808f\">");
        out.println("<tr align=\"center\"><td> Num </td><td> Receiver</td></tr>");
        for (Receiver receiver : reseivers) {
            out.println("<tr align=\"center\"><td>" + receiver.getNum() + "</td><td>" + receiver.getName() + "</td></tr>");
        }

        out.println("</table>");


        out.println("</body></html>");
    }


    private void addExpense(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String num = req.getParameter("number");
        String paydate = req.getParameter("paydate");
        String receiver = req.getParameter("receiver");
        String value = req.getParameter("value");

        if (num.isEmpty() || paydate.isEmpty() || receiver.isEmpty() || value.isEmpty()) {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/expenses");
            requestDispatcher.forward(req, resp);
        } else {


            Expense expense = new Expense(Integer.parseInt(num), paydate, Integer.parseInt(receiver), Integer.parseInt(value));
            myDao.addExpence(expense);

        }
    }
}
