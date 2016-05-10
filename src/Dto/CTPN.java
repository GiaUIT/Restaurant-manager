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
public class CTPN {
    public final static String col_mapn = "MA_PN";
    public final static String col_manl = "MA_NL";
    public final static String col_soluong = "SO_LUONG";
    public final static String col_gia = "GIA";
    public final static String col_dvt = "DVT";
    public final static String col_ghichu = "GHI_CHU";
    
    private String ctpn_mapn;
    private String ctpn_manl;
    private int ctpn_soluong;
    private int ctpn_gia;
    private String ctpn_dvt;
    private String ctpn_ghichu;
    
    public CTPN(){};
    public CTPN(String mapn, String manl, int soluong, int gia, String dvt,String ghichu){
        this.ctpn_mapn = mapn;
        this.ctpn_manl = manl;
        this.ctpn_soluong = soluong;
        this.ctpn_dvt = dvt;
        this.ctpn_gia = gia;
        this.ctpn_ghichu = ghichu;
    }
    public String get_mapn(){
        return this.ctpn_mapn;
    }
    public String get_manl(){
        return this.ctpn_manl;
    }
    public String get_dvt(){
        return this.ctpn_dvt;
    }
    public String get_ghichu(){
        return this.ctpn_ghichu;
    }
    public int get_soluong(){
        return this.ctpn_soluong;
    }
    public int get_gia(){
        return this.ctpn_gia;
    }
    public void set_mapn(String mapn){
        this.ctpn_mapn = mapn;
    }
    public void set_manl(String manl){
        this.ctpn_manl = manl;
    }
    public void set_dvt(String dvt){
        this.ctpn_dvt = dvt;
    }
    public void set_ghichu(String ghichu){
        this.ctpn_ghichu = ghichu;
    }
    public void set_soluong(int soluong){
        this.ctpn_soluong = soluong;
    }
    public void set_gia(int gia){
        this.ctpn_gia = gia;
    }
}
