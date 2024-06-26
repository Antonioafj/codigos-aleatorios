import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class MovieDatabase {
    public static void main(String[] args) throws Exception {
        String url = "jdbc: mysql://localhost:33/moviedb";
        String username = "root";
        String password = "password";
        String query = "SELECT * FROM movies";

        try{
             
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            Result resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int year = resultSet.getInt("year");
                String director = resultSet.getString("director");
                System.out.println(id + " " + title + " " + year + " " + director);
            }

            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
