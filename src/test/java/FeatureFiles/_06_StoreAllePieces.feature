Feature:Store/All Catogories

  Scenario:Filter,Hover over and click,view types,sort

    Given Navigate to LunaBlanco
    When Hover over to Store
    Then Hover over to each catogory
    |ALLE PIECES|
    |T-SHIRTS|
    |HOODIES|
    |SWEATER|
    |HEADWEAR|
    |ARCHIV|
    Then Filter products
    Then view products in choosen form
    Then sort by each selection
