Feature: Login Test 
	Scenario Outline: Multiple login checks 
		Given User is on Login Page 
		When User enters username "<username>" and password "<password>" 
		Then Login should be "<status>" 
	Examples: 
		| username | password   | status  | 
		| admin    | admin123   | success | 
		| wrong    | test123    | failure |