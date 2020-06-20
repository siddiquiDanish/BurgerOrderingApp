
public class DeluxCombo extends Hamburger {

	public DeluxCombo() {
		super("Delux", "Sausage & Bacon", 325, "Grilled");
		super.addHamburgerAddition1("Chips", 30);
		super.addHamburgerAddition2("Coke", 60);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item to Combos!");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add additional item to Combos!");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item to Combos!");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item to Combos!");
	}
	

}
