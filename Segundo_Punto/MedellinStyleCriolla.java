// package headfirst.designpatterns.factory.pizzafm;

public class MedellinStyleCriolla extends Pizza {
	public MedellinStyleCriolla() {
		name = "Pizza Criolla";
		dough = "Masa gruesa con borde de bocadillo";
		sauce = "Salsa de Tomate";
 
		toppings.add("Queso mozzarella gratinado");
		toppings.add("Maíz");
		toppings.add("Carne molida");
		toppings.add("Chorizo");
	}
 
	void cut() {
		System.out.println("Cortando la pizza en porciones iguales");
	}
}