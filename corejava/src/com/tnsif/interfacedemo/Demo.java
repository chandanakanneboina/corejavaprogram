package com.tnsif.interfacedemo;

public class Demo implements ParentInterface {
	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void print() {
		System.out.println("print");
		
	}
}