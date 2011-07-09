package org.apache.struts.action;

import org.apache.struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    
    /* 
        COUNTER 
    */
    private static int helloCount = 0;

    public int getHelloCount() {
    	return helloCount;
    }

    public void setHelloCount(int helloCount) {
    	HelloWorldAction.helloCount = helloCount;
    }
    
    
    /*
        Handling the basic message 
    */
	private MessageStore messageStore;
	
	public String execute() throws Exception {
		messageStore = new MessageStore();
		
		if (userName != null) {
        	messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }
		
		helloCount++;
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
	
	
	/*
	    Handling custom user name (input)
	*/
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
    }

}