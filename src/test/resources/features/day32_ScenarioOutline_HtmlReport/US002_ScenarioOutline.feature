#https://editor.datatables.net adresine gidiniz
#Sayfadaki tabloda new butonuna basalım
#Çıkan pencerede verilen bilgileri girelim
#Create butonuna basalım
#Search bölümüne girdiğimiz firstname bilgisini girelim
#Başarılı bir şekilde giriş yapıldığını doğrulayalım
#Sayfayı kapatalım
Feature: US002_DataTables_Testi

  Background: https://editor.datatables.net sayfasında veri girisi
    Given kullanici_"dataTableUrl"_sayfasina_gider

  Scenario Outline: TC01_DataTablesda_Veri_Girisi
    Then kullanici_sayfadaki_tabloda_new_butonuna_basar
    When cikan_pencerede_verilen_bilgileri_girelim "<firstname>","<lastname>","<position>","<office>","<extention>","<date>","<salary>"
    But kullanici 2 saniye bekler
    And kullanici_create_butonuna_basar
    And kullanici_search_bolumune_"<firstname>"_bilgisi_girer
    And kullanici_"<firstname>"ile_basarili_bir_sekilde_giris_yapildigini_dogrular
    But kullanici 2 saniye bekler
    And sayfayi_kapatir
    Examples:
      | firstname | lastname | position    | office  | extention | date       | salary  |
      | john      | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam       | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy     | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george    | bush     | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry     | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |
