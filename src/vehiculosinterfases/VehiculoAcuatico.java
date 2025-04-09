package vehiculosinterfases;


public class VehiculoAcuatico extends Vehiculo implements Vela {
    private int capacidadPasajeros;

    public VehiculoAcuatico(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void acelerar(int incremento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void frenar(int decremento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
    
}
