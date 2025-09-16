/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

/**
 *
 * @author Admin
 */
class hewan {
    public void suara() {
        System.out.println("hewan mengeluarkan suara...");
    }
}

class kucing extends hewan {
    @Override
    public void suara() {
        System.out.println("meow");
    }
}

class anjing extends hewan {
    @Override
    public void suara() {
        System.out.println("guk guk");
    }
}

class burung extends hewan {
    @Override
    public void suara() {
        System.out.println("cuit cuit");
    }
}

public class main {
    public static void main(String[] args) {
        hewan[] hewan = new hewan[3];
        hewan[0] = new kucing();
        hewan[1] = new anjing();
        hewan[2] = new burung();

        for (hewan h : hewan) {
            h.suara();
        }
    }
}
