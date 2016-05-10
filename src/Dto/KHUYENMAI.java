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
import java.sql.Date;
public class KHUYENMAI {
    public final static String col_makm = "MA_KM";
    public final static String col_manhom = "MA_NHOM";
    public final static String col_tenkm = "TEN_KM";
    public final static String col_giatri = "GIA_TRI";
    public final static String col_batdau = "BAT_DAU";
    public final static String col_ketthuc = "KET_THUC";
    
    private String khuyenmai_makm;
    private String khuyenmai_manhom;
    private String khuyenmai_tenkm;
    private int khuyenmai_giatri;
    private Date khuyenmai_batdau;
    private Date khuyenmai_ketthuc;
    
    public KHUYENMAI(){};
    public KHUYENMAI(String makm, String manhom, String tenkm, int giatri, Date batdau, Date ketthuc){
        this.khuyenmai_makm = makm;
        this.khuyenmai_tenkm = tenkm;
        this.khuyenmai_manhom = manhom;
        this.khuyenmai_giatri = giatri;
        this.khuyenmai_batdau = batdau;
        this.khuyenmai_ketthuc = ketthuc;
    }
    
    public String get_makm(){
        return this.khuyenmai_makm;
    }
    public String get_tenkm(){
        return this.khuyenmai_tenkm;
    }
    public String get_manhom(){
        return this.khuyenmai_manhom;
    }
    public int get_giatri(){
        return this.khuyenmai_giatri;
    }
    public Date get_batdau(){
        return this.khuyenmai_batdau;
    }
    public Date get_ketthuc(){
        return this.khuyenmai_ketthuc;
    }
    
    public void set_makm(String makm){
        this.khuyenmai_makm = makm;
    }
    public void set_tenkm(String tenkm){
        this.khuyenmai_tenkm = tenkm;
    }
    public void set_manhom(String manhom){
        this.khuyenmai_manhom = manhom;
    }
    public void set_giatri(int giatri){
        this.khuyenmai_giatri = giatri;
    }
    public void set_batdau(Date batdau){
        this.khuyenmai_batdau = batdau;
    }
    public void set_kethuc(Date ketthuc){
        this.khuyenmai_ketthuc = ketthuc;
    }
}
