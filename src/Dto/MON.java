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
public class MON {
    public final static String col_mamon = "MA_MON";
    public final static String col_tenmon = "TEN_MON";
    public final static String col_gia = "GIA";
    public final static String col_dvt = "DVT";
    public final static String col_loaitc = "LOAI";
    public final static String col_ghichu = "GHI_CHU";
    
    private String mon_mamon;
    private String mon_tenmon;
    private int mon_gia;
    private String mon_dvt;
    private String mon_loai;
    private String mon_ghichu;
    
    public MON(){};
    public MON(String mamon, String tenmon, int gia, String dvt, String loai, String ghichu){
        this.mon_mamon = mamon;
        this.mon_tenmon = tenmon;
        this.mon_gia = gia;
        this.mon_dvt = dvt;
        this.mon_loai = loai;
        this.mon_ghichu = ghichu;
    }
    
    public String get_mamon(){
        return this.mon_mamon;
    }
    public String get_tenmon(){
        return this.mon_tenmon;
    }
    public int get_gia(){
        return this.mon_gia;
    }
    public String get_dvt(){
        return this.mon_dvt;
    }
    public String get_loai(){
        return this.mon_loai;
    }
    public String get_ghichu(){
        return this.mon_ghichu;
    }
    
    public void set_mamon(String mamon){
        this.mon_mamon = mamon;
    }
    public void set_tenmon(String tenmon){
        this.mon_tenmon = tenmon;
    }
    public void set_gia(int gia){
        this.mon_gia = gia;
    }
    public void set_dvt(String dvt){
        this.mon_dvt = dvt;
    }
    public void set_loai(String loai){
        this.mon_loai = loai;
    }
    public void set_ghuchu(String ghichu){
        this.mon_ghichu = ghichu;
    }
}
