package vehiculosinterface;

public class VehiculoTerrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String uso;

    public VehiculoTerrestre(int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
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
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de Llantas: " + cantidadLlantas);
        System.out.println("Uso del Vehículo: " + uso);
    }
}