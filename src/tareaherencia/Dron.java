/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Dron extends Vehiculo {
    private int tiempoVuelo;
    
    public Dron(String tipo, String marca, String modelo, int anhoFabricado, int tiempoVuelo){
        super(tipo, marca, modelo, anhoFabricado);
        this.tiempoVuelo = tiempoVuelo;
    }

    public int getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(int tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }
    
    public void MostrarDetallesDron(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nTiempo máximo de autonomía de vuelo (en minutos): "+this.tiempoVuelo);
    }
    @Override
    public void doSomething () { System.out.println("\nSoy un Dron");  }
}
