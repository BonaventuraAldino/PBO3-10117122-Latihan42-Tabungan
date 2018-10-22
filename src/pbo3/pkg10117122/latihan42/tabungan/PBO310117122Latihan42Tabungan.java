/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan42.tabungan;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini dibuat untuk menghitung sisa saldo user 
 *                     setalah saldo diambil oleh user
 * 
 */
public class PBO310117122Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======Program Penarikan Uang=======");
        
        Tabungan out1 = new Tabungan(0);
        out1.ambilUang(0);
        
        System.out.println();
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
