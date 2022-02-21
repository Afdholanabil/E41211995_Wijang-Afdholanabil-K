/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabil
 */
import java.util.Scanner;

class BungaMain {
    public static void main (String[]args){
        
        Scanner input= new Scanner(System.in);
        
        Bunga melati=new Bunga();
        Bunga mawar=new Bunga();
        Bunga anggrek=new Bunga();
        
        
        //AtributMelati
        melati.warna="Putih";
        melati.daerahAsal="Asia Selatan";
        melati.namaIlmiah="Jasminum sambac";
        melati.harga=10000;
        melati.melati1("Melati");
        
        //AtributMawar
         mawar.warna="Merah";
        mawar.daerahAsal="Cina";
        mawar.namaIlmiah="Rosa Spp";
        mawar.harga=15000;
        mawar.mawar1("Mawar");
        
        //AtributAnggrek
        anggrek.warna="Ungu";
        anggrek.daerahAsal="Kalimantan";
        anggrek.namaIlmiah="Orchidaceae";
        anggrek.harga=13000;
        anggrek.anggrek1("Anggrek");
          
        //Tranksaksi
        int total,kembali;
        System.out.print("Pilih Bunga : ");
        int pilih=input.nextInt();
        System.out.print("Jumlah : ");
        
        if(pilih==1){
             melati.jumlah=input.nextInt();
             melati.beliBunga("Melati");
             total=melati.harga*melati.jumlah ;
             System.out.println("Baik,jadi total pembelian bunga melati dengan jumlah : " + melati.jumlah + "= Rp" + total);
             System.out.println("---------------------------------------------");
             System.out.print("Masukan Tunai : ");
             int bayar=input.nextInt();
             if(bayar<total){
                 System.out.println("Maaf Uang anda Kurang !");
             }else{
                kembali=bayar-total;
                System.out.println("kembali : " + kembali);  
             }
             
        }else if(pilih==2){
            mawar.jumlah=input.nextInt();
            mawar.beliBunga("Mawar");
            total=mawar.harga*mawar.jumlah ;
            System.out.println("Baik,jadi total pembelian bunga mawar dengan jumlah : " + mawar.jumlah + "= Rp" + total);
            System.out.println("-----------------------------------------------");
            System.out.print("Masukan Tunai : ");
            int bayar=input.nextInt();
             if(bayar<total){
                 System.out.println("Maaf Uang anda Kurang !");
             }else{
                kembali=bayar-total;
                System.out.println("kembali : " + kembali);  
             }
             
        }else if(pilih==3){
            anggrek.jumlah=input.nextInt();
            anggrek.beliBunga("Anggrek");
            total=anggrek.harga*anggrek.jumlah ;
            System.out.println("Baik,jadi total pembelian bunga anggrek dengan jumlah : " + anggrek.jumlah + "= Rp" + total);
            System.out.println("-----------------------------------------------");
            System.out.print("Masukan Tunai : ");
            int bayar=input.nextInt();
             if(bayar<total){
                 System.out.println("Maaf Uang anda Kurang !");
             }else{
                kembali=bayar-total;
                System.out.println("kembali : " + kembali);  
             }
             
        }else{
            System.out.println("Maaf bunga yang anda pilih tidak ada !");
            System.exit(0);
        }

    }
}
    
            
            
  
      
       
    
    

