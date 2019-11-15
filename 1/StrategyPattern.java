import java.util.ArrayList;

@FunctionalInterface
interface TransportStrategy {
    public void takeTransport();
}

class Bicicle implements TransportStrategy {
    public  float velocity = 2;  // 2km per hour 
    public float distance; 
    public float time; 
    public Bicicle( float distance ){
        this.distance = distance; 
        this.time = distance/velocity; 
    }

    public void takeTransport(){
        System.out.println("Bicilce was taken with time: " + this.time + " and budget: 0%");
    }

}

class Bus implements TransportStrategy {
    public  float velocity = 10;  // 10km per hour 
    public  float cost = 5;  // 5 $ 
    public float distance; 
    public float time; 
    public Bus( float distance ){
        this.distance = distance; 
        this.time = distance/velocity; 
    }


    public void takeTransport(){
        System.out.println("Bus was taken with time: " + this.time + " and budget: " + this.cost);
    }

}
class Cap implements TransportStrategy {
    public  float velocity = 30;  // 30km per hour 
    public  float cost = 2;  // 2$ per km
    public float distance; 
    public float time; 

    public Cap( float distance ){
        this.distance = distance; 
        this.time = distance/velocity; 
    }


    public void takeTransport(){
        System.out.println("Cap was taken with time: " + this.time + " and budget: " + this.cost * this.distance);
    }

}

class Customer {
    public float budget; 
    public float time; 
    public float distance;

    public Customer(float budget, float time, float distance) {
        this.budget = budget;
        this.time = time; 
        this.distance = distance; 
    }

    public void takeTransport(TransportStrategy transport){
        transport.takeTransport(); 
    }

}

public class StrategyPattern {
    public static void main(String[] arguments) {
        Customer firstCustomer = new Customer(500, 1 , 100);
        Customer seondCustomer = new Customer(0, 1 , 1);

        firstCustomer.takeTransport( new Cap(firstCustomer.distance));

        seondCustomer.takeTransport( new Bicicle(firstCustomer.distance));

        firstCustomer.takeTransport( new Bus(firstCustomer.distance));
    }
}