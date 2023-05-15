Feature: US002_BlueRentalCar_Login_Islemi

  Scenario: TC01_BlueRentalCar_Positive_Test
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    Then Verilen_kullanici_ile_login_olunur
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi_kapatir