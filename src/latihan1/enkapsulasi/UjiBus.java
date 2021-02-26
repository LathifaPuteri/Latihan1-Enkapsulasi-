/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.enkapsulasi;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat object Bus Mini dari class Bus
        Bus busMini = new Bus();
        //masukkan nilai jumlah penumpang dan penumpang maksimal 
        //ke dalam object bus Mini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //menambahkan jumlah penumpang padabusMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
    
}
