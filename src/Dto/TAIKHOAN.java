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
public class TAIKHOAN {
	public final static String col_matk = "MA_TK";    
	public final static String col_nguoitao = "NGUOI_TAO";
	public final static String col_loaitk = "LOAI_TK";
	public final static String col_ngaytao = "NGAY_TAO";
	public final static String col_matkhau = "MAT_KHAU";

	private String tk_matk;
	private String tk_nguoitao;
	private String tk_loaitk;
	private Date tk_ngaytao;
	private String tk_matkhau;	

	public TAIKHOAN(){};
	public TAIKHOAN( String matk, String nguoitao, String loaitk, Date ngaytao, String matkhau){
		this.tk_matk = matk;
		this.tk_nguoitao = nguoitao;
		this.tk_loaitk = loaitk;
		this.tk_ngaytao = ngaytao;
		this.tk_matkhau = matkhau;

	}

	public String get_matk(){
		return this.tk_matk;
	}
	public String get_nguoitao(){
		return this.tk_nguoitao;
	}
	public String get_loaitk(){
		return this.tk_loaitk;
	}
	public Date get_ngaytao(){
		return this.tk_ngaytao;
	}
	public String get_matkhau(){
		return this.tk_matkhau;
	}

	public void set_matk(String matk){
		this.tk_matk = matk;
	}
	public void set_nguoitao(String nguoitao){
		this.tk_nguoitao = nguoitao;
	}
	public void set_loaitk(String loaitk){
		this.tk_loaitk = loaitk;
	}
	public void set_ngaytao(Date ngaytao){
		this.tk_ngaytao = ngaytao;
	}
	public void set_matkhau(String matkhau){
		this.tk_matkhau = matkhau;
	}	

}
