Feature: Title of your feature

  Scenario Outline: Title of your scenario outline
    Given open browser and launch google
    When type "<search>"
    Then close the browser

    Examples: 
      | search   |
      | amazon   |
      | flipkart |
      | snapdeal |
      | paypal   |
