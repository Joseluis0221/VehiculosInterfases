public class Main {
    public static void main (String[] args) {
        vehiculoTerrestre camioneta = new vehiculoTerrestre(40, 120, 4, "civil");
        vehiculoAcuatico motoAcuatica = new vehiculoAcuatico(20, 90, "superficie", 2);
        
        
        System.out.println("CAMIONETA");
        camioneta.acelerar(30);
        camioneta.frenar(10);
        camioneta.mostrarDetalles();
        System.out.println("revoluciones motor:" + camioneta.calcularRevolucionesMotor(20, 5));
        
        
        System.out.println("MOTO ACUATICA");
        motoAcuatica.acelerar(50);
        motoAcuatica.frenar(15);
        motoAcuatica.mostrarDetalles();
        motoAcuatica.recomendarVelocidad(85);
        motoAcuatica.recomendarVelocidad(5);
        motoAcuatica.recomendarVelocidad(30);
    }
}
 