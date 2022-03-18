package nyugtaprojektek;
/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/
public class Nyugta2 {

    public static void main(String[] args) {
        //változók kiszervezése
        //int tetel1 = 350;
        //int tetel2 = 90;
        //int tetel3 = 1320;
        int tetelek[] = new int[3];
        tetelek[0] = 350; 
        tetelek[1] = 90; 
        tetelek[2] = 1320;
        String huf = "Ft";
        String csillagok = "*******************";
        String duplaVonal = "===================";
        String szaggatottVonal = "-------------------";
        String rovidVonal = "_______";
        String rovidVonalValaszto = "     ";

        int osszesen = tetelek[0] + tetelek[1] + tetelek[2];

        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;

        int fizetendo = osszesen - kedvezmeny;

        double euro = fizetendo / 350.0;
        
        
        
        System.out.println(csillagok);
        System.out.println("     Nyugta 2");
        System.out.println(csillagok);

        //System.out.println("Tétel 1:     350 Ft");

        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);

        //System.out.println("Tétel 2:      90 Ft");

        System.out.printf("Tétel 2:      %d %s\n", tetel2, huf);

        //System.out.println("Tétel 3:    1320 Ft");

        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);

        System.out.println(duplaVonal);
        
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        
        System.out.println(szaggatottVonal);
        
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        System.out.printf("(%d%%)\n", kedvMertek);
        
        System.out.println(duplaVonal);
        
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        
        huf = "\u20ac";//EZ NEM JÓ!!!!
        System.out.printf("            %f %s\n", euro, huf);
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
    
        System.out.print(rovidVonal);
        
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        
        System.out.println("   Név");
        
        System.out.println(csillagok);
        
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }

}
