
package vezerlo;

import modell.AutoModell;
import nezet.AutoNezet;

public class AutoVezerlo {
    private AutoModell modell;
    private AutoNezet nezet;

    public AutoVezerlo(AutoModell modell, AutoNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        indito();
    }

    private void indito() {
        nezet.megjelenit(modell.kezdes());
        modell.kezdes();
    }
    
    
}
