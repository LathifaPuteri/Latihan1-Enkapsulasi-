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
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
