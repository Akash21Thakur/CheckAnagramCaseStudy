package com.me.ws;

import javax.xml.ws.Endpoint;

public class AnagramPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8000/myself", new Anagram());
		System.out.println("Waiting for clients...");
	}
}