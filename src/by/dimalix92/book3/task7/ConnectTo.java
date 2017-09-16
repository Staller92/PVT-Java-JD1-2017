package by.dimalix92.book3.task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by LIKHTAROVICH on 01.09.2017.
 */
public class ConnectTo {
    public static Connection mySQL() throws ClassNotFoundException, SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/listexpenses?verifyServerCertificate=false&useSSL=true";
        String userName = "root";
        String password = "root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbURL, userName, password);
        return connection;
    }

}
