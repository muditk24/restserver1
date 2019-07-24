Feature: Calculator application in rest

	Scenario: Addition for two numbers
		Given rest api "http://localhost:9000/api/addition?first=10&second=20"
		When I invoke api
		Then expected result 30.0 

