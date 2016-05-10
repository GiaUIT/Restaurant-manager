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
public class DICHVU {
    public final static String col_madv = "MA_DV";
    public final static String col_tendv ="TEN_DV";
    public final static String col_gia = "GIA";
    public final static String col_dvt = "DVT";
    
    private String dichvu_madv;
    private String dichvu_tendv;
    private int dichvu_gia;
    private String dichvu_dvt;
    
    public DICHVU(){};
    public DICHVU(String madv, String tendv, int gia, String dvt){
        this.dichvu_madv = madv;
        this.dichvu_tendv = tendv;
        this.dichvu_gia = gia;
        this.dichvu_dvt =  dvt;
    }
    
    public String get_madv(){
        return this.dichvu_madv;
    }
    public String get_tendv(){
        return this.dichvu_tendv;
    }
    public int get_gia(){
        return this.dichvu_gia;
    }
    public String get_dvt(){
        return this.dichvu_dvt;
    }
    
    public void set_madv(String madv){
        this.dichvu_madv = madv;
    }
    public void set_tendv(String tendv){
        this.dichvu_tendv = tendv;
    }
    public void set_gia(int gia){
        this.dichvu_gia = gia;
    }
    public void set_dvt(String dvt){
        this.dichvu_dvt = dvt;
    }
}
