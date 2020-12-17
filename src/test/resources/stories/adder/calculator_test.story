Meta:
Narrative:
As user
I want to add,subtract,accumulate (addition),accumulate (subtraction) a number
So that I can have the result of the operation

Scenario: A user can submit a number to adder and get current sum
Given a number
When I submit another number 5 to adder
Then I get a sum of the numbers

Scenario: A user can submit a number to subtract and get current subtraction result
Given a number
When I submit another number 5 to subtract
Then I get the subtract result of the numbers