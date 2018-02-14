/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author user
 */
public class ConnectionBuilder {
    public static Connection getConnection(){
        
        Connection con = null;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try {
            Properties prop = new Properties();
            InputStream input = classloader.getResourceAsStream("config.properties");
            prop.load(input);
            String url = prop.getProperty("DONATEZEN_URL");
            String port = prop.getProperty("DONATEZEN_PORT");
            String dbname = prop.getProperty("DONATEZEN_DBNAME");
            String username = prop.getProperty("DONATEZEN_USR");
            String password = prop.getProperty("DONATEZEN_PAS");

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + url + ":" + port + "/" + dbname + "?user=" + username + "&password=" + password);
        } catch (Exception e) {

        }
        return con;    
    }
}
