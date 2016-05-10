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
public class KHO {
    public final static String col_makho = "MA_KHO";
    public final static String col_tenkho = "TEN_KHO";
    
    private String kho_makho;
    private String kho_tenkho;
    
    public KHO(){};
    public KHO(String makho, String tenkho){
        this.kho_makho = makho;
        this.kho_tenkho = tenkho;
    }
    
    public String get_makho(){
        return this.kho_makho;
    }
    public String get_tenkho(){
        return this.kho_tenkho;
    }
    
    public void set_makho(String makho){
        this.kho_makho = makho;
    }
    public void set_tenkho(String tenkho){
        this.kho_tenkho = tenkho;
    }
}
