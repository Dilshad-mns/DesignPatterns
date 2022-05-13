package transport;

import creator.VehicleCreator;
import creator.creatorImpl.*;
import product.Vehicle;

public class Transport {
	

	
	public static void main(String ...args) {
		VehicleCreator carCreator;
		VehicleCreator busCreator;
		
		System.out.println("---Creating Car creator ---");
		carCreator = new CarCreator();
		System.out.println("---Creating car");
		Vehicle car = carCreator.create();
		System.out.println("---Strating  car---");
		car.start();
		
		System.out.println("---Creating Bus creator ---");
		busCreator = new BusCreator();
		System.out.println("---Creating car");
		Vehicle bus = busCreator.create();
		System.out.println("---Strating  car---");
		bus.start();
	}
}
