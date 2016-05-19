/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import Dto.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XaraRoyal
 */
public class DATABASE {
    public final static String username = "admin";
    public final static String password = "123456";
    public final static String databasename = "NHAHANG";
    public final static String hostname = "localhost";
    public final static String sqlInstanceName = "SQLEXPRESS";
    private  Connection conn = null;
    private  static DATABASE instance;
    
    public static DATABASE getInstance(){
        return instance;
    }
    public DATABASE() {
        instance = this;
    }
    public  Connection get_connection(){
        try {
         Class.forName("net.sourceforge.jtds.jdbc.Driver");
         String connectionUrl = "jdbc:jtds:sqlserver://" + hostname + ":1433/"
             + databasename + ";instance=" + sqlInstanceName;
         conn = DriverManager.getConnection(connectionUrl,username, password);
         return conn;
        }
      catch (Exception e) {
         e.printStackTrace();
         return null;
      }
    }
    public Connection get_connection(String n_hostname,String n_sqlInstanceName,String n_databasename, String n_username, String n_password){
        try {
         Class.forName("net.sourceforge.jtds.jdbc.Driver");
         String connectionUrl = "jdbc:jtds:sqlserver://" + n_hostname + ":1433/"
             + n_databasename + ";instance=" + n_sqlInstanceName;
         System.out.println(connectionUrl);
         conn = DriverManager.getConnection(connectionUrl,n_username, n_password);
         return conn;
        }
      catch (Exception e) {
         e.printStackTrace();
         return null;
      }
    }
    public ResultSet get_AllDataTable(String table){
        Connection conn = this.get_connection();
        String SqlQuery = "SELECT * FROM "+table;
        System.out.println(SqlQuery);
        ResultSet rs = null;
        Statement stm = null;
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(SqlQuery);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet get_ColDataTable(String table, String col_name){
        Connection conn = this.get_connection();
        String SqlQuery = "SELECT " + col_name +" FROM "+table;
        System.out.println(SqlQuery);
        ResultSet rs = null;
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(SqlQuery);
            rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet get_NumberRecord(String table){
      Connection conn = this.get_connection();
        String SqlQuery = "SELECT Count(*) FROM "+table;
        System.out.println(SqlQuery);
        ResultSet rs = null;
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(SqlQuery);
            rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }  
    }
    public ResultSet get_AllDataTableSort(String table,String colname, String sortname){
        Connection conn = this.get_connection();
        String SqlQuery = "SELECT * FROM "+table + " ORDER BY "+colname+" "+sortname;
        System.out.println(SqlQuery);
        ResultSet rs = null;
        Statement stm = null;
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(SqlQuery);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet search_col(String table, String colname, String value){
        Connection conn = this.get_connection();
        String SqlQuery = "SELECT * FROM "+table+" WHERE "+colname+" = "+"'"+value+"'";
        System.out.println(SqlQuery);
        ResultSet rs = null;
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(SqlQuery);
            rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet get_Top(String table,String numberTop){
        Connection conn = this.get_connection();
        String SqlQuery = "SELECT TOP "+numberTop+" * FROM "+table;
        System.out.println(SqlQuery);
        ResultSet rs = null;
        Statement stm = null;
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(SqlQuery);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public CallableStatement callstore(String spname){
        try {
            CallableStatement ts = conn.prepareCall(spname);
            return ts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args){
        DATABASE ts = new DATABASE();
        ts.get_connection();
        try {
            ResultSet rs;
            rs = ts.get_Top("NHAN_VIEN","3");
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
        } catch (Exception e) {
        }
   }
}
