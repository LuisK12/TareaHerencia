
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Trailer extends Automovil {
    private int capCarga;
    
    public Trailer(String tipo, String marca, String modelo, int anhoFabricado, 
            int perfilLlanta, int kmsMax, int capCarga){
        super(tipo, marca, modelo, anhoFabricado, perfilLlanta, kmsMax);
        this.capCarga = capCarga;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }
    
    public void MostrarDetallesTrailer(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nPerfil de llanta: "+super.getPerfilLlanta()+"\nVelocidad máxima por hora (kms): "
                +super.getKmsMax()+"\nCapacidad Máxima de Carga (en toneladas): "+this.getCapCarga());
    }
    
    @Override
    public void doSomething () { System.out.println("\nSoy un Trailer");   }
}
