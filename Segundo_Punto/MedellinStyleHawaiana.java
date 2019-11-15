// package headfirst.designpatterns.factory.Pizzafm;

public class MedellinStyleCriolla extends Pizza {
	public MedellinStyleCriolla() {
		name = "Pizza Criolla";
		dough = "Masa gruesa con borde de queso";
		sauce = "Salsa de Tomate y extra queso";
 
		toppings.add("Queso mozzarella gratinado");
		toppings.add("Jamon");
		toppings.add("Piña");
	}
 
	void cut() {
		System.out.println("Cortando la pizza en porciones iguales");
	}
}