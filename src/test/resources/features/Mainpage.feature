Feature:Istanbul Ankara arası gidiş dönüş bilet alma

  @case1
  Scenario: Verify main page tabs
    Given kullanıcı enuygun.com sayfasına gider
    When kullanıcı "25" "Temmuz 2024" gidis "10" "Agustos 2024" donus "istanbul" "ankara" 1 yolcu bilet seçimi yapar
    And kullanıcı çıkan sonuçları filtreler
    Then kullanıcı çıkan sonuçlardan kalkış saatlerini doğrular