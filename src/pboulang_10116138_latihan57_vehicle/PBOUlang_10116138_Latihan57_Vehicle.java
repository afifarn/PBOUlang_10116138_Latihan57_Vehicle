/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan57_vehicle;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Jenis Sepeda dan Skateboard
 */
public class PBOUlang_10116138_Latihan57_Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle("Trek Bike", "7.4 fx");
        sepeda.setMyBrand("Trek Bike");
        sepeda.setMyMOdel("7.4FX");
        sepeda.setMyGearCount(23);
        System.out.println("Brand : "+sepeda.getMyBrand());
        System.out.println("Model : "+sepeda.getMyMOdel());
        System.out.println("Jumlah Gear : "+sepeda.getMyGearCount());
        
        System.out.println("");
  
        Skateboard sb = new Skateboard("Ally Skate", "Rocket");
        sb.setMyBrand("Ally Skate");
        sb.setMyMOdel("Rocket");
        sb.setMyBoardLenght(54.5);
        System.out.println("Brand : "+sb.getMyBrand());
        System.out.println("Model : "+sb.getMyMOdel());
        System.out.println("Panjangnya Board : "+sb.getMyBoardLenght());

    }
    
}
