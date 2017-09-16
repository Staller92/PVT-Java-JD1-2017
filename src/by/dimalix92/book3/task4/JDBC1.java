package by.dimalix92.book3.task4;

import java.sql.*;

/**
 * Created by LIKHTAROVICH on 29.08.2017.
 * Напишите программу получающую данные о расходе в качестве исходных параметров main,
 * и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран.
 */
public class JDBC1 {
    public static void main(String[] args) {
        int pay;
        if (args.length != 1) {
            pay = 0;

        } else {
            pay = Integer.parseInt(args[0]);
        }

        String dbURL = "jdbc:mysql://localhost:3306/listexpenses?verifyServerCertificate=false&useSSL=true";
        String userName = "root";
        String password = "root";
        String query = "insert into expenses (num,paydate,receiver,value) values (18,'2017-9-16',3," + pay + ")";
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, userName, password);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            resultSet = statement.executeQuery("select expenses.num,paydate,value,name from  expenses,receivers where receiver=receivers.num order by value");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("num") + "\t");
                System.out.print(resultSet.getString("paydate") + "\t");
                System.out.print(resultSet.getInt("value") + "\t");
                System.out.print(resultSet.getString("name") + "\t");
                System.out.println();
            }

            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e);
        } catch (SQLException e) {
            System.out.println("Error loading driver: " + e);
        }


    }


}
