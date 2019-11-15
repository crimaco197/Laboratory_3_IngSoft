// package headfirst.designpatterns.factory.pizzafm;

public class MedellinStyleBBQ extends Pizza {
	public MedellinStyleBBQ() {
		name = "Pizza BBQ";
		dough = "Masa gruesa con borde de queso";
        sauce = "Salsa BBQ";
 
		toppings.add("Queso mozzarella gratinado");
		toppings.add("Tocineta");
		toppings.add("Carne molida");
        toppings.add("Maíz Tierno");
        toppings.add("Cebolla");
	}
 
	void cut() {
		System.out.println("Cortando la pizza en porciones iguales");
	}
}