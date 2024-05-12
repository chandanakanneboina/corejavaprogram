package com.tnsif.abstraction;

public class square extends shape {
private float side;   // data member or variables
	
	public square() {
		side=3.2f;
	}

	@Override
	void calarea() {
		super.area=side*side;
		
	}

}

	

}
