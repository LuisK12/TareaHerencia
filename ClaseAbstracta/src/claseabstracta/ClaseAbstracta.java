/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseabstracta;

/**
 *
 * @author LuisK
 */
public class ClaseAbstracta {

    public static void main(String[] args) {
        Automovil auto = new Automovil("Automovil", "Nissan", "Sentra", 1996, 13, 130);
        auto.mostrarDetallesVehiculo();
        auto.doSomething();
        
        Avion avi = new Avion("Avión", "Airbus", "A380", 2018, "Rolls-Royce", 423);
        avi.mostrarDetallesVehiculo();
        avi.doSomething();
        
        Barco barc = new Barco("Barco", "Prince", "Royal", 2019, 40, "Fischer Panda");
        barc.mostrarDetallesVehiculo();
        barc.doSomething();
        
        Dron dro = new Dron("Dron recreativo", "Phantom", "4", 2022, 28);
        dro.mostrarDetallesVehiculo();
        dro.doSomething();
        
        Tren tre = new Tren("Tren", "Feve", "S2000", 2022, "Eléctrico");
        tre.mostrarDetallesVehiculo();
        tre.doSomething();
    }
    
}
