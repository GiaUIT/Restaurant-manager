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
public class NHANVIEN {
	public final static String col_manv = "MA_NV";    
	public final static String col_mabp = "MA_BP";
	public final static String col_tennv = "TEN_NV";
	public final static String col_luong = "LUONG";
	public final static String col_hoahong = "HOA_HONG";
	public final static String col_diachi = "DIA_CHI";
	public final static String col_sdt = "SDT";
	public final static String col_ngayvl = "NGAY_VL";
	public final static String col_cmnd = "CMND";
	public final static String col_hinh = "HINH";

	private String nv_manv;
	private String nv_mabp;
	private String nv_tennv;
	private int nv_luong;
	private int nv_hoahong;
	private String nv_diachi;
	private String nv_sdt;
	private Date nv_ngayvl;
	private String nv_cmnd;
	private String nv_hinh;

	public NHANVIEN(){};
	public NHANVIEN(String manv, String mabp, String tennv, int luong, int hoahong, String diachi, String sdt, Date ngayvl, String cmnd, String hinh){
		this.nv_manv = manv;
		this.nv_mabp = mabp;
		this.nv_tennv = tennv;
		this.nv_luong = luong;
		this.nv_hoahong = hoahong;
		this.nv_diachi = diachi;
		this.nv_sdt = sdt;
		this.nv_ngayvl = ngayvl;
		this.nv_cmnd = cmnd;
		this.nv_hinh = hinh;
	}

	public String get_manv(){
		return this.nv_manv;
	}
	public String get_mabp(){
		return this.nv_mabp;
	}
	public String get_tennv(){
		return this.nv_tennv;
	}
	public int get_luong(){
		return this.nv_luong;
	}
	public int get_hoahong(){
		return this.nv_hoahong;
	}
	public String get_daichi(){
		return this.nv_diachi;
	}
	public String get_sdt(){
		return this.nv_sdt;
	}
	public Date get_ngayvl(){
		return this.nv_ngayvl;
	}
	public String get_cmnd(){
		return this.nv_cmnd;
	}
	public String get_hinh(){
		return this.nv_hinh;
	}	

	public void set_manv(String manv){
		this.nv_manv = manv;
	}
	public void set_mabp(String mabp){
		this.nv_mabp = mabp;
	}
	public void set_tennv(String tennv){
		this.nv_tennv = tennv;
	}
	public void set_luong(int luong ){
		this.nv_luong = luong;
	}
	public void set_hoahong(int hoahong ){
		this.nv_hoahong = hoahong;
	}
	public void set_diachi(String diachi){
		this.nv_diachi = diachi;
	}
	public void set_sdt(String sdt){
		this.nv_sdt = sdt;
	}
	public void set_ngayvl(Date ngayvl){
		this.nv_ngayvl = ngayvl;
	}
	public void set_cmnd(String cmnd){
		this.nv_cmnd = cmnd;
	}
	public void set_hinh(String hinh){
		this.nv_hinh = hinh;
	}

}
