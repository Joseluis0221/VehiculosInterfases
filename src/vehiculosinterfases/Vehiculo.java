/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculosinterfases;

/**
 *
 * @author usuario
 */
public  abstract class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMaxima;
    
    public Vehiculo(int velocidadMaxima) {
        this.velocidadActual = 0;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public abstract void acelerar(int incremento);
    public abstract void frenar (int decremento);
    
    public void imprimir() {
        System.out.println("Velocidad Actual:" + velocidadActual + "km/h");
        System.out.println("Velocidad Maxima:" + velocidadMaxima + "km/h");
    
                
    }
    
}
