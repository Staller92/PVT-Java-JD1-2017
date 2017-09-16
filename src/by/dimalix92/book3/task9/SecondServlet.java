package by.dimalix92.book3.task9;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by LIKHTAROVICH on 06.09.2017.
 * Сделать простейший сервлет, подсчитывающий количество посещений.
 * Т.е при каждом обращении к сервлету, следует увеличивать счетчик посещений и выводить
 * его значение на страницу. Количество следует хранить в файле.
 */

public class SecondServlet extends HttpServlet{
    private  static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int count=readFrom("D:\\My tasks\\Java\\PVT\\WEB-SERVLETS\\src\\by\\dimalix92\\book3\\task9\\count.dat");
        count++;
        writeTo(count,"D:\\My tasks\\Java\\PVT\\WEB-SERVLETS\\src\\by\\dimalix92\\book3\\task9\\count.dat");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body><h1>First Servlet "+count+"</h1>");
        out.println("</body></html>");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req,resp);
    }
    public static void writeTo(int count, String address) {

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

