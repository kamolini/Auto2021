package com.abc.util;

import java.util.UUID;

public class Util {
	
	public static String getRandomEmail(){
		return getRandomString()+"@gmail.com";
	}
	
	public static String getRandomString(){
		return UUID.randomUUID().toString();
	}

}
