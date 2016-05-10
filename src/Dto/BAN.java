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
public class BAN {
    public final static String col_maban ="MABAN";
    public final static String col_vitri ="VITRI";
     
    private String b_maban;
    private String b_vitri;
    
    public BAN(){};
    public BAN(String ma, String vt){
        this.b_maban = ma;
        this.b_vitri = vt;
    }
    
    public String get_maban(){
        return this.b_maban;
    }
    public String get_vitri(){
        return this.b_vitri;
    }
    
    public void set_maban(String mb){
        this.b_maban =mb;
    }
    public void set_vitri(String vt){
        this.b_vitri = vt;
    }
}
