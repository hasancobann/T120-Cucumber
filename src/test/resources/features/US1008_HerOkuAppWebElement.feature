Feature: US1008 Kullanici herokuapp sayfasinda beklemeleri yapar

  @smoke
  Scenario: TC12 Kullanici bekleme islemlerini yapar
    Given kullanici "herokuappUrl" anasayfaya gider
    When Add element butonuna basar
    And Delete butonu goronor oluncaya kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir