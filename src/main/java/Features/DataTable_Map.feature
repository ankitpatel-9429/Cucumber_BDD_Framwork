Feature: Datable using map

Scenario: Submit contact info using data table and Maps


Given a user on contact page
When a Check the page title
Then a Enter contact informations
|cat| subject| message  | name |email| phono|
| 1 | Sub1	| Message 1 | Name 1|abc@gmail.com | 1234567893|
| 2 | Sub2	| Message 2 | Name 2|abc2@gmail.com | 1234567893|
| 3 | Sub3	| Message 3 | Name 3|abc3@gmail.com | 1234567893|

Then a close the contact page browser