/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class program_pembayaran_tagihan_listrik {
    public static void main(String[] args){
        double biaya;
        double hargaperkwh;
        double tariflangganan;
        double pajak;
        double totalbiaya;
        
        System.out.println("--Program Pembayaran Tagihan Listrik--");
        
        //Persyaratan pembayaran listrik
        
        //golongan a
        double tariflanggananA = 50000;
        double hargaperkwhA = 3000;
        
        //golongan b
        double tariflanggananB = 35000;
        double hargaperkwhB = 2500;
        
        //golongan c
        double tariflanggananC = 20000;
        double hargaperkwhC = 1000;
        
        //input pemakaian
        Scanner scanner = new Scanner (System.in);
        System.out.print("besar pemakaian kwh ?");
        int a = scanner.nextInt();
        
    if (a <= 450){
        System.out.println("golongan c");
        biaya = tariflanggananC + (hargaperkwhC * a);
        System.out.println("biaya : " + biaya);
        pajak = (0.1 * biaya);
        totalbiaya = (biaya + pajak);
        System.out.println("Total Biaya : " + totalbiaya);
        
              
    }else if (a <=900){
        System.out.println("golongan b");
        biaya = tariflanggananB + (hargaperkwhB * a);
        System.out.println("biaya : " + biaya);
        pajak = (0.15 / biaya);
        totalbiaya = (biaya + pajak);
        System.out.println("Total Biaya : " + totalbiaya);
        
        
    }else if (a <=1200){
        System.out.println("golongan a");
        biaya = tariflanggananA + (hargaperkwhA * a);
        System.out.println("biaya : " + biaya);
        pajak = (0.2 / biaya);
        totalbiaya = (biaya + pajak);
        System.out.println("Total biaya : " + totalbiaya);
        
        
        
   

        
        
        
        
        
        
        
        
        
                
                
        
        
        
        
        
        
        
        
        
        
    
    
    
        
   
        
        
        
  
    }
   }
}
        
    


