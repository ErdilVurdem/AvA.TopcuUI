Feature: Kullanici ilgili web sitesi anasayfasına erişim saylayabilmeli ve gerekli islemleri yapabilmeli

  Background:
  * Kullanici 'https://avukatalitopcu.com/' ana sayfasına gider ve gidildigini dogrular

  @erisim
  Scenario Outline: Kullanici ilgili header kısmını goruntuleyebilmeli
    * Header kisminda bulunan '<Secenekler>' gorundugunu dogrular
    * Sayfayi kapatir
    Examples:
      |Secenekler                       |
      |Ana Sayfa                        |
      |Hakkımızda                       |
      |Çalışma Alanlarımız              |
      |Blog                             |
      |İçtihat ve Kararlar              |
      |İletişim                         |
      |DANIŞMANLIK                      |

  @dahaFazla
  Scenario: Kullanici ana sayfadaki butonlara tıkladığında istenilen sayfaya gidebilmeli
    * 'İçtihatlar ve Kararlar' ve 'Blog' bolumu gorunene kadar sayfayı aşağıya kaydırır, ilgili bolumlerin gorundugunu ve erisilebildigini dogrular
    * Sayfayi kapatir
