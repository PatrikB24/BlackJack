
package blackjack;

import java.util.Random;


public class BlackJack {


    public static void main(String[] args) {
    
        jatek();
        
        
    }

    private static void jatek() {
        
        int[] jatekosLapjai = new int[10];
        int[] gepLapjai = new int[10];
        
        int jatekosLapokSzama = 2;
        int gepLapokSzama = 2;
        
        jatekosLapjai[0] = kapLapot();
        jatekosLapjai[1] = kapLapot();
        kiirLapok(jatekosLapjai, jatekosLapokSzama, "Játékos");
        
        gepLapjai[0] = kapLapot();
        gepLapjai[1] = kapLapot();
        kiirLapok(gepLapjai, gepLapokSzama, "Gép");
    }

    private static int kapLapot() {
        Random rnd = new Random();
        return rnd.nextInt(10)+2; //2-11 között ad így
    }

    private static void kiirLapok(int[] lapok, int lapokSzama, String GvJ) {
        System.out.print(GvJ + ": ");
        for (int i = 0; i < lapokSzama; i++) {
                    System.out.print(lapok[i] + ", ");
        }
    }
    
    public static boolean kaphatLap(int osszeg) {
        return osszeg <= 21;
    }
    
    
}
