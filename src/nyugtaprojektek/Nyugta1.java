package nyugtaprojektek;

public class Nyugta1 {

    public static void main(String[] args) {
        
        String csillagok = "******************";
        String duplaVonalak = "==================";
        String egyesVonal = "------------------";
        String alsoVonal = "_______";

        System.out.println(csillagok);
        System.out.println("     Nyugta 1");
        System.out.println(csillagok);
        System.out.println("Tétel 1:    350 Ft");
        System.out.println("Tétel 2:     90 Ft");
        System.out.println("Tétel 3:    650 Ft");
        System.out.println(duplaVonalak);
        System.out.println("Összesen:  1090 Ft");
        System.out.println(egyesVonal);
        System.out.println("Kedvezmény: 109 Ft");
        System.out.println("(10%)");
        System.out.println(duplaVonalak);
        System.out.println("Fizetendő:  981 Ft");
        System.out.printf(egyesVonal,"\n");
        System.out.printf(alsoVonal,"\n");
        System.out.println(alsoVonal);
        System.out.printf(" Dátum","\n");
        System.out.println("   Név");
        System.out.println(csillagok);
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }
    
}
