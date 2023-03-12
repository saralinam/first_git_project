package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1. Admin: Nippon10
        Class.forName("org.postgresql.Driver");

        //2. Admin: Database'e smou
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Techpro", "postgres", "Nippon10");

        //3.Admin: Statement is working
        Statement st=con.createStatement();

        System.out.println("Connection Success");
    }
}
