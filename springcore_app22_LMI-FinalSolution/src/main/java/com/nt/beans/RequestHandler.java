package com.nt.beans;

public class RequestHandler {
	private static int count;
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler::0-param constructor");
	}
	
	public void proessingRequest(String data){
		System.out.println("RequestHandler:: processsing "+count+"number request with data"+data);
	}

}
