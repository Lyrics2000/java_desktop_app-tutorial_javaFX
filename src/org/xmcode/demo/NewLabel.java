
package org.xmcode.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class NewLabel extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        // creating the textField
        TextField firstName =  new TextField();
        TextField lastName  =  new TextField();
        
        //creating labels
        Label firstNamelb = new Label("First Name : ");
        Label lastNamelb =  new Label("Last Name : ");
        
        //bind label according to field
        firstNamelb.setLabelFor(firstName);
        //set memonic parsing to the label
        firstNamelb.setMnemonicParsing(true);
        
        //bind label according to field
        lastNamelb.setLabelFor(firstName);
        //bind label according to field
        firstNamelb.setMnemonicParsing(true);
        
        //create grid pane
        GridPane root = new GridPane();
        //adding labels and fields to the gridpane
        // Add the Labels and Fields to the GridPane
        root.addRow(0, firstNamelb, firstName);
        root.addRow(1, lastNamelb, lastName);
        
        // Set the Size of the GridPane
        root.setMinSize(350, 250);
        /*
        * Set the padding of the GridPane
        * Set the border-style of the GridPane
        * Set the border-width of the GridPane
        * Set the border-insets of the GridPane
        * Set the border-radius of the GridPane
        * Set the border-color of the GridPane
        */
        
        root.setStyle("-fx-padding: 10;" +
        "-fx-border-style: solid inside;" +
        "-fx-border-width: 2;" +
        "-fx-border-insets: 5;" +
        "-fx-border-radius: 5;" +
        "-fx-border-color: blue;");
        // Create the Scene
        Scene scene = new Scene(root);
        // Add the scene to the Stage
        stage.setScene(scene);
        // Set the title of the Stage
        stage.setTitle("A Label Example");
        // Display the Stage
        stage.show();



        
        
    }
    
    
}
