package org.example.Controllers;

import org.example.DAO.DatabaseDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePageController {

    public static ResultSet executeSelect(String selectQuery) {

        try {
            Connection connection = DatabaseDAO.connect();
            Statement statement = connection.createStatement();
            return statement.executeQuery(selectQuery);
        } catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
