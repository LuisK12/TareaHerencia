/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class Avion extends Vehiculo {
    private String MarcaTurbinas;
    private int empujeTurbinas;
    
    public Avion (String tipo, String marca, String modelo, int anhoFabricado, String MarcaTurbinas, int empujeTurbinas){
        super(tipo, marca, modelo, anhoFabricado);
        this.MarcaTurbinas = MarcaTurbinas;
        this.empujeTurbinas = empujeTurbinas;
    }

    public String getMarcaTurbinas() {
        return MarcaTurbinas;
    }

    public void setMarcaTurbinas(String MarcaTurbinas) {
        this.MarcaTurbinas = MarcaTurbinas;
    }

    public int getEmpujeTurbinas() {
        return empujeTurbinas;
    }

    public void setEmpujeTurbinas(int empujeTurbinas) {
        this.empujeTurbinas = empujeTurbinas;
    }
    
    public void MostrarDetallesAvion(){
        System.out.println("\nTipo de vehículo: "+super.getTipo()+"\nMarca: "+super.getMarca()+"\nModelo: "
                +super.getModelo()+"\nAño de fabricación: "+super.getAnhoFabricado()
                +"\nMarca de las turbinas: "+this.MarcaTurbinas+"\nEmpuje de las turbinas (en kilo-Newtons): "
                +this.empujeTurbinas);
    }
    
    @Override
    public void doSomething () { System.out.println("\nSoy un Avión");  }
}
