package org.apache.struts.action;

import org.apache.struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private static int helloCount = 0;

    public int getHelloCount() {
    	return helloCount;
    }

    public void setHelloCount(int helloCount) {
    	HelloWorldAction.helloCount = helloCount;
    }
    
    
    
	private static final long serialVersionUID = 1L;

	private MessageStore messageStore;
	
	public String execute() throws Exception {
		
		messageStore = new MessageStore() ;
		helloCount++;
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

}