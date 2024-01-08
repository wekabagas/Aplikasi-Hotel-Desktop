/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

/**
 *
 * @author ASUS
 */
public class tarifHotel extends Entitas {
    public int tarif; 
    public double bayar;
    public String kamar;
    
    
    public tarifHotel() {
    }
        //Untuk tarif
        public int get_tarif(){
        if(jenis==1){
            //kamar="Standart";
            tarif = lama*275000;
        }  
        else if (jenis==2){
            //kamar="Deluxe";
            tarif = lama*500000;
        }
        else if (jenis==3){
            //kamar="Luxury";
            tarif = lama*700000;
        }
        else{
        }
        return tarif;
        
        }
        public String get_kamar(){
        if(jenis==1){
            kamar="Standart";
            //tarif = lama*275000;
        }  
        else if (jenis==2){
            kamar="Deluxe";
            //tarif = lama*500000;
        }
        else if (jenis==3){
            kamar="Luxury";
            //tarif = lama*700000;
        }
        else{
        }
        return kamar;
    }
}
