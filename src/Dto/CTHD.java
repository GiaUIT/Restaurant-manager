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
public class CTHD {
    public final static String col_mamon = "MA_MON";
    public final static String col_mahd = "MA_HD";
    public final static String col_soluong = "SO_LUONG";
    public final static String col_ghichu ="GHI_CHU";

    private String cthd_mamon;
    private String cthd_mahd;
    private int cthd_soluong;
    private String cthd_ghichu;

    public CTHD(){};
    public CTHD(String mamon, String mahd, int soluong, String ghichu){
		this.cthd_mamon = mamon;
		this.cthd_mahd = mahd;
		this.cthd_soluong = soluong;
		this.cthd_ghichu = ghichu;   	
    }
    public String get_mamon(){
        return this.cthd_mamon;
    }
    public String get_mahd(){
        return this.cthd_mahd;
    }
    public int get_soluong(){
        return this.cthd_soluong;
    }
    public String get_ghichu(){
        return this.cthd_ghichu;
    }
    public void set_mamon(String mamon){
        this.cthd_mamon = mamon;
    }
    public void set_mahd(String mahd){
        this.cthd_mahd = mahd;
    }
    public void set_soluong(int soluong){
        this.cthd_soluong = soluong;
    }
    public void set_ghichu(String ghichu){
        this.cthd_ghichu = ghichu;
    }
}
