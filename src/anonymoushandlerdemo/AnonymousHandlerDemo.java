/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package anonymoushandlerdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ivan
 */
public class AnonymousHandlerDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        //Creating Buttons
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");
        
        //Creating HBox
        HBox hbox = new HBox();
        
        //Adding Buttons to HBox
        hbox.getChildren().add(btnNew);
        hbox.getChildren().add(btnOpen);
        hbox.getChildren().add(btnSave);
        hbox.getChildren().add(btnPrint);
        HBox.setMargin(btnNew, new Insets(10, 0, 10, 30));
        HBox.setMargin(btnOpen, new Insets(10, 0, 10, 10));
        HBox.setMargin(btnSave, new Insets(10, 0, 10, 10));
        HBox.setMargin(btnPrint, new Insets(10, 0, 10, 10));
        
        Scene scene = new Scene(hbox, 250, 50);
        
        //Anonymous Inner Classes
        btnNew.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        System.out.print("Nuevo Proceso\n");
                    }
                });
        btnOpen.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        System.out.print("Abrir Proceso\n");
                    }
                });
        btnSave.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        System.out.print("Guardar Proceso\n");
                    }
                });
        btnPrint.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        System.out.print("Imprimir Proceso\n");
                    }
                });
        
        
        //Setting Title and Scene
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
