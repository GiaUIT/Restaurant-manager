/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author XaraRoyal
 */
public class MAINController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private restaurant.manager.RestaurantManager application;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setapp(restaurant.manager.RestaurantManager application){
        this.application = application;
    }
}
