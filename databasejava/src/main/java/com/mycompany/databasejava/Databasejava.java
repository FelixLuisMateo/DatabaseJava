/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.databasejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane; 

/**
 *
 * @author CL2~PC35
 */
public class Databasejava {

    public static Connection conn() {
        try {
                String url = "jdbc:ucanaccess://C://Users//ALDRIN REGASPI//Documents//NetBeansProjects//dsaact2a//databasejava//src//main//java//com//mycompany//databasejava//DatabaseJava.accdb";
                Connection conn = DriverManager.getConnection(url);
                return conn;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            return null;
    }
}
