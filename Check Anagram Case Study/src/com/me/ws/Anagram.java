package com.me.ws;

import java.util.Arrays;

import javax.jws.WebService;

@WebService(endpointInterface = "com.me.ws.AnagramService")
public class Anagram{

	public boolean isAnagram(String str1, String str2){
		
		 String s1 = str1.replaceAll("\\s", "");  
	     String s2 = str2.replaceAll("\\s", "");  
	     boolean status = true;  
	     if (s1.length() != s2.length()) {  
	         status = false;  
	     } else {  
	         char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	         char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	         Arrays.sort(ArrayS1);  
	         Arrays.sort(ArrayS2);  
	         status = Arrays.equals(ArrayS1, ArrayS2);  
	     }  
		return status;
	}
}