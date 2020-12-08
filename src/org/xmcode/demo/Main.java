
package org.xmcode.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
    
    public static void main(String[] args) {
       Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //create the text
        Text text =  new Text(" hello javax");
        //create a vbox
        VBox root  =  new VBox();
        //add text to the vBox
        root.getChildren().add(text);
        
        //set the size of the vbox
        root.setMinSize(350, 250);
        //Create the scene
        Scene scene =  new Scene(root);
        // Set the Properties of the Stage
       
        stage.setX(100);
        stage.setY(200);
        stage.setMinHeight(300);
        stage.setMinWidth(400);
        // Add the scene to the Stage
        stage.setScene(scene);
        // Set the title of the Stage
        stage.setTitle("Your first JavaFX Example");
        // Display the Stage
        stage.show();



      
    
    }
    
}
