/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsdoenums;

/**
 *
 * @author user
 */
        
public class LetsDoEnums {
    
    enum Flavor{
        CHOCOLATE, VANILLA, STRAWBERRY;
        
        public static void getVanilla(){
            System.out.println(Flavor.VANILLA);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       Flavor flav = Flavor.VANILLA;     
       flav.getVanilla();
       
        }
        
        
                
        }
   

