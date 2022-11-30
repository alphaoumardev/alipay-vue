package com.alpha.alipay.javaclass;

public class MyException extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	String content;

	public MyException(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
