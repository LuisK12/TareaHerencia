/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstracta;

/**
 *
 * @author LuisK
 */
public abstract class Vehiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int anhoFabricado;
    
    //Constructor
    
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

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnhoFabricado() {
        return anhoFabricado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnhoFabricado(int anhoFabricado) {
        this.anhoFabricado = anhoFabricado;
    }
    
    public abstract void doSomething();
    public abstract void mostrarDetallesVehiculo();


}
