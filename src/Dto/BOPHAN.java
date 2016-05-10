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
public  class BOPHAN {
   public final static String col_mabp = "MA_BP";
   public final static String col_ql ="MA_QL";
   public final static String col_ten ="TEN_BP";
   
   private String bp_mabp;
   private String bp_maql;
   private String bp_tenbp;
   
   public BOPHAN(){};
   public BOPHAN(String ma,String ql, String ten){
       this.bp_mabp = ma;
       this.bp_maql = ql;
       this.bp_tenbp = ten;
   }
   public String get_mabp(){
       return this.bp_mabp;
   }
   public String get_quanly(){
       return this.bp_maql;
   }
   public String get_tenbp(){
       return this.bp_tenbp;
   }
   public void set_mabp(String ma){
       this.bp_mabp = ma;
   }
   public void set_maql(String maql){
       this.bp_maql = maql;
   }
   public void set_tenb(String ten){
       this.bp_tenbp = ten;
   }
}
