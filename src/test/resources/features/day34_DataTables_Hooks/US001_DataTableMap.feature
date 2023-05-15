Feature: US001_BlueRentalCar_Login_Islemi_Map

  Scenario: TC01_BlueRentalCar_Positive_Test
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    Then Verilen_kullanicilar_ile_login_olunur
      | emailAdress                   | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi_kapatir