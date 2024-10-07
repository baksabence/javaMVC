
package main;

import modell.AutoModell;
import nezet.AutoNezet;
import vezerlo.AutoVezerlo;


public class AutoProgram {


    public static void main(String[] args) {
        AutoModell modell = new AutoModell();
        
        AutoNezet nezet;
        
        nezet = new AutoNezet();
        
        new AutoVezerlo(modell, nezet);
    }
    
}
