Feature: Zadanie warsztatowe 1 - Selenium WebDriver + Cucumber
  Scenario Outline: Successful test
    Given Browser with open page at address https://mystore-testlab.coderslab.pl
    When  Signed in with created user
    And Addresses clicked
    And Checked current URL
    And Create new address clicked
    And I add alias <Alias>
    And I add address <Address>
    And I add city <City>
    And I add postalcode <Zip/Postal Code>
    And I add phone <Phone>
    And I set country <Country>
    And Click save
    And Checked if adress was add
    Then Checked the added addresses
  Examples:
    |Alias              |Address      |City    |Zip/Postal Code|Phone    |Country       |
    |Mój adres          |Marszałkowska|Warszawa|00-017         |225513333|United Kingdom|




