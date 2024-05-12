package com.tnsif.superkeyword;
public class Superchild extends Supervaribale{
	
	int a=7;
	
	void drink() {
		System.out.println("coffee");
	}	
	void display() {
		drink();
	}
	public static void main(String[] args) {
		Superchild c=new Superchild();
		c.display();
	
		
	}

}
