// package headfirst.designpatterns.factory.pizzafm;

public class MedellinStyleVegetariana extends Pizza {
	public MedellinStyleVegetariana() {
		name = "Pizza Vegetariana";
		dough = "Masa gruesa";
		sauce = "Salsa de Tomate";
 
		toppings.add("Tofu");
		toppings.add("Cebolla");
		toppings.add("Pimenton");
        toppings.add("Tomate");
        toppings.add("Champiñon");
	}
 
	void cut() {
		System.out.println("Cortando la pizza en porciones iguales");
	}
}