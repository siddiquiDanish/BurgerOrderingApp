
public class Main {

	public static void main(String[] args) {

		Hamburger hamburger= new Hamburger("Base","Sausage",125,"Roasted Garlic");
		hamburger.addHamburgerAddition1("Cheese", 60);
		hamburger.addHamburgerAddition2("lettuce", 35);
		hamburger.addHamburgerAddition3("Tomato", 20);
		
//		System.out.println("Total bill =  "+hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger= new HealthyBurger("Bacon", 170);
		healthyBurger.addHamburgerAddition1("Egg", 30);
		healthyBurger.addHealthaddition1("Salami", 50);
//		healthyBurger.itemizeHamburger();
		System.out.println("Total bill  =  "+(healthyBurger.itemizeHamburger()+hamburger.itemizeHamburger()));
		DeluxCombo delux= new DeluxCombo();
		delux.addHamburgerAddition1("Cheese", 40);
		delux.itemizeHamburger();
		
	}

}
