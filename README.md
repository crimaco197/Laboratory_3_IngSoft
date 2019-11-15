# Laboratory_3_IngSoft

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