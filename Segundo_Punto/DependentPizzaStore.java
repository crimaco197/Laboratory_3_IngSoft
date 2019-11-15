// package headfirst.designpatterns.factory.pizzafm;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("Medellin")) {
			if (type.equals("BBQ")) {
				pizza = new MedellinStyleBBQ();
			} else if (type.equals("Criolla")) {
				pizza = new MedellinStyleCriolla();
			} else if (type.equals("Hawaiana")) {
				pizza = new MedellinStyleHawaiana();
			} else if (type.equals("Vegetariana")) {
				pizza = new MedellinStyleVegetariana();
			}
		}  else {
			System.out.println("Error: iEse sabor no existe");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}