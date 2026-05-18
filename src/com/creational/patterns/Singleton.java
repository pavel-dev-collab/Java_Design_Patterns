package com.creational.patterns;

public class Singleton {
	
	private static  Singleton instance;
	
	private Singleton() {};
	
	public static Singleton getIntance() {
		
		if(instance == null)
			return instance =new Singleton();
	
        return instance; 
	}

}
