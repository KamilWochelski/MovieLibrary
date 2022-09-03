//package com.example.springjpa;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class MyJdbc {
//    public static void main(String[] args) {
//
//        try {
//
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "kamil");
//
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("select * from movies");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("movie"));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
