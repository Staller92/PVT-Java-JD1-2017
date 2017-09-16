package by.dimalix92.book3.task6;

import java.sql.*;

/**
 * Created by LIKHTAROVICH on 30.08.2017.
 * Составить следующие запросы:
 * Вывести список получателей платежей, и сумму платежей по каждому из них.
 * Вывести список платежей за тот день, когда был наибольший платеж.
 * Вывести наибольший платеж за тот день, когда сумма платежей была наибольшей.
 */
public class Solution {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/listexpenses?verifyServerCertificate=false&useSSL=true";
        String userName = "root";
        String password = "root";
        String query1 = "select name,(select sum(value) from expenses where receiver=r.num) as Сумма from receivers r";
        String query2 = "select (select sum(value) from expenses where paydate=(select paydate from expenses where value = (select max(value) from expenses))) as сумма_платежей_в_самый_затратный_день;";
        String query3 = "select (select max(value) from expenses where paydate=(select paydate from expenses where value = (select max(value) from expenses))) as наибольший_платеж_в_самый_затратный_день;";
        String query = "select expenses.num,paydate,value,name from  expenses,receivers where receiver=receivers.num order by value;";
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, userName, password);
            statement = connection.createStatement();

            System.out.println("Вся таблица");
            resultSet = statement.executeQuery(query);//Вся таблица
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("num") + "\t");
                System.out.print(resultSet.getString("paydate") + "\t");
                System.out.print(resultSet.getInt("value") + "\t");
                System.out.print(resultSet.getString("name") + "\t");
                System.out.println();
            }
            resultSet = statement.executeQuery(query1);//Вывести список получателей платежей, и сумму платежей по каждому из них.

            System.out.println("Вывести список получателей платежей, и сумму платежей по каждому из них.");
            while (resultSet.next()) {

                System.out.print(resultSet.getString("name") + "\t\t");
                System.out.print(resultSet.getInt("Сумма"));
                System.out.println();
            }
            resultSet = statement.executeQuery(query2);//Вывести список платежей за тот день, когда был наибольший платеж.

            System.out.println("Вывести список платежей за тот день, когда был наибольший платеж.");
            while (resultSet.next()) {

                System.out.print(resultSet.getString(1) + "\t\t");
                System.out.println();
            }
            resultSet = statement.executeQuery(query3);//Вывести наибольший платеж за тот день, когда сумма платежей была наибольшей.

            System.out.println("Вывести наибольший платеж за тот день, когда сумма платежей была наибольшей.");
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1) + "\t\t");
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
