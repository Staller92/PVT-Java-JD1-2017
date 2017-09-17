package by.dimalix92.book3.task15;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by LIKHTAROVICH on 11.09.2017.
 * Добавить к зажанному в предыдущем задании сервлету JSP и заменить сервлет таким образом, что бы работа
 * с базой выполнялась сервлетом, а отображение результатов на странице JSP.
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


        transferToJSP(req, resp);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void transferToJSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Expense> expenses = myDao.getExpences();
        HttpSession session = req.getSession();
        session.setAttribute("Expenses", expenses);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/jsp/show.jsp");
        requestDispatcher.forward(req, resp);


    }


}
