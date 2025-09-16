/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

/**
 *
 * @author Admin
 */
abstract class rekening {

    protected String norekening;
    protected double saldo;

    public rekening(String norekening, double saldoawal) {
        this.norekening = norekening;
        this.saldo = saldoawal;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("setor: Rp" + jumlah + " | saldo sekarang: Rp" + saldo);
    }

    public abstract void tarik(double jumlah);

    public void tampilkansaldo() {
        System.out.println("no rekening: " + norekening + " | saldo: Rp" + saldo);
    }
}

class rekeningtabungan extends rekening {

    private static final double SALDO_MINIMUM = 50000;

    public rekeningtabungan(String norekening, double saldoawal) {
        super(norekening, saldoawal);
    }

    @Override
    public void tarik(double jumlah) {
        if (saldo - jumlah >= SALDO_MINIMUM) {
            saldo -= jumlah;
            System.out.println("tarik tabungan: Rp" + jumlah + " | saldo tersisa: Rp" + saldo);
        } else {
            System.out.println("gagal melakukan transaksi! saldo tidak boleh kurang dari Rp" + SALDO_MINIMUM);
        }
    }
}

class rekeninggiro extends rekening {

    private static final double BATAS_OVERDRAFT = -1000000;

    public rekeninggiro(String norekening, double saldoawal) {
        super(norekening, saldoawal);
    }

    @Override
    public void tarik(double jumlah) {
        if (saldo - jumlah >= BATAS_OVERDRAFT) {
            saldo -= jumlah;
            System.out.println("tarik giro: Rp" + jumlah + " | saldo tersisa: Rp" + saldo);
        } else {
            System.out.println("gagal melakukan transaksi! melebihi batas overdraft Rp" + BATAS_OVERDRAFT);
        }
    }
}

class rekeningdeposito extends rekening {

    private boolean jatuhtempo;

    public rekeningdeposito(String norekening, double saldoawal, boolean jatuhtempo) {
        super(norekening, saldoawal);
        this.jatuhtempo = jatuhtempo;
    }

    @Override
    public void tarik(double jumlah) {
        if (jatuhtempo) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("tarik deposito: Rp" + jumlah + " | saldo tersisa: Rp" + saldo);
            } else {
                System.out.println("gagal melakukan transaksi! Saldo tidak mencukupi.");
            }
        } else {
            System.out.println("tidak bisa tarik! deposito belum jatuh tempo.");
        }
    }
}

public class main3 {

    public static void main(String[] args) {
        rekening tabungan = new rekeningtabungan("TAB001", 200000);
        rekening giro = new rekeninggiro("GIR001", 100000);
        rekening deposito = new rekeningdeposito("DEP001", 5000000, false);

        tabungan.tampilkansaldo();
        tabungan.setor(50000);
        tabungan.tarik(100000);

        giro.tampilkansaldo();
        giro.tarik(150000);  
        giro.tarik(1000000); 
        
        deposito.tampilkansaldo();
        deposito.tarik(1000000); 
    }
}
