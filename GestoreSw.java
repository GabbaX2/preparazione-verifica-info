package labz;

import java.util.Scanner;

public class GestoreSw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int len = 0;

        do {
            System.out.println("inserisci la quantità di strumenti >> ");
            len = s.nextInt();
        } while (len <= 0);

        Elenco inventario = new Elenco(len);

        for (var i = 0; i < len; i++) {
            inventario.addStrumento(new Strumento(s));
        }

        int scelta = 0;

        do {
            System.out.println("benvenuto nell'inventario del laboratorio di caccatologia!!!");
            System.out.println("cosa ti serve??" + "\n\t1. visualizza l'elenco degli strumenti" + "\n\t2. aggiungi un nuovo strumento" + "\n\t3. rimuovi uno strumento" + "\n\t4. cerca uno strumento in base al numero di inventario" + "\n\t5. cerca uno strumento in base alla descrizione" + "\n\t6. visualizza il costo totale degli strumenti compresi tra due date di acquisto" + "\n\t7. visualizza gli strumenti ancora in garanzia" + "\n\t0. EXIT" + "\n\t >> ");
            scelta = s.nextInt();

            switch(scelta) {
                case 1:
                    inventario.printElenco();
                    break;
                case 2:
                    inventario.addStrumento(new Strumento(s));
                    break;
                case 3:
                    inventario.removeStrumento();
                    break;
                case 4:
                    System.out.println(inventario.searchByInventario());
                    break;
                case 5:
                    System.out.println(inventario.searchByDesc());
                    break;
                case 6:
                    System.out.println(inventario.ValueStrumentiLassoDiTempo());
                    break;
                case 7:
                    inventario.ancoraInGaranzia();
                    break;
            }
        } while (scelta != 0);
//        inventario.printElenco();
//
//        inventario.removeStrumento();


        // inventario.printElenco();

        //System.out.println(inventario.searchByInventario());

        //System.out.println(inventario.searchByDesc());

        //System.out.println("costo totale elementi compresi tra x anno e y anno: " + inventario.ValueStrumentiLassoDiTempo());

        //inventario.ancoraInGaranzia();
    }
}