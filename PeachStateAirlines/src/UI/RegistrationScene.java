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

public class RegistrationScene {
	
	private Scene scene;
	private GridPane grid;
	private static Label firstNameLBL, 
		  		 lastNameLBL, 
		  		 addressLBL, 
		  		 zipcodeLBL, 
		  		 stateLBL, 
		  		 usernameLBL, 
		  		 passwordLBL, 
		  		 emailLBL, 
		  		 ssnLBL, 
		  		 securityQuestionLBL, 
		  		 answerLBL;
	private static TextField firstNameTXT, 
	  		  		 lastNameTXT,
	  		  		 addressTXT,
	  		  		 zipcodeTXT,
	  		  		 stateTXT,
	  		  		 usernameTXT,
	  		  		 passwordTXT,
	  		  		 emailTXT,
	  		  		 ssnTXT,
	  		  		 securityQuestionTXT,
	  		  		 answerTXT;
	
	private static Button loginButton;
	
	public static void initialize() {
		
        firstNameLBL = new Label("First Name:");
        lastNameLBL = new Label("Last Name:");  
        addressLBL = new Label("Address:");
        zipcodeLBL = new Label("Zipcode:");       
        stateLBL = new Label("State:");        
        usernameLBL = new Label("Username:");       
        passwordLBL = new Label("Password:");        
        emailLBL = new Label("E-mail:");        
        ssnLBL = new Label("SSN:");       
        securityQuestionLBL = new Label("Security Question:");
        answerLBL = new Label("Answer:");
        
        firstNameTXT = new TextField();
        lastNameTXT = new TextField();  
        addressTXT = new TextField();
        zipcodeTXT = new TextField();       
        stateTXT = new TextField();        
        usernameTXT = new TextField();       
        passwordTXT = new TextField();        
        emailTXT = new TextField();        
        ssnTXT = new TextField();       
        securityQuestionTXT = new TextField();
        answerTXT = new TextField();
        
        loginButton = new Button("Create User");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setPadding(new Insets(30,30,30,30));
        grid.setVgap(15);
        grid.setHgap(12);
        
        GridPane.setConstraints(firstNameLBL, 0, 0);
        GridPane.setConstraints(lastNameLBL, 0 , 1);
        GridPane.setConstraints(addressLBL, 0, 2);
        GridPane.setConstraints(zipcodeLBL, 0, 3);
        GridPane.setConstraints(stateLBL, 0, 4);
        GridPane.setConstraints(usernameLBL, 0, 5);
        GridPane.setConstraints(passwordLBL, 0, 6);
        GridPane.setConstraints(emailLBL, 0, 7);
        GridPane.setConstraints(ssnLBL, 0, 8);
        GridPane.setConstraints(securityQuestionLBL, 0, 9);
        GridPane.setConstraints(answerLBL, 0, 10);
        
        GridPane.setConstraints(firstNameTXT, 1, 0);
        GridPane.setConstraints(lastNameTXT, 1, 1);
        GridPane.setConstraints(addressTXT, 1, 2);
        GridPane.setConstraints(zipcodeTXT, 1, 3);
        GridPane.setConstraints(stateTXT, 1, 4);
        GridPane.setConstraints(usernameTXT, 1, 5);
        GridPane.setConstraints(passwordTXT, 1, 6);
        GridPane.setConstraints(emailTXT, 1, 7);
        GridPane.setConstraints(ssnTXT, 1, 8);
        GridPane.setConstraints(securityQuestionTXT, 1, 9);
        GridPane.setConstraints(answerTXT, 1, 10);
        
        GridPane.setConstraints(loginButton, 1, 11);

        

        
        System.out.println("registration screen initialized");

        
        
	}

	public Scene getScene() {
		return scene;
	}

	public GridPane getGrid() {
		return grid;
	}

	public static Label getFirstNameLBL() {
		return firstNameLBL;
	}

	public static Label getLastNameLBL() {
		return lastNameLBL;
	}

	public static Label getAddressLBL() {
		return addressLBL;
	}

	public static Label getZipcodeLBL() {
		return zipcodeLBL;
	}

	public static Label getStateLBL() {
		return stateLBL;
	}

	public static Label getUsernameLBL() {
		return usernameLBL;
	}

	public static Label getPasswordLBL() {
		return passwordLBL;
	}

	public static Label getEmailLBL() {
		return emailLBL;
	}

	public static Label getSsnLBL() {
		return ssnLBL;
	}

	public static Label getSecurityQuestionLBL() {
		return securityQuestionLBL;
	}

	public static Label getAnswerLBL() {
		return answerLBL;
	}

	public static TextField getFirstNameTXT() {
		return firstNameTXT;
	}

	public static TextField getLastNameTXT() {
		return lastNameTXT;
	}

	public static TextField getAddressTXT() {
		return addressTXT;
	}

	public static TextField getZipcodeTXT() {
		return zipcodeTXT;
	}

	public static TextField getStateTXT() {
		return stateTXT;
	}

	public static TextField getUsernameTXT() {
		return usernameTXT;
	}

	public static TextField getPasswordTXT() {
		return passwordTXT;
	}

	public static TextField getEmailTXT() {
		return emailTXT;
	}

	public static TextField getSsnTXT() {
		return ssnTXT;
	}

	public static TextField getSecurityQuestionTXT() {
		return securityQuestionTXT;
	}

	public static TextField getAnswerTXT() {
		return answerTXT;
	}

	public static Button getLoginButton() {
		return loginButton;
	}

}
