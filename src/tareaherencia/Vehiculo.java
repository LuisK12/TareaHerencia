/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Vehiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int anhoFabricado;
    
    //Constructor
    public Vehiculo(){}
    
    public Vehiculo(String tipo, String marca, String modelo, int anhoFabricado){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo =  modelo;
        this.anhoFabricado = anhoFabricado;
    }
    
    //Metodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnhoFabricado() {
        return anhoFabricado;
    }

    public void setAnhoFabricado(int anhoFabricado) {
        this.anhoFabricado = anhoFabricado;
    }
        
    public void doSomething () { System.out.println("Soy un tipo de vehículo");   }


}
