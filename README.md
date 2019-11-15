# Laboratory_3_IngSoft

## Integrantes: 
* CRISTIAN DAVID MARTINEZ COLLAZOS  
* LAURA VANESSA BOHORQUEZ RAMIREZ
* JIMMY ALEXANDER PULIDO ARIAS

## 1. 

Para realizar el patron *Strategy* implementamos una interface *TransportStrategy* para hacer el Strategy Pattern. luego 3 clases: *Bicicle, Bus y Cap* que implementa la interface.  

Encontramos que el algoritmo que se repite es el de *TakeTransport* que me calcular el tiempo y el dinero usado por el transporte. Este se definio como siguiente: 

> Ell codgo completo se encuentra en la carpeta **1** del repositorio. 


```java
// Bicilce 
...
public void takeTransport(){
        System.out.println("Bicilce was taken with time: " + this.time + " and budget: 0%");
    }
...
// Bus 
...
public void takeTransport(){
        System.out.println("Bus was taken with time: " + this.time + " and budget: " + this.cost);
    }
...
//Cap 
public void takeTransport(){
        System.out.println("Cap was taken with time: " + this.time + " and budget: " + this.cost * this.distance);
    }

```

## 2.

Teniendo como misión agregar una nueva franquicia en Medellin, se crearon 5 clases nuevas. La primera corresponde a la que definirá la franquicia que herederada de la clase PizzaStore y, las restantes corresponden a los diferentes nuevos sabores (recetas) que se podrán adquirir en esta nueva tienda. Todas estas clases heredan de la clase Pizza, asi como lo hace las de NewYork y Chicago en el ejemplo. Finalmente, en la clase DependentPizzaStore y PizzaTestDrive se hicieron los cambios pertinentes para que se pudiesen hacer pruebas con la nueva tienda.

El ejemplo se puede encontrar en el siguiente link

https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/factory/pizzafm

Ahí encontraremos las otras tiendes de NewYork y Chicago con sus respectivas recetas y pruebas

## 3.

El Builder Pattern cumple con la función de crear objetos de forma fácil. En esta ocasión se escogió una situación en dónde se quiere implementar una clase que guarde datos de un estudiante. Continuando con la definición del patrón Builder, se definió la interfaz Builder dónde se implementa el método build. En la clase Student se definieron los hilos que agregarán información al estudiante. Mientras que, en StudentBuilder se definieron todos los atributos y los métodos get y set correspondientes.


## 4. 

Para el punto cuatro seleccionamos los siguientes *AntiPatterns*: 

1. LavaFLow
2. GoodObject

### Lava Flow 

LavaFlow es  una masa de código inútil de la que nadie puede recordar mucho, y generalmente puede parecer impotante y es dificil de entender. 

Utilizamos el ejemplo numero uno e implementamos una clase llamada: *DeclareFunctionalityofTransport*.  

> El codigo se encentra en la carpeta **4**. 

```java 
    class DeclareFunctionalityofTransport { 
    public DeclareFunctionalityofTransport(String typeOfTransportt){
        if typeOfTransportt == "Bicicle"{
            return new Bicicle(); 
        }
        else if typeOfTransportt == "Bus"{
            return new Bus(); 
        }
        else {}
            return new Cap(); 
        }
    }
   // ..............................................
}
```


### GoodObject  

GoodOject es una mala tecnica de programacion de implementar clases u objectos con muchas funciones que bien pueden ser divididas en diferentes objectos o clases. 

Utilizamos una clase *Transport* que realiza muchas funcionalidades. 

> El codigo se encentra en la carpeta **4**. 

```java 
// God object: performs a lot of functions which would be better separated into different objects.
class Transport {
    public void takeTransport();
    public void DepartFrom() {}
    public void ReadFromFile() {}
    public void WriteToFile() {}
    public void DisplayToScreen() {}
    public void PerformCalculation() {}
    public void Validatedestination() {}

    public void Bus(){}
    public void Bicicle(){}
    public void Cap(){}

}
```
