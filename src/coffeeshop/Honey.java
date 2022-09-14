package coffeeshop;

public class Honey extends BeverageDecorater {

	int honeyCost;

	Honey(Beverage beverage, int honeyCost) {
		this.beverage = beverage;
		this.honeyCost = honeyCost;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " topped with Honey";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + honeyCost;
	}
}

