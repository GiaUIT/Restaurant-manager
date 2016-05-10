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
public class CTTD {
    public final static String col_mamon = "MA_MON";
    public final static String col_matd = "MA_TD";
    
    private String cttd_mamon;
    private String cttd_matd;
    
    public String get_matd(){
        return this.cttd_matd;
    }
    public String get_mamon(){
        return this.cttd_mamon;
    }
    public void set_matd(String matd){
        this.cttd_matd = matd;
    }
    public void set_mamon(String mamon){
        this.cttd_mamon = mamon;
    }
}
