Feature: US002_TechProEducation_Testi
  @gr1
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_techpro_sayfasina_gider
    Then cikan_reklam_kapatilir
    And arama_kutusunda_QA_aratir
    And sayfa_basliginin_qa_icerdigini_test_eder
    And sayfayi_kapatir