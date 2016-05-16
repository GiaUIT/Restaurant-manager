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
public class NHOMKH {
	public final static String col_manhom = "MA_NHOM";    
	public final static String col_tennhom = "TEN_NHOM";
	public final static String col_dieukien = "DIEU_KIEN";    

	private String nhom_manhom;
	private String nhom_tennhom;
	private int nhom_dieukien;


	public NHOMKH(){};
	public NHOMKH(String manhom, String tennhom, int dieukien){
		this.nhom_manhom = manhom;
		this.nhom_tennhom = tennhom;
		this.nhom_dieukien = dieukien;
	}

	public String get_manhom(){
		return this.nhom_manhom;
	}
	public String get_(){
		return this.nhom_tennhom;
	}
	public int get_dieukien(){
		return this.nhom_dieukien;
	}	

	public void set_manhom(String manhom){
		this.nhom_manhom = manhom;
	}
	public void set_tennhom(String tennhom){
		this.nhom_tennhom = tennhom;
	}
	public void set_dieukien(int dieukien){
		this.nhom_dieukien = dieukien;
	}	
}
