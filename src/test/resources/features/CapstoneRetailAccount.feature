Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'vahidb57@yahoo.com' and password 'Tek@1234'
    And User click on login button
    And User should be logged in into Account
    

  @SmokeTest
  Scenario: Verify User can update Profile Information
   And User click on Account option
    And User update name 'itsMeee' and phone '6764445444'
    And User click on Update button
    Then User profile information should be updated

     @updatePassword
  Scenario: Verify User can Update password
    And User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@1234567           | Tek@1234      | Tek@1234          |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @addPayment
  Scenario: Verify User can add a payment method
   And User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
     | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1345432345652365     | Aziz      | 12           | 2025          | 789       |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @editpayment
  Scenario: Verify User can edit Debit or Credit card
    And User click on Account option
   
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2345432345654325      | Aziz      | 12           | 2026          | 347        |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @removedebitcard
  Scenario: Verify User can remove Debit or Credit card
   And User click on Account option
    And User click on remove option of card section
    Then payment details should be removed


  @verifyusercanAddAddress
  Scenario: Verify User can add an Address
   And User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state     | zipCode |
      | United States   | vahid B    | 2222222223       | 12 edgeway        | 235 |dssf | Virginia | 23454  |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @verifyusercaneditAddress
  Scenario: Verify User can edit an Address added on account
  And User click on Account option
    And User click on edit address option
    And user fill new address form with below information
    | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
    | United States   | vahidullah    | 3333333333     | 34 run away       | 123 | metropolis | Virginia| 23434 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’


@verifyRemoveAddress
  Scenario: Verify User can remove Address from Account
   And User click on Account option
    And User click on remove option of Address section
  
    Then Address details should be removed 


    