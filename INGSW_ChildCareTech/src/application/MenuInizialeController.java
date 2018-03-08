package application;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.lang.model.AnnotatedConstruct;
import java.time.LocalDate;


public class MenuInizialeController {

    public void fornitore(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fornitore.fxml"));

            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene (root1));
            stage.show();

        }catch (Exception e){
            System.out.println("error");
        }

    }

    public void bambini() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Bambini.fxml"));

            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene (root1));
            stage.show();

        }catch (Exception e){
            System.out.println("error");
        }

    }

    public void PersonaleInterno(){

       try{ FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PersonaleInterno.fxml"));

        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene (root1));
        stage.show();

    }catch (Exception e){
        System.out.println("error");
    }

    }

    public void ReturnToHomePage(){

    }

}
