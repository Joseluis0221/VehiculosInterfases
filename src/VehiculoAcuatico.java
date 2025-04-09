
package vehiculosinterface;

public class VehiculoAcuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public VehiculoAcuatico(int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int incremento) {
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            System.out.println("No se recomienda salir a navegar. Velocidad actual se reduce a 0.");
            velocidadActual = 0;
        } else {
            System.out.println("Condiciones adecuadas para navegar.");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
    }
}