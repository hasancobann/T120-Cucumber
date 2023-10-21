Feature: US1005 Kullanici amazonda arama yapip, ilk urunu test eder.


  @smoke
  Scenario: TC09 Ilk urun testi
    Given kullanici "amazonUrl" anasayfaya gider
    And arama kutusuna "nutella" yazip aratir
    Then ilk urunu tiklar
    And urun isminin "Nutella" icerdigini test eder
    And sayfayi kapatir