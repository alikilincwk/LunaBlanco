@RegressionTest @SmokeTestStore
Feature:Store/All Catogories

  Scenario:Filter,Hover over and click,view types,sort

    Given a customer navigates to LunaBlanco
    When the customer hovers over to store
    Then the customer hovers over to each catogory
    |ALLE PIECES|
    |T-SHIRTS|
    |HOODIES|
    |SWEATER|
    |HEADWEAR|
    |ARCHIV|
    Then the customer filters the products
    Then the customer views the products in chosen form
    Then the customer sorts the products by each selection
