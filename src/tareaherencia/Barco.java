/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Barco extends Vehiculo {
    private int longitud;
    private String marcaMotor;
    
    public Barco (String tipo, String marca, String modelo, int anhoFabricado, int longitud, String marcaMotor){
        super(tipo, marca, modelo, anhoFabricado);
        this.longitud = longitud;
        this.marcaMotor = marcaMotor;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }
    
    public void MostrarDetallesBarco(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nLongitud del casco del Yate (en metros): "+this.longitud+"\nMarca del motor a bordo del Yate: "
                +this.marcaMotor);
    }
    
    @Override
    public void doSomething () { System.out.println("\nSoy un Barco");  }
}
