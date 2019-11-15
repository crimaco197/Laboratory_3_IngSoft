// package headfirst.designpatterns.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore medellinStore = new MedellinPizzaStore();
 
		Pizza pizza = medellinStore.orderPizza("BBQ");
		System.out.println("Ethan ordenó una " + pizza.getName() + "\n");
 
		pizza = medellinStore.orderPizza("Criolla");
		System.out.println("Joel ordenó una " + pizza.getName() + "\n");

		pizza = medellinStore.orderPizza("Hawaiana");
		System.out.println("Ethan ordenó una " + pizza.getName() + "\n");
 
		pizza = medellinStore.orderPizza("Vegetariana");
		System.out.println("Joel ordenó una " + pizza.getName() + "\n");
	}
}