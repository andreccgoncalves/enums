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
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);
    
    int number;
    
    Planet(int number) {
        this.number = number;
    }
}
public class EnumsPlanets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        //ENUM = enumerater (ordered listing of items in a collection)
        //grouping of constants that behave similarly to an object
        
        Planet myPlanet = Planet.MARS;
        
        canILiveHere(myPlanet);
        
    }
    
    static void canILiveHere(Planet myPlanet){
        
        switch(myPlanet) {
            case EARTH:
                System.out.println("You can live here!!");
                System.out.println("This is planet number " + myPlanet.number);
                break;
            default:
                System.out.println("You can't live here... yet");
                System.out.println("This is planet number " + myPlanet.number);
                break;
        }
    }
}
