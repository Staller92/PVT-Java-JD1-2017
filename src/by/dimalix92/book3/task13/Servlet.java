package by.dimalix92.book3.task13;


import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.Date;


/**
 * Created by LIKHTAROVICH on 10.09.2017.
 * Изименить счетчик из задания 2 так, что бы подсчитывались только уникальные посещения
 * за сутки. Для контроля использовать куки.
 */


public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int count = readFrom("D:\\My tasks\\Java\\PVT\\WEB-SERVLETS\\src\\by\\dimalix92\\book3\\task13\\count.dat");

        boolean cookieFlag = false;
        Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            cookieFlag = true;
        } else {
            for (int i = 0; i < cookies.length; i++) {
                if (!(cookies[i].getName().equals("Dima") && cookies[i].getValue().equals("123"))) {
                    cookieFlag = true;

                }
            }
        }
        if (cookieFlag) {
            Cookie myCookie = new Cookie("Dima", "123");
            myCookie.setMaxAge(60 * 60 * 24);
            resp.addCookie(myCookie);
            count++;
            System.out.println("Cookie was created in" + new Date());
        } else {System.out.println("Cookie already exists");}

        writeTo(count, "D:\\My tasks\\Java\\PVT\\WEB-SERVLETS\\src\\by\\dimalix92\\book3\\task13\\count.dat");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body><h1>First Servlet " + count + "</h1>");
        out.println("</body></html>");

    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void writeTo(int count, String address) {

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(address)))) {
            dos.writeInt(count);
            dos.flush();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int readFrom(String address) {
        int x = 0;
        try (DataInputStream dos = new DataInputStream(new FileInputStream(address))) {

            x = dos.readInt();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("File will be created");


        } catch (EOFException e) {
            System.out.println("File is empty");
            System.out.println("Default value =1 wil be set ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return x;
    }


}



