package sturctural.code.decorator.decorator;

import sturctural.code.decorator.base.Car;

public class SeatCover extends CarDecorator {

	public SeatCover(Car car) {
		super(car);
	}

	private final double seatCoverPrice = 10000.00;

	@Override
	public double cost() {
		return car.cost() + seatCoverPrice;
	}
}
