Feature: Website CartPage Checkout

Scenario: Testing Proceed to Checkout

When User click addcart
When User go to Cartpage
When User click checkout
When User input firstname lastname company address1 address2 city postcode phone additional
Then User click check button terms and Place order
