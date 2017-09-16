package by.dimalix92.book3.task14;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by LIKHTAROVICH on 01.09.2017.
 */
public class ConnectTo {
    public static Connection mySQL(Properties properties) throws ClassNotFoundException, SQLException {
        String dbURL = (String) properties.getProperty("DATABASE_URL");
        String userName =(String)properties.getProperty("DATABASE_USER");
        String password = (String)properties.getProperty("DATABASE_PASSWORD");
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbURL, userName, password);
        return connection;





    }

}
