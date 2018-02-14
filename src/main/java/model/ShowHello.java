/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nawatsomnuek
 */
public class ShowHello {

    private int id;
    private String word;

    public ShowHello() {
    }

    public ShowHello(ResultSet rs) throws SQLException {
        this.id = rs.getInt("idCollectWord");
        this.word = rs.getString("word");
    }

    public static String getDB() throws SQLException, ClassNotFoundException {
        String COLLECT_DATA = "SELECT * FROM CollectWord WHERE idCollectWord=1";
        Connection con= ConnectionBuilder.getConnection();
        String wordd = "";
        if (con == null) {
            System.out.println("Connection is null");
        }
        PreparedStatement pstm = con.prepareStatement(COLLECT_DATA);
        ResultSet rs = pstm.executeQuery(COLLECT_DATA);
        while(rs.next()){
            wordd = rs.getString("word");
        }
        return wordd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
}