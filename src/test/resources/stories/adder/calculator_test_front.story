Lookup a definition
Narrative:
As user
I want to add,subtract,accumulate (addition),accumulate (subtraction) a number using the Calculator UI
So that I can have the result of the operation

Scenario: Looking for the current number
Given the user is on the Calculator page
When the user looks up the current number
Then they should see the output 'Current number is 0'

Scenario: Adding a number to current number
Given the user is on the Calculator page
When the user add number '1'
Then they should see the output 'The result of the addition is to current is 1'

Scenario: Subtracting a number to current number
Given the user is on the Calculator page
When the user subtract number '5'
Then they should see the output 'The result of the subtraction is to current is -5'

Scenario: Accumulating (add) a number to current number
Given the user is on the Calculator page
When the user accumulate + number '2020'
Then they should see the output 'Current number is now 2020'

Scenario: Accumulating (subtract) a number to current number
Given the user is on the Calculator page
When the user accumulate - number '2020'
Then they should see the output 'Current number is now 0'

Scenario: Doing several operations
Given the user is on the Calculator page
When the user looks up the current number
Then they should see the output 'Current number is 0'
When the user add number '3'
Then they should see the output 'The result of the addition is to current is 3'
When the user subtract number '18'
Then they should see the output 'The result of the subtraction is to current is -18'
When the user accumulate + number '4'
Then they should see the output 'Current number is now 4'
When the user accumulate - number '16'
Then they should see the output 'Current number is now -12'
When the user accumulate + number '48'
Then they should see the output 'Current number is now 36'
When the user looks up the current number
Then they should see the output 'Current number is 36'


