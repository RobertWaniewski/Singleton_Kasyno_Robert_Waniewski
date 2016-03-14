
package Singleton;

/**
 * @author Robert Waniewski
 */
public class Gracze {
    
    private String imie;
    private String nazwisko;
    private int saldo;
    
    
    public Gracze(String Imie, String Nazwisko, int Saldo){
    imie = Imie;
    nazwisko = Nazwisko;
    saldo = Saldo;
    }
    
    
    public void setWygrana(int wartosc){
    saldo = saldo + wartosc;
    Saldo.inst().addSaldo(-wartosc);
    }
    
    
    public void setPrzegrana(int wartosc){
    saldo = saldo - wartosc;
    Saldo.inst().addSaldo(+wartosc);
    }
    
    
    public int getSaldo(){
    return saldo;}
}
