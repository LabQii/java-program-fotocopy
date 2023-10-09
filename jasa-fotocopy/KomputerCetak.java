package modul6;
public class KomputerCetak {
    public static void main(String[]args){
        Komputer[] com = new Komputer[3];
        
        com[0] = new PC();
        com[1] = new Laptop();
        com[2] = new Netbook();
        
        for (int i = 0; i< com.length; i++){
            com [i].hidupkan_os();
            com [i].matikan_os();
            com [i].klik_kanan();
            com [i].klik_kiri();
            com [i].tekan_enter();
            com [i].cetak_data();
        }
    }
}
