/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author XaraRoyal
 */
public class LOGINController extends AnchorPane implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    JFXTextField taikhoan;
    @FXML
    JFXPasswordField matkhau;
    @FXML
    JFXButton dangnhap;
    @FXML
    Label loi;
    @FXML
    JFXButton bt_close;
    @FXML
    JFXButton bt_minimum;
    
    private restaurant.manager.RestaurantManager application;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void setapp(restaurant.manager.RestaurantManager application){
        this.application = application;
    }
    public void process_login(){
       System.out.print("Đăng nhập");
    }
    public void close_login(){
        try {
            this.application.close();
            System.out.println("Ket thuc chuong trinh");
        } catch (Exception ex) {
            Logger.getLogger(LOGINController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void mini_login(){
        try {
            this.application.minium();
            System.out.println("Thu nhỏ");
        } catch (Exception ex) {
            Logger.getLogger(LOGINController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
