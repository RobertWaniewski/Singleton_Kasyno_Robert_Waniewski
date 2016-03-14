
package Singleton;

/**
 * @author Robert Waniewski
 */

public class Saldo {
    private static Saldo inst;
    private int saldo = 0;
    
    public Saldo() {
    
    }
    
    public static Saldo inst() {
        if(inst == null) {
            inst = new Saldo();
        }
        return inst;
        }
    
    public String przedstawSie() {
        return "Jestem sprawnym Singletonem";
    }
    public void addSaldo(int Saldo){
    saldo = saldo + Saldo;
    }
    
    public int getSaldo(){
    return saldo;
    
    }
    
    
}