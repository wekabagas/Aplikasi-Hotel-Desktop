/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class SewaHotelMain {
     public static void main(String[] args) throws IOException{
         //Pemanggilan clas tarifHotel
        tarifHotel pesan=new tarifHotel();
        
        pesan.setNama(JOptionPane.showInputDialog("Masukkan nama :"));
        String msg_nama = "Selamat datang di Hotel INALFANHA " + pesan.getNama();
        JOptionPane.showMessageDialog(null, msg_nama);
        
        String alamat;
        pesan.setAlamat(JOptionPane.showInputDialog("Masukkan alamat :"));
        
        boolean pilih_kamar=true;
        while(pilih_kamar){
            String kamar = "Pilih Jenis Kamar Anda :\n"+
                    "\n1.Standart Room Rp 275.000/malam\n"+
                    "\n2.Deluxe Room Rp 500.000/malam\n"+
                    "\n3.Luxury Room Rp 700.000/malam\n";
            try {
                 pesan.setJenis(Integer.parseInt(JOptionPane.showInputDialog(kamar)));
            } catch (Exception e) {
            }
              if(pesan.getJenis()>3 || pesan.getJenis()<1){
                JOptionPane.showMessageDialog(null, "Pilihan Input Tidak Tersedia");
            }
            else{
                pilih_kamar = false;
            }
        }
        String lama = "Lama Menginap (Hari):";
        try {
            pesan.setLama(Integer.parseInt(JOptionPane.showInputDialog(lama)));
        } catch (Exception e) {
        }
               
        String output = "Hasil Pemesanan\n\n"+
                "Nama : "+pesan.getNama()+
                "\nAlamat : "+pesan.getAlamat()+
                "\nJenis Kamar : "+pesan.get_kamar()+
                "\nLama Menginap : "+pesan.getLama()+" Hari"+
                "\nTarif : "+pesan.get_tarif();
     
     try {
            JOptionPane.showMessageDialog(null, output);
        } catch (Exception e) {
        }
     }
}
