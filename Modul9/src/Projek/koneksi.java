/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url= "jdbc:mysql://localhost:4306/dbproyek"; 
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.err. println("koneksi berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        if (con == null) {
            connect();
        }
        return con;
    }
}
