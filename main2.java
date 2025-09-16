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

interface alatelektronik {

    void hidupkan();

    void matikan();
}

// Kelas Televisi
class televisi implements alatelektronik {

    @Override
    public void hidupkan() {
        System.out.println("televisi dinyalakan. gambar muncul di layar.");
    }

    @Override
    public void matikan() {
        System.out.println("televisi dimatikan. layar menjadi gelap.");
    }
}

class radio implements alatelektronik {

    @Override
    public void hidupkan() {
        System.out.println("radio dinyalakan. suara musik terdengar.");
    }

    @Override
    public void matikan() {
        System.out.println("radio dimatikan. tidak ada suara.");
    }
}

public class main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pilih alat elektronik:");
        System.out.println("1. televisi");
        System.out.println("2. radio");
        System.out.print("pilihan Anda: ");
        int pilihan = scanner.nextInt();

        alatelektronik alat;

        if (pilihan == 1) {
            alat = new televisi();
        } else if (pilihan == 2) {
            alat = new radio();
        } else {
            System.out.println("pilihan tidak valid!");
            scanner.close();
            return;
        }

        alat.hidupkan();
        alat.matikan();

        scanner.close();
    }
}
