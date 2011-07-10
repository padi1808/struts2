package org.apache.struts.register.action;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
		
		
	private Person personBean;
	
	public Person getPersonBean() {
		return personBean;
	}
	
	public void setPersonBean(Person person) {
		personBean = person;
	}
	

//Validation
public void validate(){
	
	if (personBean.getFirstName().length() == 0 ){	
		addFieldError( "personBean.firstName", "First name is required." );		
	}
			
	if (personBean.getEmail().length() == 0 ){	
		addFieldError( "personBean.email", "Email is required." );		
	}
	
	if (personBean.getAge() < 18 ){	
		addFieldError( "personBean.age", "Age is required and must be 18 or older." );		
	}	
}


	@Override
	public String execute() throws Exception {
		//call Service class to store personBean's state in database
		return SUCCESS;	
	}
}