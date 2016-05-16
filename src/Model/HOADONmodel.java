/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import Dto.NHANVIEN;
/**
 *
 * @author XaraRoyal
 */
public class HOADONmodel extends DATABASE {
    public String table_name = "NHAN_VIEN";
    
    public HOADONmodel(){};
    public ResultSet get_AllDataTable(){
        return get_AllDataTable(table_name);
    }
    public ResultSet get_ColDataTable(String colname){
        return super.get_ColDataTable(table_name, colname);
    }
    public static void main(String[] args) {
        HOADONmodel ts = new HOADONmodel();
        try {
            ResultSet rs;
            rs = ts.get_ColDataTable(NHANVIEN.col_mabp);
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }
}
