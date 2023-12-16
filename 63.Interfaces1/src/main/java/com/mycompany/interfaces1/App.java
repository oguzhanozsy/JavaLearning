/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces1;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        /*
            KONU ANLATIMI:
            ->Java'da çoklu kalıtım bulunmuyor. Çoklu kalıtımın yaptığı işleri Java'da interfaceler yapıyor...
            ->Java'da bir interface'in metodlarının kod blokları yazılmıyor o yüzden interface'i implement(uyan) eden
                bütün classların bütün metodları tek tek kendi classları içinde yazmaları gerekiyor(Gerçek Hayattaki Sözleşme Gibi Her Maddesini Tek Tek İmzalamak Gerekiyo)...
            ->Interfaceler normal classlar gibi olmadıkları için bunlardan obje oluşturamıyoruz sadece bu interfaceleri implement(uyan) 
                eden classlara referans olabiliyoruz.Obje oluşturulamadığı içinde public,private gibi erişim belirleyicilerini kullanmaya gerek yoktur...
            ->Interfacelerin içinde herhangi bir özellik bulunamaz sadece ve sadece final ve static değişkenler tanımlanabiliyor...
            ->Interfaceleri bir çatı olarak düşünebiliriz yani bunları implement(uyan) eden classlara bir çatıdır...
            ->Bir class birden fazla interface'i implement edebiliyor bu sayede de çoklu kalıtım görevi görüyor...
            
            ->Tanımlanırken public interfaceIsmi{
                            }
                            şeklinde tanımlanır...
            ->Bir class'da kullanırken de public class classIsmi implements interfaceIsmi{
                                
                                    bir classda kullanırsak interfacelerin içindeki tüm fonksiyonları burda tekrardan tanımlamamız gerekir(yani bi nevi override etmektir) yoksa hata alırız...
        
                            }
        */

        
        /*IMuhendis muhendis1 = new IMuhendis(); HATALIDIR INTERFACELERDEN OBJE OLUSTURAMAYIZ...*/
        /*IMuhendis muhendis1 = new PcMuhendisi(false, false); AMA BU HATALI DEĞİLDİR BU ŞEKİLDE KULLANABİLİRİZ...*/    
        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
        
        String[] tecrube = {"Vestel","Havelsan","Turksat"};
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        muhendis1.is_tecrubesi(tecrube);
        
        
        
        
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        /*IMuhendis muhendis2 = new MakineMuhendisi(true, false); BU ŞEKİLDE KULLANMAK İÇİN DİKKAT EDİLMESİ GEREKEN BİKAÇ HUSUS VARDIR.
        BUNU KULLANDIĞIMIZ ZAMAN INTERFACE'I IMPLEMENT EDEN CLASS'IN İÇİNDE INTERFACELERDEKİ METODLARDAN BAŞKA METOD BULUNMAMALI,
        EĞER BULUNURSA O METODU BU REFERANSLA KULLANIRKEN HATA ALIRIZ AMA BU HATA GİDERİLEBİLİR.
        HATAYI KULLANACAĞIMIZ METODUN REFERANSINI O METODU YAZDIĞIMIZ CLASS TİPİNDE OLDUĞUNU EKSTRADAN BELİRTEREK GİDEREBİLİRİZ*/
        /*
            ÖRNEĞİN;
            ((MakineMuhendisi)muhendis2).referans_getir(referans);
        */
        
        String[] tecrube2 = {};
        String[] referans = {"Mustafa Murat Coskun","Serhat Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube2);
        /*muhendis2.referans_getir(referans);*/
        
        muhendis2.calis();
        
    }
}
