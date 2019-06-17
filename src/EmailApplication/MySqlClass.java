package EmailApplication;

import java.sql.*;

public class MySqlClass {

   // private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
       Connection connect = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/emailapplication","root","28oct1999");
       Statement statement = connect.createStatement();
       ResultSet resultSet = statement
                .executeQuery("select * from Details");

    }

}
