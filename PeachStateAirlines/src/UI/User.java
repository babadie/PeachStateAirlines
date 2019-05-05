package UI;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
	
	 public StringProperty firstName, 
	 					   lastName, 
	 					   address, 
	 					   zipcode, 
	 					   state, 
	 					   username, 
	 					   password, 
	 					   email, 
	 					   ssn, 
	 					   securityQuestion, 
	 					   answer;
	 
	 public User() {
		 firstName = new SimpleStringProperty();
		 lastName = new SimpleStringProperty();
		 address = new SimpleStringProperty();
		 zipcode = new SimpleStringProperty();
		 state = new SimpleStringProperty();
		 username = new SimpleStringProperty();
		 password = new SimpleStringProperty();
		 email = new SimpleStringProperty();
		 ssn = new SimpleStringProperty();
		 securityQuestion = new SimpleStringProperty();
		 answer = new SimpleStringProperty();

	 }

	 
	 
	public User(StringProperty firstName, 
				StringProperty lastName, 
				StringProperty address, 
				StringProperty zipcode,
				StringProperty state, 
				StringProperty username, 
				StringProperty password, 
				StringProperty email,
				StringProperty ssn, 
				StringProperty securityQuestion, 
				StringProperty answer) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zipcode = zipcode;
		this.state = state;
		this.username = username;
		this.password = password;
		this.email = email;
		this.ssn = ssn;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	}



	public StringProperty getFirstName() {
		return firstName;
	}



	public void setFirstName(StringProperty firstName) {
		this.firstName = firstName;
	}



	public StringProperty getLastName() {
		return lastName;
	}



	public void setLastName(StringProperty lastName) {
		this.lastName = lastName;
	}



	public StringProperty getAddress() {
		return address;
	}



	public void setAddress(StringProperty address) {
		this.address = address;
	}



	public StringProperty getZipcode() {
		return zipcode;
	}



	public void setZipcode(StringProperty zipcode) {
		this.zipcode = zipcode;
	}



	public StringProperty getState() {
		return state;
	}



	public void setState(StringProperty state) {
		this.state = state;
	}



	public StringProperty getUsername() {
		return username;
	}



	public void setUsername(StringProperty username) {
		this.username = username;
	}



	public StringProperty getPassword() {
		return password;
	}



	public void setPassword(StringProperty password) {
		this.password = password;
	}



	public StringProperty getEmail() {
		return email;
	}



	public void setEmail(StringProperty email) {
		this.email = email;
	}



	public StringProperty getSsn() {
		return ssn;
	}



	public void setSsn(StringProperty ssn) {
		this.ssn = ssn;
	}



	public StringProperty getSecurityQuestion() {
		return securityQuestion;
	}



	public void setSecurityQuestion(StringProperty securityQuestion) {
		this.securityQuestion = securityQuestion;
	}



	public StringProperty getAnswer() {
		return answer;
	}



	public void setAnswer(StringProperty answer) {
		this.answer = answer;
	}
	
	@Override
    public String toString() {
        return "First Name: " + firstName +
        	   "Last Name: " + lastName +
        	   "Address: " + address +
        	   "Zipcode: " + zipcode +
        	   "State: " + state +
        	   "Username: " + username +
        	   "Password: " + password +
        	   "Email: " + email +
        	   "SSN: " + ssn +
        	   "Security Question: " + securityQuestion +
        	   "Answer: " + answer;

   

}
}
