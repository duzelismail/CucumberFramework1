Feature: Amazon yeni kayit
  @kayit
  Scenario: yeni kullanici kaydi
    Given kullanici amazon ana sayfasina gider
    And mausu hello,anmelden butonuna götürür
    And erstellen butonuna tiklar
    When kullanici bilgileri girer ve submit eder
    Then kullanici puzzlei görür
