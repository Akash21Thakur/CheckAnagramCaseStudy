package com.me.ws;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class AnagramClient {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://127.0.0.1:8000/myself?wsdl");
		
		QName qname = new QName("http://ws.me.com/","AnagramService");
		
		Service service = Service.create(url, qname);
		
		AnagramService endPoint = service.getPort(AnagramService.class);
		
		Scanner scInput = new Scanner(System.in);
		
		String str1,str2 ;
		boolean result;
		System.out.print("Enter String-1 : ");
		str1 = scInput.nextLine();
		System.out.print("Enter String-2 : ");
		str2 = scInput.nextLine();
		result = endPoint.anagramCheck(str1, str2);
		if(result){
			System.out.println(str1 + " and " + str2 +  " are anagram strings. ");	
		}
		else{
			System.out.println(str1 + " and " + str2 +  " are  NOT anagram strings. ");
		}
		
		scInput.close();
	}
}