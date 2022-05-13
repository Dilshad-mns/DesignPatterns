package creator.creatorImpl;

import creator.VehicleCreator;
import product.Vehicle;
import product.productImpl.Car;

public class CarCreator implements VehicleCreator{

	@Override
	public Vehicle create() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
