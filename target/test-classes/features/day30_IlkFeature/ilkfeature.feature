Feature: US001_Amazon_Sayfasi_Testi
  @ilk
  Scenario: TC01_Amazon_Sayfasinda_Urun_Aratilir
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_iphone_aratir
    And sayfayi_kapatir
