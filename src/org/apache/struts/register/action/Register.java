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



	@Override
	public String execute() throws Exception {
		//call Service class to store personBean's state in database
		return SUCCESS;	
	}
}