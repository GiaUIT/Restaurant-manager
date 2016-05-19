/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.manager;

import Controller.*;
import Dto.TAIKHOAN;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author XaraRoyal
 */
public class RestaurantManager extends Application {
     
    private Stage stage;
    private TAIKHOAN tk;
    private final double MINIMUM_WINDOW_WIDTH = 390.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;
    Double initMouseX;
    Double initMouseY;
    Double initStageX;
    Double initStageY;
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            stage = primaryStage;
            stage.setTitle("Restaurant");
            Main();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(restaurant.manager.RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    private void Main() {
            
        try {
            MAINController main;
            main = (MAINController) replaceSceneContent("/View/MAIN.fxml",Color.TRANSPARENT);
            main.setapp(this);
            
        } catch (Exception ex) {
            Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private Initializable replaceSceneContent(String fxml,Color t) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = restaurant.manager.RestaurantManager.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(restaurant.manager.RestaurantManager.class.getResource(fxml));
        AnchorPane page ;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        Scene scene = new Scene(page);
        scene.setFill(t); 
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
    public void close(){
        stage.close();
    }
    public void minium(){
        stage.setIconified(true);
    }
}
