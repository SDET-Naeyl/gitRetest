Feature: Tek School Scenarios

  Background: 
    Given User is on TekSchool Page
    When User click on Test Environment link

  @SDET_002
  Scenario: Open Test Environment page from Tek School of America Website
    # there is not need for scenario in this step
    # because it is already covered in background
    Then User should see Test Environment page


    
    @SDET_003
    Scenario Outline: User should be able to log in by typing their e mail and password on Test environment Page
    
    When User clicks on Log in under MyAccount Drop down
    And User enters e mail address '<username>' and password '<password>' 
    And User clicks on Log in
    Then User should be able to log in
    

  Examples: |username|password|
  
    |teststudent@gmail.com|Tek@Test.com|
    
    @SDET_004
    Scenario: User should be able to log out after log in
    
    When User clicks Logs In with info
    Then User should be logged out
  
    |teststudent@gmail.com|Tek@Test.com|
          
          
          
       # firstName|lastName|email|phone|password
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          