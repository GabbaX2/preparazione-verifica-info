package lab;

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

//        inventario.printElenco();
//
//        inventario.removeStrumento();


        // inventario.printElenco();

        //System.out.println(inventario.searchByInventario());

        //System.out.println(inventario.searchByDesc());

        //System.out.println("costo totale elementi compresi tra x anno e y anno: " + inventario.ValueStrumentiLassoDiTempo());
    }
}