/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

/**
 *
 * @author XaraRoyal
 */
public class CTDV {
    public final static String col_mahd = "MA_HD";
    public final static String col_madv ="MA_DV";
    public final static String col_sl = "SO_LUONG";
    public final static String col_ghichu ="GHI_CHU";
    
    private String ctdv_mahd;
    private String ctdv_madv;
    private int ctdv_sl;
    private String ctdv_ghichu;
    
    public CTDV(){};
    public CTDV(String mahd, String madv,int soluong,String ghichu ){
        this.ctdv_mahd = mahd;
        this.ctdv_madv = madv;
        this.ctdv_sl = soluong;
        this.ctdv_ghichu = ghichu;
    }
    public String get_mahd(){
        return this.ctdv_mahd;
    }
    public String get_madv(){
        return this.ctdv_madv;
    }
    public int get_soluong(){
        return this.ctdv_sl;
    }
    public String get_ghichu(){
        return this.ctdv_ghichu;
    }
    public void set_mahd(String mahd){
        this.ctdv_mahd = mahd;
    }
    public void set_madv(String madv){
        this.ctdv_madv = madv;
    }
    public void set_soluong(int soluong){
        this.ctdv_sl = soluong;
    }
    public void set_ghichu(String ghichu){
        this.ctdv_ghichu = ghichu;
    }
}
