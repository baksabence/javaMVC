
package modell;


public class AutoModell {
    private Auto[] autok;
    
    public AutoModell(){
        autok = new Auto[2];
        
        autok[0] = new Auto("aa-aa123", "piros");
        autok[1] = new Auto("aa-aa124", "kék");
    
}
    
    
    public String kezdes(){
        String s = "";
        int i = 1;
        for (Auto auto : autok) {
            String a = auto.getRendszam();
            String f = auto.getSzin();
            s += i++ + "Rendszám: " + a + "Szín:" + f + "\n";
        }
        
        return s;
        
    }
    
    
}
