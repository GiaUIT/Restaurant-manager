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
public class HOADON {
    public final static String col_mahd = "MA_HD";
    public final static String col_manv = "MA_NV";
    public final static String col_maban = "MA_BAN";
    public final static String col_maphong = "MA_PHONG";
    public final static String col_makh = "MA_KH";
    public final static String col_thanhtien = "THANH_TIEN";
    public final static String col_vat = "VAT";
    public final static String col_status = "STATUS";
    
    private String hoadon_mahd;
    private String hoadon_manv;
    private String hoadon_maban;
    private String hoadon_maphong;
    private String hoadon_makh;
    private int hoadon_thanhtien;
    private double hoadon_vat;
    private boolean hoadon_status ;
    
    public HOADON(){};
    public HOADON(String mahd, String makh, String manv, String maban, String maphong, int thanhtien,double vat, boolean status){
        this.hoadon_mahd = mahd;
        this.hoadon_manv = manv;
        this.hoadon_makh = makh;
        this.hoadon_maban = maban;
        this.hoadon_maphong = maphong;
        this.hoadon_thanhtien = thanhtien;
        this.hoadon_vat = vat;
        this.hoadon_status = status;
    }
    
    public String get_mahd(){
        return this.hoadon_mahd;
    }
    public String get_manv(){
        return this.hoadon_manv;
    }
    public String get_makh(){
        return this.hoadon_makh;
    }
    public String get_maban(){
        return this.hoadon_maban;
    }
    public String get_maphong(){
        return this.hoadon_maphong;
    }
    public int get_thanhtien(){
        return this.hoadon_thanhtien;
    }
    public double get_vat(){
        return this.hoadon_vat;
    }
    public boolean get_status(){
        return this.hoadon_status;
    }
    
    public void set_mahd(String mahd){
        this.hoadon_mahd = mahd;
    }
    public void set_manv(String manv){
        this.hoadon_manv = manv;
    }
    public void set_makh(String makh){
        this.hoadon_makh = makh;
    }
    public void set_maban(String maban){
        this.hoadon_maban = maban;
    }
    public void set_maphong(String maphong){
        this.hoadon_maphong = maphong;
    }
    public void set_thanhtien(int thanhtien){
        this.hoadon_thanhtien = thanhtien;
    }
    public void set_vat(double vat){
        this.hoadon_vat = vat;
    }
    public void set_status(boolean status){
        this.hoadon_status = status;
    }
}
