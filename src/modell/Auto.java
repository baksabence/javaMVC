
package modell;

import java.util.List;



public class Auto {
    private String rendszam;
    private String szin;
    private String[] extrak;
//    private List<String> extrak;
    
    

    public Auto(String rendszam, String szin) {
        this.rendszam = rendszam;
        this.szin = szin;
       // this.extrak = extrak;
    }
    
    
    public void extraHozzaad(String extra){
        this.extrak.add(extra);
    }
    
    public void szinAtfest(String szin){
        this.setSzin(szin);
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }
    
    

    public String[] getExtrak() {
        return extrak;
    }
}
