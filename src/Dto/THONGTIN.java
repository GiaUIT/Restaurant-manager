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
public class THONGTIN {
    
	public final static String col_matt = "MA_TT";
	public final static String col_tennh = "TEN_NH";
	public final static String col_sdt = "SDT";
	public final static String col_diachi = "DIA_CHI";  

	private String tt_matt;
	private String tt_tennh;
	private String tt_sdt;
	private String tt_diachi;

	public THONGTIN(){};
	public THONGTIN(String matt, String tennh, String sdt, String diachi){
		this.tt_matt = matt;
		this.tt_tennh = tennh;
		this.tt_sdt = sdt;
		this.tt_diachi = diachi;

	}	

	public String get_matt(){
		return this.tt_matt;
	}
	public String get_tennh(){
		return this.tt_tennh;
	}
	public String get_sdt(){
		return this.tt_sdt;
	}
	public String get_diachi(){
		return this.tt_diachi;
	}

	public void set_matt(String matt){
		this.tt_matt= matt;
	}
	public void set_tennh(String tennh){
		this.tt_tennh = tennh;
	}
	public void set_sdt(String sdt){
		this.tt_sdt = sdt;
	}
	public void set_diachi(String diachi){
		this.tt_diachi = diachi;
	}			  
}
