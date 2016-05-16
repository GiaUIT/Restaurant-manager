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
public class PHONG {
	public final static String col_maphong = "MA_PHONG";
	public final static String col_tenphong = "TEN_PHONG";
	public final static String col_gia = "GIA";   

	private String p_maphong;
	private String p_tenphong;
	private int p_gia;


	public PHONG(){};
	public PHONG(String maphong, String tenphong, int gia){
		this.p_maphong = maphong;
		this.p_tenphong = tenphong;
		this.p_gia = gia;		
	}

	public String get_maphong(){
		return this.p_maphong;
	}
	public String get_tenphong(){
		return this.p_tenphong;
	}
	public int get_gia(){
		return this.p_gia;
	}

	public void set_maphong(String maphong){
		this.p_maphong = maphong;
	}
	public void set_tenphong(String tenphong){
		this.p_tenphong = tenphong;
	}
	public void set_gia(int gia){
		this.p_gia = gia;
	}			 
}
