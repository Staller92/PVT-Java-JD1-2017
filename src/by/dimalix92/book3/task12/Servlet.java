package by.dimalix92.book3.task12;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by LIKHTAROVICH on 10.09.2017.
 * Изменить счетчик из задания 2 так, чтобы значение выводилось в
 * виже изображения.
 */


public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int count=readFrom("D:\\My tasks\\Java\\PVT\\WEB-SERVLETS\\src\\by\\dimalix92\\book3\\task12\\count.dat");
        count++;
        writeTo(count,"D:\\My tasks\\Java\\PVT\\WEB-SERVLETS\\src\\by\\dimalix92\\book3\\task12\\count.dat");


        resp.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(1000,500,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font(("Serif"),Font.ITALIC,48));
        graphics.setColor(Color.green);
        graphics.drawString("Количество посещений: "+String.valueOf(count), 100, 200);
        ServletOutputStream out = resp.getOutputStream();
        ImageIO.write(image,"jpeg",out);




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
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
