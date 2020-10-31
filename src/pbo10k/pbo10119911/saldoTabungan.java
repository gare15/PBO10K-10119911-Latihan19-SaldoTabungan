/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class saldoTabungan {

    /**
     * @param args the command line arguments
     */
    static int saldoAkhir;
    static void hitung(int a, int b){
        saldoAkhir = (a + (a*b/100));
    }
    public static void main(String[] args) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
            int saldo_awal;
            int bunga;
            int lama_menabung;
            int banyak_bulan;
            
            Scanner in = new Scanner(System.in);
            
            System.out.print("Saldo Awal : ");
            saldo_awal = in.nextInt();;
            System.out.print("Bunga/Bulan(%) : ");
            bunga = in.nextInt();
            System.out.print("Lama Bulan : ");
            banyak_bulan = in.nextInt();
            System.out.println("");
            System.out.println("---------------------------");
            
            for (lama_menabung=1; lama_menabung<=banyak_bulan; lama_menabung++){
                hitung(saldo_awal,bunga);
               System.out.println("Bulan ke-" + lama_menabung + "" + kursIndonesia.format(saldoAkhir));
               saldo_awal = saldoAkhir;
            }
    }
    
}
