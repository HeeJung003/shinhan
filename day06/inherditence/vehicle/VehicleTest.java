package com.shinhan.day06.inherditence.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car("승용차", 180, 15);		
		Bus bus = new Bus("시내버스", 100, 40);	
		Truck truck = new Truck("트럭", 90, 5000);

		car.info();
		bus.info();
		truck.info();
		
		truck.setName("화물트럭");
		Truck truck2 = new Truck(truck.getName(), 90, 50000);
		truck2.info();
	}

}
