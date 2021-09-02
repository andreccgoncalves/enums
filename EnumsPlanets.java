/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsplanets;

/**
 *
 * @author user
 */
enum Planet{
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO;
}
public class EnumsPlanets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Planet myPlanet = Planet.MARS;
        
        canILiveHere(myPlanet);
        
    }
    
    static void canILiveHere(Planet myPlanet){
        
        switch(myPlanet) {
            case EARTH:
                System.out.println("You can live here!!");
                break;
            default:
                System.out.println("You can't live here... yet");
                break;
        }
    }
}
