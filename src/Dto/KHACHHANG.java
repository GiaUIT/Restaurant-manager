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
public class KHACHHANG {
    public final static String col_makh = "MA_KH";
    public final static String col_manhom = "MA_NHOM";
    public final static String col_tenkh = "TEN_KH";
    public final static String col_sdt = "SDT";
    public final static String col_diachi = "DIA_CHI";
    
    private String khachhang_makh;
    private String khachhang_manhom;
    private String khachhang_tenkh;
    private String khachhang_sdt;
    private String khachhang_diachi;
    
    public KHACHHANG(){};
    public KHACHHANG(String makh, String manhom, String tenkh, String sdt, String diachi){
        this.khachhang_makh = makh;
        this.khachhang_tenkh = tenkh;
        this.khachhang_manhom = manhom;
        this.khachhang_sdt = sdt;
        this.khachhang_diachi = diachi;
    }
    
    public String get_makh(){
        return this.khachhang_makh;
    }
    public String get_tenkh(){
        return this.khachhang_tenkh;
    }
    public String get_nhomkh(){
        return this.khachhang_manhom;
    }
    public String get_sdt(){
        return this.khachhang_sdt;
    }
    public String get_diachi(){
        return this.khachhang_diachi;
    }
    
    public void set_makh(String makh){
        this.khachhang_makh = makh;
    }
    public void set_tenkh(String tenkh){
        this.khachhang_tenkh = tenkh;
    }
    public void set_manhom(String manhom){
        this.khachhang_manhom = manhom;
    }
    public void set_sdt(String sdt){
        this.khachhang_sdt = sdt;
    }
    public void set_diachi(String diachi){
        this.khachhang_diachi = diachi;
    }
    
    
    
}
