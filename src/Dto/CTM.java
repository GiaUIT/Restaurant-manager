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
public class CTM {
    public final static String col_mamon = "MA_MON";
    public final static String col_manl = "MA_NL";
    public final static String col_soluong = "SO_LUONG";
    public final static String col_ghichu ="GHI_CHU";
    public final static String col_dvt ="DVT";
    
    private String ctm_mamon;
    private String ctm_manl;
    private int ctm_soluong;
    private String ctm_ghichu;
    private String ctm_dvt;
    
   
    public CTM(){};
    public CTM(String mamon, String manl, int soluong, String ghichu,String dvt){
		this.ctm_mamon = mamon;
		this.ctm_manl = manl;
		this.ctm_soluong = soluong;
		this.ctm_ghichu = ghichu;   
                this.ctm_dvt = dvt;
    }
    public String get_mamon(){
        return this.ctm_mamon;
    }
    public String get_manl(){
        return this.ctm_manl;
    }
    public int get_soluong(){
        return this.ctm_soluong;
    }
    public String get_ghichu(){
        return this.ctm_ghichu;
    }
    public void set_mamon(String mamon){
        this.ctm_mamon = mamon;
    }
    public void set_manl(String manl){
        this.ctm_manl = manl;
    }
    public void set_soluong(int soluong){
        this.ctm_soluong = soluong;
    }
    public void set_ghichu(String ghichu){
        this.ctm_ghichu = ghichu;
    }
    public void set_dvt(String dvt){
        this.ctm_dvt = dvt;
    }
}
