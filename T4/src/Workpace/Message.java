package Workpace;

public class Message{
	private String type;
	private String body;
	private boolean valid;
	public Message(String messageLine){ 
	valid=false;
	type=body=null;
	int pos=messageLine.indexOf(":"); 
	if(pos>=0){
	type=messageLine.substring(0,pos).toUpperCase();
	body=messageLine.substring(pos+1);
	valid=true;
	}
	}
	public Message(String type,String body){
	valid=true;
	this.type=type;
	this.body=body;
	}
	public String getType(){
	return type;
	}
	public String getBody(){
	return body;
	}
	public boolean isValid(){
	return valid;
	}
	} 
