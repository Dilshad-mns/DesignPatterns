package creator.creatorImpl;

import creator.VehicleCreator;
import product.Vehicle;
import product.productImpl.Bus;

public class BusCreator implements VehicleCreator {

	@Override
	public Vehicle create() {
		// TODO Auto-generated method stub
		return new Bus();
	}

}
