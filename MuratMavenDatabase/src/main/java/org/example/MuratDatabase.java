package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuratDatabase {
    static Connection conn = null;


    public static void main(String[] args) throws SQLException {
        System.out.println("MySQL JDBC Connection Testing");

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/murat_test", "root", "h!c@5qB$P@MB8W");

            updateWealth(100.0, 7);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void insert(String UserName, String UserSurname, int UserAge, String UserJob, Double UserNetWorth) throws SQLException {
        String SQL_INSERT = "Insert into persons (UserName ,UserSurname, UserAge, UserJob, UserNetWort) values (? ,? ,? ,?, ?)";

        PreparedStatement insertStatement = ((Connection) conn).prepareStatement(SQL_INSERT);

        insertStatement.setString(1, UserName);
        insertStatement.setString(2, UserSurname);
        insertStatement.setInt(3, UserAge);
        insertStatement.setString(4, UserJob);
        insertStatement.setDouble(5, UserNetWorth);
        insertStatement.execute();
    }

    public static void read() throws SQLException {

        List<Person> result = new ArrayList<>();
        String SQL_SELECT = "Select * from persons ";

        PreparedStatement selectStatement = ((Connection) conn).prepareStatement(SQL_SELECT);
        ResultSet resultSet = selectStatement.executeQuery();

        while (resultSet.next()) {
            int UserID = resultSet.getInt("UserID");
            String UserName = resultSet.getString("UserName");
            String UserSurname = resultSet.getString("UserSurname");
            int UserAge = resultSet.getInt("UserAge");
            String UserJob = resultSet.getString("UserJob");
            Double UserNetWorth = resultSet.getDouble("UserNetWorth");
            Person person = new Person();
            person.setUserID(UserID);
            person.setUserName(UserName);
            person.setUserSurname(UserSurname);
            person.setUserAge(UserAge);
            person.setUserJob(UserJob);
            person.setUserNetWorth(UserNetWorth);
            result.add(person);
        }
        result.forEach(x -> System.out.println(x.UserID + " " + x.UserName + " " + x.UserSurname + " " + x.UserAge + " " + x.UserJob + " " + x.UserNetWorth));
    }

    public static void updateWealth(Double UserNetWorth, int UserID) throws SQLException {
        String SQL_UPDATE_NETWORTH = "UPDATE persons SET UserNetWorth = ? WHERE UserID = ?";

        PreparedStatement updateStatement = conn.prepareStatement(SQL_UPDATE_NETWORTH);
        updateStatement.setDouble(1, UserNetWorth);
        updateStatement.setInt(2, UserID);
        updateStatement.executeUpdate();

    }

    public static void allUpdate(String UserName, String UserSurname, int UserAge, String UserJob, Double UserNetWorth, int UserID) throws SQLException {
        String SQL_UPDATE_ALL = "UPDATE persons SET UserName = ?, UserSurname = ?, UserAge = ?, UserJob = ?, UserNetWorth = ? WHERE UserID = ?";

        PreparedStatement updateAllStatement = conn.prepareStatement(SQL_UPDATE_ALL);
        updateAllStatement.setString(1, UserName);
        updateAllStatement.setString(2, UserSurname);
        updateAllStatement.setInt(3, UserAge);
        updateAllStatement.setString(4, UserJob);
        updateAllStatement.setDouble(5, UserNetWorth);
        updateAllStatement.setInt(6, UserID);
        updateAllStatement.executeUpdate();

    }

    public static void delete(int UserID) throws SQLException {
        String SQL_DELETE = "DELETE FROM persons WHERE UserID = ?";

        PreparedStatement deleteStatement = conn.prepareStatement(SQL_DELETE);
        deleteStatement.setInt(1, UserID);
        deleteStatement.executeUpdate();

    }
}