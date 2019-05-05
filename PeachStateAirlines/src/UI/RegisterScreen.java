package UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegisterScreen extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    
    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	//GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 700, 500);
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
        window = primaryStage;
        window.setTitle("Registration Window");
        
        
        window.setScene(scene);
        window.show();

        
        //First Name Label - constrains use (child, column, row)
        Label firstNameLBL = new Label("First Name:");
        GridPane.setConstraints(firstNameLBL, 0, 0);
        
        //Last Name Label - constrains use (child, column, row)
        Label lastNameLBL = new Label("Last Name:");
        GridPane.setConstraints(lastNameLBL, 0 , 1);
        
        //Address Label - constrains use (child, column, row)
        Label addressLBL = new Label("Address:");
        GridPane.setConstraints(addressLBL, 0, 2);
        
        //Zipcode Label - constrains use (child, column, row)
        Label zipcodeLBL = new Label("Zipcode:");
        GridPane.setConstraints(zipcodeLBL, 0, 3);
        
        //State Label - constrains use (child, column, row)
        Label stateLBL = new Label("State:");
        GridPane.setConstraints(stateLBL, 0, 4);
        
        //Username Label - constrains use (child, column, row)
        Label usernameLBL = new Label("Username:");
        GridPane.setConstraints(usernameLBL, 0, 5);
        
        //Password Label - constrains use (child, column, row)
        Label passwordLBL = new Label("Password:");
        GridPane.setConstraints(passwordLBL, 0, 6);
        
        //Email Label - constrains use (child, column, row)
        Label emailLBL = new Label("E-mail:");
        GridPane.setConstraints(emailLBL, 0, 7);
        
        //SSN Label - constrains use (child, column, row)
        Label ssnLBL = new Label("SSN:");
        GridPane.setConstraints(ssnLBL, 0, 8);
        
        //Security Question Label - constrains use (child, column, row)
        Label securityQuestionLBL = new Label("Security Question:");
        GridPane.setConstraints(securityQuestionLBL, 0, 9);
        
        //Answer Label - constrains use (child, column, row)
        Label answerLBL = new Label("Answer:");
        GridPane.setConstraints(answerLBL, 0, 10);
        
        
        
        
        
      //First Name Label - constrains use (child, column, row)
        TextField firstNameTXT = new TextField();
        GridPane.setConstraints(firstNameTXT, 1, 0);
        
        //Last Name Label - constrains use (child, column, row)
        TextField lastNameTXT = new TextField();
        GridPane.setConstraints(lastNameTXT, 1, 1);
        
        //Address Label - constrains use (child, column, row)
        TextField addressTXT = new TextField();
        GridPane.setConstraints(addressTXT, 1, 2);
        
        //Zipcode Label - constrains use (child, column, row)
        TextField zipcodeTXT = new TextField();
        GridPane.setConstraints(zipcodeTXT, 1, 3);
        
        //State Label - constrains use (child, column, row)
        TextField stateTXT = new TextField();
        GridPane.setConstraints(stateTXT, 1, 4);
        
        //Username Label - constrains use (child, column, row)
        TextField usernameTXT = new TextField();
        GridPane.setConstraints(usernameTXT, 1, 5);
        
        //Password Label - constrains use (child, column, row)
        TextField passwordTXT = new TextField();
        GridPane.setConstraints(passwordTXT, 1, 6);
        
        //Email Label - constrains use (child, column, row)
        TextField emailTXT = new TextField();
        GridPane.setConstraints(emailTXT, 1, 7);
        
        //SSN Label - constrains use (child, column, row)
        TextField ssnTXT = new TextField();
        GridPane.setConstraints(ssnTXT, 1, 8);
        
        //Security Question Label - constrains use (child, column, row)
        TextField securityQuestionTXT = new TextField();
        GridPane.setConstraints(securityQuestionTXT, 1, 9);
        
        //Answer Label - constrains use (child, column, row)
        TextField answerTXT = new TextField();
        GridPane.setConstraints(answerTXT, 1, 10);
       


        //Login
        Button loginButton = new Button("Create User");
        GridPane.setConstraints(loginButton, 1, 11);

        //Add everything to grid
        grid.getChildren().addAll(firstNameLBL, 
        					      lastNameLBL, 
        					      addressLBL, 
        					      zipcodeLBL, 
        					      stateLBL,
        					      usernameLBL, 
        					      passwordLBL, 
        					      emailLBL, 
        					      ssnLBL, 
        					      securityQuestionLBL,
        					      answerLBL, 
        					      firstNameTXT, 
        					      lastNameTXT, 
        					      addressTXT, 
        					      zipcodeTXT, 
        					      stateTXT,
        					      usernameTXT, 
        					      passwordTXT, 
        					      emailTXT, 
        					      ssnTXT, 
        					      securityQuestionTXT,
        					      answerTXT, 
        					      loginButton);
        

  
        
    }


}
