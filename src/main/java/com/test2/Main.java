package com.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection;


        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            if(!connection.isClosed()){
                System.out.println("Соединение с БД установлено");
            }
            connection.close();
            if(connection.isClosed()){
                System.out.println("Соединение с БД закрыто");
            }
        } catch (SQLException e) {
            System.err.println("Ошибка подключения к БД");
        }
    }
}