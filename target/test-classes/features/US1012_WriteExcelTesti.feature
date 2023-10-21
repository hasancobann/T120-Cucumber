Feature: US1012 Kuallnici excel'e data ekler
  @excel
  Scenario: TC16 Kullanici excel'e data ekleyebilmeli
    Given kulanici ulkeler excelinde Sayfa1'e kadar ayarlari yapar
    Then 5. sutunu olusturur
  And baslik satirinda besinci hucreye yeni bir cell olusturur
  And Olusturdugumuz hucreye "ulke nufusu" yazdirir
  Then 2.satir ulke nufusu kolonuna 1500000000 yazdirir
  And 8.satir ulke nufusu kolonuna 250000000 yazdirir
  And Dosyayi kaydeder
  Then excel'de 2.satirin ulke nufusunun 1500000000 test eder
    And excel'de 8.satirin ulke nufusunun 250000000 test eder
    And stream'leri kapatir
