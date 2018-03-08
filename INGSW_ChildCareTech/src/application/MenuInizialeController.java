package application;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MenuInizialeController {
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

}
