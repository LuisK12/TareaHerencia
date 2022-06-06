
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Nave extends Avion {
    private int NumTripulantes;
    
    public Nave(String tipo, String marca, String modelo, int anhoFabricado, String MarcaTurbinas, int empujeTurbinas, int NumTripulantes){
        super(tipo, marca, modelo, anhoFabricado, MarcaTurbinas, empujeTurbinas);
        this.NumTripulantes = NumTripulantes;
    }

    public int getNumTripulantes() {
        return NumTripulantes;
    }

    public void setNumTripulantes(int NumTripulantes) {
        this.NumTripulantes = NumTripulantes;
    }
    
    public void MostrarDetallesNave(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nMarca de las turbinas: "+super.getMarcaTurbinas()+"\nEmpuje de las turbinas (en proporción): "
                +super.getEmpujeTurbinas()+"\nCapacidad de pasajeros en cabina: "+this.NumTripulantes);
    }
    
    @Override
    public void doSomething () { System.out.println("\nSoy una nave espacial");  }
}
