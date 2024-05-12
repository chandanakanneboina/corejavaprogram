package com.tnsif.inheritance;

  public class child extends Father {
		int s=9;
		public static void main(String[] args) {
			
			child c=new child();
			c.learn();
			System.out.println(c.money);
			System.out.println(c.car);
			System.out.println(c.s);
		}


}
