
package Singleton;

/**
 * @author Robert Waniewski
 */
public class Kasyno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Saldo.inst().addSaldo(100000); //ustawiam saldo poczatkowe kasyna
        System.out.println("Saldo poczatkowe kasyna  wynosi : " + Saldo.inst().getSaldo());
                    
        Gracze GraczWBlackjacka = new Gracze("Jan", "Kowalski", 1000); //implementacja gracza 1
        System.out.println("Saldo początkowe Gracza w Blackjack'a " + GraczWBlackjacka.getSaldo());
         
        Gracze GraczWJednorękiegoBandytę = new Gracze("Andrzej", "Sowa", 10000); //implementacja gracza 2
        System.out.println("Saldo początkowe Gracza w Jednorękiego Bandytę " + GraczWJednorękiegoBandytę.getSaldo());
    
        
        GraczWBlackjacka.setWygrana(3000); //wygrana gracza 1
        GraczWJednorękiegoBandytę.setWygrana(4000); //wygrana gracza 2
        GraczWJednorękiegoBandytę.setPrzegrana(5000); // przegrana gracza 2
        
        
        System.out.println("Saldo końcowe kasyna wynosi: " + Saldo.inst().getSaldo());
        System.out.println("Saldo końcowe Gracza w Blackjacka wynosi : " + GraczWBlackjacka.getSaldo());
        System.out.println("Saldo końcowe Gracza w Jednorękiego Bandytę wynosi : " + GraczWJednorękiegoBandytę.getSaldo());
    }
    
}
