package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class MenuIniziale extends Application {
    public void start(Stage primaryStage) {
        try {
           /* Parent root = FXMLLoader.load(getClass().getResource("/application/MenuIniziale.fxml"));*/
           Pane mainPane = (Pane)FXMLLoader.load(getClass().getResource("/application/MenuIniziale.fxml"));

           // Scene scene = new Scene(root, 600, 450);
            Scene scene = new Scene(mainPane);
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       launch(args);


       /* JFrame Menu = new JFrame("Pagina iniziale");
        Container c = Menu.getContentPane();
        c.add(new JLabel("Benvenuto"));
        Menu.setSize(1200,1200);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setVisible(true);
        */
    }




}
