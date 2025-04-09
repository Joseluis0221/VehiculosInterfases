
import vehiculosinterfases.VehiculoTerrestre;

public class Main {
    public static void main(String[] args){
        VehiculoTerrestre tractor = new VehiculoTerrestre(60, 4, "agricola");
        VehiculoAcuatico velero = new VehiculoAcuatico(40, "superficie", 6);
        
        System.out.println("===tractor===");
        tractor.acelerar(30);
        tractor.frenar(10);
        tractor.imprimir();
        System.out.println("Revoluciones del motor:" + tractor.calcularRevolucionesMotor(100, 2));
        
        System.out.println("\n=== Barco Velero ===");
        velero.acelerar(20);
        velero.recomendarVelocidad(85);
        velero.imprimir();
        
    }
    
}
