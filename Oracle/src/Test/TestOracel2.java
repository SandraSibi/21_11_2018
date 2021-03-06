/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MyOracle;

/**
 *
 * @author admin
 */
public class TestOracel2 {

    public static void main(String[] args) {
        try {
            MyOracle ora = new MyOracle("172.23.9.185", "1521", "orcl", "MHS175314106", "MHS175314106");
            //step2 create  the connection object
            Connection con = ora.getConnection();
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery("select T.FIRST_NAME, T.LAST_NAME\n"
                    + "from MHS175314106.EMPLOYEES T");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            //step5 close the connection object
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestOracel2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
