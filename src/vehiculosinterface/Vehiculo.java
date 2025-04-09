
package vehiculosinterface;

public abstract class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadActual = 0;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar(int incremento);
    public abstract void frenar(int decremento);

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}