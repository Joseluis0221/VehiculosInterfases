package vehiculosinterfases;


public class VehiculoAcuatico extends Vehiculo implements Vela {
    private final String tipoAcuatico;
    private final int capacidadPasajeros;

    public VehiculoAcuatico(double velocidadActual, double velocidadMaxime, String tipoAcuatico, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipoAcuatico = tipoAcuatico;
        this.capacidadPasajeros = capacidadPasajeros;
               
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) { 
        if(velocidadViento > 80){
             System.out.println("el viento es muy fuerte no navegar");             
        }else if (velocidadViento <10) {
            System.out.println("velocidad del viento adecuada para navegar");
            
        }
    }
    
    public void mostrarDetalles() {
        System.out.println("vehiculo acuatico - tipo: " + tipoAcuatico + ",capacidad:" + capacidadPasajeros );
        imprimir();
    }
      
}
