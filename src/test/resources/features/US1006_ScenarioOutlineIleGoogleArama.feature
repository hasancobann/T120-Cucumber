Feature: US1006 Verilen listedeki urunleri google'da arama

  # verilen listedeki her ürünü google'da aratip
  # arama sonuçlarının aranan ürün ismini içerdiğini test edin.
  @wip
  Scenario Outline: TC10 google'da listedeki urunler aratilabilmeli
    Given kullanici "googleUrl" anasayfaya gider
    Then google da "<istenenKelime>" icin arama yapar
    And google arama sonuclarinin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime |
      | Nutella |
      | Java |
      | Apple |
      | Samsung |
      | Wise Quarter |
