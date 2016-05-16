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
public class THUCDON {
    public final static String col_matd = "MA_TD";
    public final static String col_tentd = "TEN_TD";

	private String td_matd;
	private String td_tentd;    

	public THUCDON(){};
	public THUCDON(String matd, String tentd){
		this.td_matd = matd;
		this.td_tentd = tentd;		
	}	

	public String get_matd(){
		return this.td_matd;
	}
	public String get_tentd(){
		return this.td_tentd;
	}	

	public void set_matd(String matd){
		this.td_matd = matd;
	}
	public void set_tentd(String tentd){
		this.td_tentd = tentd;
	}	
}
