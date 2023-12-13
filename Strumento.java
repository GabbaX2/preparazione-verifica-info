package labz;

import java.util.Scanner;

public class Strumento {
    private String name;
    private int n_inventario;
    private String desc;
    private double price;
    private int aq_yr;
    private int garancy;

    public Strumento(Scanner scanner) {
        scanner.nextLine();

        System.out.println("nome >> ");
        this.name = scanner.nextLine();

        scanner.nextLine();

        System.out.println("numero di inventario: ");
        this.n_inventario = scanner.nextInt();

        System.out.println("descrizione breve >> ");
        this.desc = scanner.nextLine();

        scanner.nextLine();

        System.out.println("prezzo >> ");
        this.price = scanner.nextDouble();

        System.out.println("anno di acquisizione >> ");
        this.aq_yr = scanner.nextInt();

        System.out.println("anni di garanzia >> ");
        this.garancy = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN_inventario() {
        return n_inventario;
    }

    public void setN_inventario(int n_inventario) {
        this.n_inventario = n_inventario;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAq_yr() {
        return aq_yr;
    }

    public void setAq_yr(int aq_yr) {
        this.aq_yr = aq_yr;
    }

    public int getGarancy() {
        return garancy;
    }

    public void setGarancy(int garancy) {
        this.garancy = garancy;
    }

    public void printDetails() {
        System.out.println("nome: " + name + "\ndescrizione: " + "\nnumero di inventario: "+ n_inventario + desc + "\ncosto: " + price + "\nanno di acquisto: " + aq_yr + "\ngaranzia: " + garancy);
    }
}
