/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.pkg1d;
import java.util.Scanner;


/**
 *
 * @author Dell
 */
public class Array1D {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int i,jumlah=0;
        
        long nim;
        int[] nilai = new int[5];
        String nama;
        String mk[] = {"Pemograman Berorientasi Object","Struktur data","algoritma","Sistem Operasi","metode numerik"};
        Scanner input = new Scanner (System.in);
        
        System.out.println("\t    Pengimputan nilai mahasisiwa");
        System.out.println("\tUniversitas Buana Perjuangan Karawang");
        System.out.println("    ============================================");
        System.out.print("Nama\t:");
        nama=input.next();
        System.out.print("NIM\t:");
        nim=input.nextLong();
        
        for (i=0;i<5;i++)
        {
            System.out.print("input nilai "+mk[i]+":");
            nilai[i]=input.nextInt();
            jumlah=jumlah+nilai[i];
            
        }
        float rata=(float) jumlah/i;
        System.out.println("=================================================");
        System.out.println("Nama\t\t:"+nama);
        System.out.println("NIM\t\t:"+nim);
        System.out.println("jumlah nilai\t\t:"+jumlah);
        System.out.println("nilai rata-rata\t\t:"+rata);
        
        
        
    }
    
}
