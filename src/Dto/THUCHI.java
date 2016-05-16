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
public class THUCHI {
	public final static String col_matc = "MA_TC";    
	public final static String col_manv = "MA_NV";
	public final static String col_tentc = "TEN_TC";
	public final static String col_tong = "TONG";
	public final static String col_loaitc = "LOAI_TC";

	private String tc_matc;
	private String tc_manv;
	private String tc_tentc;
	private int tc_tong;
	private String tc_loaitc;	

	public THUCHI(){}
	public THUCHI(String matc, String manv, String tentc, int tong, String loaitc){
		this.tc_matc = matc;
		this.tc_manv = manv;
		this.tc_tentc = tentc;
		this.tc_tong = tong;
		this.tc_loaitc = loaitc;
	}	

	public String get_matc(){
		return this.tc_matc;
	}
	public String get_manv(){
		return this.tc_manv;
	}
	public String get_tentc(){
		return this.tc_tentc;
	}
	public int get_tong(){
		return this.tc_tong;
	}
	public String get_loaitc(){
		return this.tc_loaitc;
	}	

	public void set_matc(String matc){
		this.tc_matc = matc;
	}
	public void set_manv(String manv){
		this.tc_manv = manv;
	}
	public void set_tentc(String tentc){
		this.tc_tentc = tentc;
	}
	public void set_tong(int tong){
		this.tc_tong = tong;
	}
	public void set_loaitc(String loaitc){
		this.tc_loaitc = loaitc;
	}	
}
