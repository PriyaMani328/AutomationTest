Feature: Online Shopping

  #1
  Scenario: Login to the application and Order a T-Shirt
    Given Launch My Store App
    And Click on SignIn Button 
    Then Enter Username and Password and Sign In to the app
    And Order T-Shirt
    And Verify the Order History
    
    
     #2
  Scenario: Update the Personal Information
 Given Launch My Store App
 And Click on SignIn Button 
 Then Enter Username and Password and Sign In to the app
Then Click on Customer Account Information
And Edit First Name and Save

