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
