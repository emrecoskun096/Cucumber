Feature: US001_Amazonda_Urun_Aratma

  Scenario: TC01_Amazonda_Urun_Aratma
    Given kullanici_amazon_sayfasina_gider
    And kullanici_verilen_urunleri_aratir
      | Urunler  |
      | samsung  |
      | nokia    |
      | iphone   |
      | motorola |
    And sayfayi_kapatir

#DataTable; scenario'lardaki satır ve sütun için bir veri tablosu temsil eder
#Bunun için kullanılmak istenen her stepten sonra yukardaki örnekteki gibi bir tablo yapısı oluştururuz
#Ve bu stepin methodunu stepDefinition'da oluşturduğumuz zaman burdaki verileri alabilmemiz için
#oluşturulan methoda DataTable parametresi eklenir. Bu parametre ismi ile bir list oluşturulabilir
#yada direk asList() methodu ile row'lara ulaşabiliriz
#Bu parametre import io.cucumber.datatable.DataTable; dan olmalı
#AltGr+<> = ||