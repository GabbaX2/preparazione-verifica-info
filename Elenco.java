package lab;

import java.util.Scanner;

public class Elenco {
    private int len;
    private Strumento[] strumenti;

    public Elenco(int len) {
        this.len = len;
        this.strumenti = new Strumento[len];
    }

    public void addStrumento(Strumento s) {
        for (var i = 0; i < strumenti.length; i++) {
            if (strumenti[i] == null) {
                strumenti[i] = s;
                break;
            }
        }
    }

    public void printElenco() {
        for (Strumento s : strumenti) {
            if (s != null) {
                s.printDetails();
                System.out.println("-----------------");
            }
        }
    }

    public void removeStrumento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci lo strumento che vuoi eliminare: ");
        String nome = scanner.nextLine();

        for (var i = 0; i < strumenti.length; i++) {
            if (strumenti[i] != null && strumenti[i].getName().equals(nome)) {
                strumenti[i] = null;
            }
        }
    }

    public String searchByInventario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il numero di inventario dello strumento che vuoi trovare >> ");
        int invToFind = scanner.nextInt();

        for (var i = 0; i < strumenti.length; i++) {
            if (strumenti[i] != null && strumenti[i].getN_inventario() == invToFind) {
                return "nome: " + strumenti[i].getName() + "\nCosto: " + strumenti[i].getPrice();
            }
        }
        return null;
    }

    public String searchByDesc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la descrizione dello strumento che vuoi trovare >> ");
        String DescToFInd = scanner.nextLine();

        for (var i = 0; i < strumenti.length; i++) {
            if (strumenti[i] != null && strumenti[i].getDesc().equals(DescToFInd)) {
                return "nome: " + strumenti[i].getName() + "\nCosto: " + strumenti[i].getPrice();
            }
        }
        return null;
    }

    public int ValueStrumentiLassoDiTempo() {
        Scanner scanner = new Scanner(System.in);
        int min, max;
        int costoTot = 0;

        do {
            System.out.println("inserisci l'anno iniziale: ");
            min = scanner.nextInt();

            System.out.println("inserisci l'anno finale: ");
            max = scanner.nextInt();
        } while (min <= 1930 && max >= 2023);

        for (var i = 0; i < strumenti.length; i++) {
            if (strumenti[i] != null && strumenti[i].getAq_yr() >= min && strumenti[i].getAq_yr() <= max) {
                costoTot += strumenti[i].getPrice();
            }
        }
        return costoTot;
    }

    public void ancoraInGaranzia() {
        final int anno = 2023;
    }
}
