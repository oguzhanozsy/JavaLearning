/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anonim_inner_classes;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        /*
        KONU ANLATIMI:
        --> Herhangi bir class tanımlamadan obje oluşturabiliriz.Yani bizim bir abstract classımız veya interfacesimiz varsa bir class oluşturmadan
        anonim classlarla obje oluşturabiliriz...     
        
        --> Normalde interfaceler ile obje oluşturamayız sadece obje referansı olarak kullanabiliriz burda da sanki obje oluştururmuş gibi yazıp
        metodları implemente ediyoruz(NOT: Abstract classlarda da aynısı geçerli ama orda ekstradan bir hata daha çıkıcak bunun çözümü de
        abstract class'ı static olarak tanımlamak)...
        */
    
        
        IOgrenci ogrenci1 = new IOgrenci() {
            @Override
            public void ders_calis() {

                System.out.println("Ders Calisiyorum...");
            }

            @Override
            public void derse_gir() {
                
                System.out.println("Derse Giriyorum...");
            }
        };
    
        ogrenci1.ders_calis();
        ogrenci1.derse_gir();
    
        System.out.println("*******************************************************");
        
        AOgrenci ogrenci2 = new AOgrenci("Oguzhan Ozsoy",534) {
            @Override
            void kayit_yaptir() {
                
                System.out.println("Kayit Yapiliyor..." + " Isim: " + getIsim() + " Numara: " + getNumara());
            }
        };
        
        ogrenci2.kayit_yaptir();
        
    
    }
    
    public interface IOgrenci{
        
        void ders_calis();
        void derse_gir();
        
    }
    
    public static abstract class AOgrenci{
        
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        
        
        
        abstract  void kayit_yaptir();

        public void selamla(){
            System.out.println("Selamlar...");
        }
        
    }
    
}
