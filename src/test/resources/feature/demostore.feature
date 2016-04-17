Feature: Verify the different scenarios on the online store page

@test
Scenario: Verify submitting an order for Apple iPhone 4s 6GB
Given I log in to the application
And I am on the "account" page
When I place cursor on "product category" link
And I click on "iPhones" link
And I click on "Apple iPhone" link
And I click on "Add to cart" button
And My focus is set on the body frame
And I click on "go to checkout" button
Then I verify that the "price" is "$270.00"
And I click on "Continue" button
And I click on "purchase" button
Then I verify that the "text" is "Transaction Results"


@test
Scenario: Verify updating account details
Given I log in to the application
And I am on the "account" page
And I click on "your details" link
And I enter "Ch" in the "last name" text field
And I click on "save profile" button
And I click on "logout" link
And I log in to the application
And I am on the "account" page
And I click on "your details" link
Then I verify that the "lastname" text field is "Ch"

@test
Scenario: Verify empty cart message after removing all the items from cart
Given I log in to the application
And I am on the "account" page
When I place cursor on "product category" link
And I click on "iPhones" link
And I click on "Apple iPhone" link
And I click on "Add to cart" button
And My focus is set on the body frame
And I click on "go to checkout" button
And I click on "remove" button
Then I verify that the "message" is "Oops, there is nothing in your cart."

