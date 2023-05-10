Feature:US001_Google_Search

  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"googleUrl"_sayfasina_gider

  Scenario Outline: Google_Aramalari
    * kullanici googleda "<aranacakKelime>" aratacaktir
    * basligin "<aranacakKelime>" icerdigini dogrulayacaktir
    * sayfayi_kapatir
    Examples:
      | aranacakKelime |
      | arac1          |
      | arac2          |
      | arac3          |
      | arac4          |
      | arac5          |