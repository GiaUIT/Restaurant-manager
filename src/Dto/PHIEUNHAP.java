/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

import java.sql.Date;

/**
 *
 * @author XaraRoyal
 */
public class PHIEUNHAP {
	public final static String col_mapn = "MA_PN";    
	public final static String col_makho = "MA_KHO";
	public final static String col_tenpn = "TEN_PN";
	public final static String col_ngay = "NGAY";    

	private String pn_mapn;
	private String pn_makho;
	private String pn_tenpn;
	private Date pn_ngay;	

	public PHIEUNHAP(){};
	public PHIEUNHAP(String mapn, String makho, String tenpn, Date ngay){
		this.pn_mapn = mapn;
		this.pn_makho = makho;
		this.pn_tenpn = tenpn;
		this.pn_ngay = ngay;		
	}	

	public String get_mapn(){
		return this.pn_mapn;
	}
	public String get_makho(){
		return this.pn_makho;
	}
	public String get_tenpn(){
		return this.pn_tenpn;
	}
	public Date get_ngay(){
		return this.pn_ngay;
	}	

	public void set_mapn(String mapn){
		this.pn_mapn = mapn;
	}
	public void set_makho(String makho){
		this.pn_makho = makho;
	}
	public void set_tenpn(String tenpn){
		this.pn_tenpn = tenpn;
	}
	public void set_ngay(Date ngay){
		this.pn_ngay = ngay;
	}	
}
