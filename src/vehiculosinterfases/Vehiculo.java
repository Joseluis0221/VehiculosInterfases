package vehiculosinterfases;

public  abstract class Vehiculo {
    protected double velocidadActual;
    protected double velocidadMaxima;
    
    public Vehiculo(double velocidadActual, double velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
                       
    }
    
    public void acelerar(double incremento) { 
        velocidadActual += incremento;
        if(velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
            
        }
    }
    
    public void frenar(double decremento) { 
        velocidadActual -= decremento;
        if(velocidadActual <0) { 
           velocidadActual = 0;
              
        }
    }
    
    public void imprimir() {
        System.out.println("velocidad actual: " + velocidadActual + "km/h");
        System.out.println("velocidad maxima: " + velocidadMaxima + "km/h");

    }