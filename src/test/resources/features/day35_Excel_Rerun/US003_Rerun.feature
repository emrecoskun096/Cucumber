@rerun
Feature: US003_Amazon_Testi

  Scenario:TC01_Amazonda_Urun_aratma
    Given kullanici_"amazon_Url"_sayfasina_gider
    And arama_kutusunda_"iphone"_aratir
    And basligin "nokia" icerdigini dogrular
    #Bilerek fail aldık
  Scenario:TC02_Amazonda_Urun_aratma
    Given kullanici_"amazon_Url"_sayfasina_gider
    And arama_kutusunda_"samsung"_aratir
    And basligin "samsung" icerdigini dogrular

  Scenario:TC03_Amazonda_Urun_aratma
    Given kullanici_"amazon_Url"_sayfasina_gider
    And arama_kutusunda_"nokia"_aratir
    And basligin "iphone" icerdigini dogrular
    #Bilerek fail aldık

  Scenario:TC04_Amazonda_Urun_aratma
    Given kullanici_"amazon_Url"_sayfasina_gider
    And arama_kutusunda_"motorola"_aratir
    And basligin "motorola" icerdigini dogrular

  Scenario:TC05_Amazonda_Urun_aratma
    Given kullanici_"amazon_Url"_sayfasina_gider
    And arama_kutusunda_"motorola"_aratir
    And basligin "motorola" icerdigini dogrular

#Bu file'da isteyerek fail alıp FailedRun class'ından nasıl çalıştırıldığını gördük