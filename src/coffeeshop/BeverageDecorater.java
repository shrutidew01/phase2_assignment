package coffeeshop;

public abstract class BeverageDecorater implements Beverage {

	Beverage beverage;

	@Override
	public abstract String getDescription();

}



