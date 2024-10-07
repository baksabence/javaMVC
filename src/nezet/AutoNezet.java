
package nezet;

import javax.swing.JOptionPane;


public class AutoNezet {
    public void megjelenit(uzenet){
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    public void extratBeker(){
        String e = JOptionPane.showInputDialog("Szeretnél extrát hozzáadni? (igen/nem)");
    }
    
}
