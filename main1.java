/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

abstract class kendaraan {

    public abstract void nyalakanmesin();

    public void matikanmesin() {
        System.out.println("mesin dimatikan.");
    }
}

class mobil extends kendaraan {

    @Override
    public void nyalakanmesin() {
        System.out.println("mesin mobil dinyalakan. brummm...");
    }
}

class motor extends kendaraan {

    @Override
    public void nyalakanmesin() {
        System.out.println("mesin motor dinyalakan. ngenggg...");
    }
}

public class main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pilih jenis kendaraan:");
        System.out.println("1. mobil");
        System.out.println("2. motor");
        System.out.print("pilihan anda: ");
        int pilihan = scanner.nextInt();

        kendaraan kendaraan;

        if (pilihan == 1) {
            kendaraan = new mobil();
        } else if (pilihan == 2) {
            kendaraan = new motor();
        } else {
            System.out.println("pilihan tidak valid!");
            scanner.close();
            return;
        }

        kendaraan.nyalakanmesin();
        kendaraan.matikanmesin();

        scanner.close();
    }
}
