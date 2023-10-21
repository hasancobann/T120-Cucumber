 Feature: US1011 Saucedemo alisveris testi
   @sauce
   Scenario: TC15 Saucedemo sitesinden alisveris yapilabilmeli
     Given kullanici "saucedemoUrl" anasayfaya gider
     Then Username kutusuna "standard_user" yazar
     And Password kutusuna "secret_sauce" yazar
     And Souce login butonuna basar
     When lk urunun ismini kaydeder ve bu urunun sayfasina gider
     And Add to Cart butonuna basar
     Then Alisveris sepetine tiklar
     And Sectigi urunun basarili olarak sepete eklendigini control eder
     Then sayfayi kapatir