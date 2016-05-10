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
public class NGUYENLIEU {
    public final static String col_manl = "MA_NL";
    public final static String col_tennl = "TEN_NL";
    public final static String col_gia = "GIA";
    public final static String col_tonkho = "TON_KHO";
    public final static String col_hinh = "HINH";
    public final static String col_dvt = "DVT";
    
    private String nl_manl;
    private String nl_tennl;
    private int nl_gia;
    private int nl_tonkho;
    private String nl_hinh;
    private String nl_dvt;
    
    public NGUYENLIEU(){};
    public NGUYENLIEU(String manl, String tennl, int gia, int tonkho, String hinh, String dvt){
        this.nl_manl = manl;
        this.nl_tennl = tennl;
        this.nl_gia = gia;
        this.nl_tonkho = tonkho;
        this.nl_hinh = hinh;
        this.nl_dvt = dvt;
    }
    
    public String get_manl(){
        return this.nl_manl;
    }
    public String get_tennl(){
        return this.nl_tennl;
    }
    public int get_gia(){
        return this.nl_gia;
    }
    public int get_tonkho(){
        return this.nl_tonkho;
    }
    public String get_hinh(){
        return this.nl_hinh;
    }
    public String get_dvt(){
        return this.nl_dvt;
    }
    
    public void set_manl(String manl){
        this.nl_manl = manl;
    }
    public void set_tennl(String tennl){
        this.nl_tennl = tennl;
    }
    public void set_gia(int gia){
        this.nl_gia = gia;
    }
    public void set_tonkho(int tonkho){
        this.nl_tonkho = tonkho;
    }
    public void set_hinh(String hinh){
        this.nl_hinh = hinh;
    }
    public void set_dvt(String dvt){
        this.nl_dvt = dvt;
    }
}
