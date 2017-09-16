package by.dimalix92.book3.task11;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by LIKHTAROVICH on 10.09.2017.
 * Сделать сервлет, который по содержимому User-Agent будет определять с помошью какого браузера
 * зашел пользователь, и выводить сообщение вида: Приветствую пользователя Firefox
 */
//В server.xml у описания HTTP-конектора добавлен атрибут URIEncoding="UTF-8" для корректного вывода кирилицы
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info = req.getHeader("User-Agent");
        String browser= findBrowser(info);

        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Personal data</title></head>");
        out.println("<body><h3> Приветствую пользователя: " + browser + "</h3></body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    private  String findBrowser(String info) {
        String browser = "Unknown";
        Map<String, String> mapRegEx = new HashMap<>();
        mapRegEx.put("CHROME", ".*Chrome.*");
        mapRegEx.put("FIREFOX", ".*Firefox.*");
        mapRegEx.put("SAFARI", ".*Version.*Safari.*");
        mapRegEx.put("OPERA", ".*Opera.*|.*OPR.*");
        mapRegEx.put("INTERNET EXPLORER", ".*Gecko$");
        Pattern pattern;
        Matcher matcher;
        for (Map.Entry<String, String> browsers : mapRegEx.entrySet()) {
            pattern = Pattern.compile(browsers.getValue());
            matcher = pattern.matcher(info);
            if (matcher.matches()) {

                browser = browsers.getKey();
            }
        }

        return browser;


    }


}