Feature:
  Search tv

  Scenario: Search TV
    Given open page "http:\\hotline.ua"
    When I search "телевизоры"
    And Open first item
    Then Type should contains "телевизор"