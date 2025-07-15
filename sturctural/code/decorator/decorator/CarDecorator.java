package sturctural.code.decorator.decorator;

import sturctural.code.decorator.base.Car;

public abstract class CarDecorator extends Car{
	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}
	
}
