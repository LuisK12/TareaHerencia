
package tareaherencia;

/**
 *
 * @author LuisK
 */
public class TareaHerencia {

    public static void main(String[] args) {
        Vehiculo veh = new Vehiculo();
        veh.doSomething();
        
        Automovil auto = new Automovil("Automovil", "Nissan", "Sentra", 1996, 13, 130);
        auto.mostrarDetallesAuto();
        auto.doSomething();
        
        Trailer trai = new Trailer("Trailer", "Freightliner","Cascadia", 2012, 60, 120, 26);
        trai.MostrarDetallesTrailer();
        trai.doSomething();
        
        Avion avi = new Avion("Avión", "Airbus", "A380", 2018, "Rolls-Royce", 423);
        avi.MostrarDetallesAvion();
        avi.doSomething();
        
        Barco barc = new Barco("Barco", "Prince", "Royal", 2019, 40, "Fischer Panda");
        barc.MostrarDetallesBarco();
        barc.doSomething();
        
        Tren tre = new Tren("Tren", "Feve", "S2000", 2022, "Eléctrico");
        tre.MostrarDetallesTren();
        tre.doSomething();
        
        Nave nav = new Nave("Nave espacial", "SpaceX", "Dragon", 2019, "Raptor", 107, 2);
        nav.MostrarDetallesNave();
        nav.doSomething();
        
        Dron dro = new Dron("Dron recreativo", "Phantom", "4", 2022, 28);
        dro.MostrarDetallesDron();
        dro.doSomething();
    }
    
}
