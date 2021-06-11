package com.techlab.test;

import com.techlab.model.Boy;
import com.techlab.model.Infant;
import com.techlab.model.Kids;
import com.techlab.model.Man;

public class PolymorhismTest {

	public static void main(String[] args) {
		atThePark(new Boy());
		atThePark(new Kids());
		atThePark(new Infant());
		atThePark(new Man());
	}
	
	public static void atThePark(Man m) {
		m.play();
		m.eat();
	}
	
}
