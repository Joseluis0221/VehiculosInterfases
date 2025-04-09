
package vehiculosinterfases;


public class VehiculoTerrestre extends Vehiculo implements motor {
    private int cantidadLlantas;
    private String usoVehiculo;

    public VehiculoTerrestre(double velocidadActual, double velocidadMaxima, int cantidadLlantas, String usoVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.usoVehiculo = usoVehiculo;
       
    }
    public double calcularRevolucionesMotor(int fuerza,int radio) { 
        return fuerza * radio;
        
    }
    
    public void mostrarDetalles() {
        System.out.println("vehiculo terrestre - uso:" + usoVehiculo + ",Llantas:" + cantidadLlantas);
    }
}
