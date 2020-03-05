Feature: site 
	As a user 
I want to open a website
so that i can check menu
@SmokeTest
Scenario: check Menu of javabykiran.com 
	Given open a browser 
	#When I open a jbksite "https://www.javabykiran.com/"
	When I open a jbksite 
	Then Videos menu should appears