package com.abc;

public class Car {

	// Design : Plan :
	
	int engine;

	String brand;

	String model;

	void speed() {

		if (engine >= 10000) {

			System.out.println("speed = 500 km/hr");
		} else if (engine >= 5000) {

			System.out.println("speed = 250 km/hr");
		} else if (engine >= 3000) {

			System.out.println("speed = 150 km/hr");
		} else {

			System.out.println("speed = 100 km/hr");
		}
	}

}
