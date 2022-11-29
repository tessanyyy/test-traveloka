Feature: Search

  Scenario: Mengakses web traveloka
    When Mengakses web traveloka
    Then Berhasil mengakses web traveloka

  Scenario: Search Car Rental
    When Klik car rental
    And Pilih jenis car rental
    And Input rental location
    And Input start date
    And Input start time
    And Input end date
    And Input end time
    And Klik button search
    Then Tampil hasil pencarian

  Scenario: Continue search car rental
    When Continue search
    And Continue rental provider
    And Select pickup location
    And Select pickup
    And Click pickup location
    And Select dropoff location
    And Select dropoff
    And Click dropoff location
    And Click continue pay
    Then Get your booking

