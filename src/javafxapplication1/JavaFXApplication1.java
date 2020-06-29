/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author Khalid
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
        //UI DEFINE
        Label laNumber1 = new Label("Number1");
        TextField txtNumber1 = new TextField();
         Label laNumber2 = new Label("Number1");
        TextField txtNumber2 = new TextField();
        Label laResults = new Label("Sums = ");
        Button btn = new Button();
        btn.setText("Click to Sum");
        btn.setOnAction(evemt->{
            //sum operation
            int n1 =Integer.parseInt(txtNumber1.getText().toString());
            int n2 = Integer.parseInt(txtNumber2.getText().toString());
            int sum = n1 + n2;
            laResults.setText("sum:"+ sum );
        });
        
        //set ui
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
//        grid.setGridLinesVisible(true); //for development only
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        //add UI to grid
        grid.add(laNumber1, 0, 0);
        grid.add(txtNumber1, 1, 0);
        grid.add(laNumber2,0,1);
        grid.add(txtNumber2, 1, 1);
        grid.add(laResults,1,2);
        grid.add(btn,2,3);
        Scene scene = new Scene(grid,400,350);
        
        primaryStage.setTitle("Hello World!");
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
