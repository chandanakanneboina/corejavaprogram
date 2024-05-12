package com.tnsif.abstraction;

public abstract class shape {
protected float area;  // data member
	
	// abstract method
	
	abstract void calarea();
	
	//Concrete method
	
	void show() {
		System.out.println("area of shape"+ area);
	}
}




