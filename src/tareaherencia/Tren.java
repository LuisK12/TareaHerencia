/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Tren extends Vehiculo {
    private String fuenteEnergia;
    
    public Tren(String tipo, String marca, String modelo, int anhoFabricado, String fuenteEnergia){        
        super(tipo, marca, modelo, anhoFabricado);
        this.fuenteEnergia =  fuenteEnergia;
    }

    public String getFuenteEnergia() {
        return fuenteEnergia;
    }

    public void setFuenteEnergia(String fuenteEnergia) {
        this.fuenteEnergia = fuenteEnergia;
    }
    
    public void MostrarDetallesTren(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nFuente de energía del tren: "+this.fuenteEnergia);
    }
    @Override
    public void doSomething () { System.out.println("\nSoy un Tren");  }
}
