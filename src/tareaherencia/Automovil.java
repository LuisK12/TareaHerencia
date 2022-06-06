/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Automovil extends Vehiculo {
    private int perfilLlanta;
    private int kmsMax;
    
    public Automovil(String tipo, String marca, String modelo, int anhoFabricado, 
            int perfilLlanta, int kmsMax){
        super(tipo, marca, modelo, anhoFabricado);
        this.perfilLlanta = perfilLlanta;
        this.kmsMax = kmsMax;
    }

    public int getPerfilLlanta() {
        return perfilLlanta;
    }

    public void setPerfilLlanta(int perfilLlanta) {
        this.perfilLlanta = perfilLlanta;
    }

    public int getKmsMax() {
        return kmsMax;
    }

    public void setKmsMax(int kmsMax) {
        this.kmsMax = kmsMax;
    }
    
    public void mostrarDetallesAuto(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nPerfil de llanta: "+this.getPerfilLlanta()+"\nVelocidad máxima por hora (kms): "+this.getKmsMax());
    }
    
    @Override
    public void doSomething () { System.out.println("\nSoy un automovil");   }
}
