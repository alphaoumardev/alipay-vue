package com.alpha.alipay.javaclass;

public class the_exception
{
	public static void check(String str) throws MyException {
//		str  :   123sdsfdsDFDdsff
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(!(c>='a'&&c<='z')){
			  throw new MyException("That's the exception");	
			}
		}
	}
	public static void main(String[] args) {
		try {
			check("Alphaoumardiallo");
		} catch (MyException e) {
			System.out.print(e.getContent());
		}
	}
}
