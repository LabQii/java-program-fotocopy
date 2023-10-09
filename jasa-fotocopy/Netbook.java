package modul6;
public class Netbook extends Komputer implements Mouse, Keyboard, Printer{
    void hidupkan_os(){
        System.out.println("Hidupkan Netbook");
    }
    void matikan_os(){
        System.out.println("Matikan OS");
    }
    public void klik_kanan(){
        System.out.println("Klik Kanan");
    }
    public void klik_kiri(){
        System.out.println("Klik Kiri");
    }
    public void tekan_enter(){
        System.out.println("Tekan Enter");
    }
    public void cetak_data(){
        System.out.println("Cetak Data");
    }
}