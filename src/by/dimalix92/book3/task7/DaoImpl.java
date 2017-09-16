package by.dimalix92.book3.task7;


import java.sql.*;
import java.util.ArrayList;

/**
 * Created by LIKHTAROVICH on 31.08.2017.
 */
public class DaoImpl implements Dao {

    private static DaoImpl daoImpl;

    public static DaoImpl getDaoImpl() {
        if (daoImpl != null) {
            return daoImpl;
        } else daoImpl = new DaoImpl();
        return daoImpl;
    }

    private DaoImpl() {
    }




    @Override
    public Receiver getReceiver(int num) {
        Receiver receiver = null;
        try {
            String query = "select*from receivers where num=?;";
            Connection connection = ConnectTo.mySQL();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,num);
            ResultSet resultSet = statement.executeQuery();
            receiver = new Receiver();
            resultSet.next();
            receiver.setNum(resultSet.getInt("num"));
            receiver.setName(resultSet.getString("name"));
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Not available number");
        }

        return receiver;
    }

    @Override
    public Expense getExpence(int num) {
        Expense expense = null;
        try {
            String query = "select*from expenses where num=?;";
            Connection connection = ConnectTo.mySQL();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,num);
            ResultSet resultSet = statement.executeQuery();
            expense = new Expense();
            resultSet.next();
            expense.setNum(resultSet.getInt("num"));
            expense.setPaydate(resultSet.getString("paydate"));
            expense.setReceiver(resultSet.getInt("receiver"));
            expense.setValue(resultSet.getInt("value"));
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Not available number");

        }

        return expense;
    }

    @Override
    public ArrayList<Receiver> getReceivers() {
        ArrayList<Receiver> list = new ArrayList<>();
        Receiver receiver = null;
        try {
            String query = "select*from receivers;";
            Connection connection = ConnectTo.mySQL();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                receiver = new Receiver();
                receiver.setNum(resultSet.getInt("num"));
                receiver.setName(resultSet.getString("name"));
                list.add(receiver);
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public ArrayList<Expense> getExpences() {
        ArrayList<Expense> list = new ArrayList<>();
        Expense expense = null;
        try {
            String query = "select*from expenses;";
            Connection connection = ConnectTo.mySQL();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                expense = new Expense();
                expense.setNum(resultSet.getInt("num"));
                expense.setPaydate(resultSet.getString("paydate"));
                expense.setReceiver(resultSet.getInt("receiver"));
                expense.setValue(resultSet.getInt("value"));
                list.add(expense);
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public int addReceiver(Receiver receiver) {

        try {
            String query = "insert into receivers (num,name) values (?,?);";
            Connection connection = ConnectTo.mySQL();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, receiver.getNum());
            statement.setString(2, receiver.getName());
            statement.executeUpdate();

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }


    @Override
    public int addExpence(Expense expense) {
        try {
            String query = "insert into expenses (num,paydate,receiver,value) values (?,?,?,?);";
            Connection connection = ConnectTo.mySQL();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, expense.getNum());
            statement.setString(2, expense.getPaydate());
            statement.setInt(3, expense.getReceiver());
            statement.setInt(4, expense.getValue());
            statement.executeUpdate();

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
