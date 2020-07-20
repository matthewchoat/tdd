<h1>The Problem Solving Framework : 'UPER'</h1>

* U = "Understand"
* P = "Plan"
* E = "Execute"
* R = "Reflect" / "Refactor"

<h2>1. Understanding the Problem</h2>
*<p> So for this assignment, I will need to create an app that prints a receipt for 3 different orders and calculate the proper tax and totals the purchased items. </p>
*<p> I will need to design this app from scratch using OOD principles implemented using a TDD approach.</p>
*<p> The client requests for this app are fairly straightforward and the scope of the project doesn't seem to be very large. That doesn't mean a lot of code won't be required, but we still only want to focus on delivering MVP.</p>
*<p> To further understand the requirements and expectations, I read the Preamble letter attached to the repo. This made it clear that we should be taking a strict Test Driven approach to this project and that the client is looking for how we creatively solve this challenge.</p>
*<p> </p>
*<p> </p>
*<p> </p>
*<p> </p>
<h2>
    2. Planning the Solution
</h2>
*<p> So I need to create a receipt that prints out a specific list and prices with tax. I will need to use OOP to create my list and run calculations on it before printing it out to the console.</p>
*<p> I think the first thing to do is think about how to structure this app. To do this, I will create a mock UML Diagram with the basic class flow I plan to use.</p>
*<p> See my file, UML_Diagram.png in this repository, to view my basic app class structure. </p>
*<p> I definitely want to implement an interface that products can then be created from. This interface will have four variables, Name, Price, Exempt, and String.</p>
*<p> Since the client requirements are requesting 3 separate lists to print, I figure the best way to approach this from an object oriented mindset (don't worry I'll get to my plan for testing as soon as I explain this basic class structure) would be add each product to a "Basket" class as an ArrayList so I can call the entire basket as an object. </p>
*<p> Once I have set up my basket of products, I can then perform calculations on the basket by taking in the products and their variables into a Calculator class. The calculator class will also take in constants from a separate "Constants" class.</p>
*<p> My Constants class will contain things like the regular Tax Rate, the Import Rate, and Tax/Import Multiplier values. I think making my constants part of an object Class will make it easier to pass in other tax rates besides the default 10% rate, if the client wants me to scale up this application in the future.</p>
*<p> Once the Calculator class completes the tax calculations, it should send an array back to the Basket object. Then, the basket array can be sent to the Receipt class where it is iterated through and added to a console print. Finally, the Main class initializes all our objects and calls the Receipt method to print out the lists to the console.</p>
*<p> With all that in mind, I'm going to have to approach this from a TDD mindset which means, writing my tests first, getting the tests to fail(making "dummy" methods of what I want to implement to pass the tests), refactoring (Filling in those "dummy" methods until the test passes), and then pushing up my code to GitHub between each step in the "Red > Green refactor cycle".
*<p> I will create separate Test classes for each of my main classes where I will try to write a test for each step in the process of building this app.</p>

<h2>
    3. Executing the Plan
</h2>
*<p> When I was in the process of creating my basic filestructure for this project, I was contacted by two of my group members, John B. and Zach J.. They asked if I wanted to do some pair programming to try and practice implementing the TDD approach together.</p>
*<p> I thought it would be a great opportunity to work with John and Zach and kind of help each other strategize the best ways to accomplish this task. John and Zach had some experience writing tests in Python, and I have some experience writing tests in Ruby on Rails, but we were all very new to testing in Java. Working together at the beginning of this project was very beneficial for our learning and even though it added a lot more hours to the project, I think we all benefited from the experience.</p>
*<p> We also decided to devote some time to helping other students who were struggling with TDD concepts and encountering bugs in their apps. We ended up bringing Nancy G. into our pair programming sessions and kind of helping her to understand the project requirements and how to write tests before writing code. This did take a lot of time away from developing my own app, but I really do try to help my fellow TEKcamp classmates whenever they need. It was also very beneficial for me to work so much with Nancy and other students because when I was looking at their code and explaining why certain things tests passed or failed, I felt like I was really understanding it better myself in the process.</p>
*<p> So, with all that said, my basic flow for writing this application was fairly straightforward. I started by populating the "IProduct" interface class with simple getter/setter methods for its four properties: Name, Price, Exempt, and String. I decided to wait until I created my Product class that Implements "IProduct" to write tests for these getter/setter methods.</p>
*<p> I created my "Product" class and then wrote tests in my ProductTest class to make sure the property getters were working correctly. These tests failed initially because I didn't write the logic in the getter methods yet. I then set up the getter methods and got the tests to pass. Easy peasy for this class so far!</p>
*<p> I then set up the "Basket" class and wrote tests for checking to see if the Basket is a singleton (cannot instance twice), and can add products to the Basket. I also wrote a test for checking if my empty cart method was working, but I wouldn't write my empty cart method until near the end of the project when I was needing to clear the cart to create multiple product lists to print out.</p>
*<p> Once the Basket tests were passing, I decided to write the "meat and potatoes" of my application, the "Calculator" class. My basic approach for this class was to write a method that looped through my Products array and tested for four distinct conditions that affected the product's individual tax rate. Based on my loop, a product's price could be multiplied by a tax rate of 05% (import tax only), 10% (tax onlY), 15% (import and tax), or no added taxes. I made these conditions if/else if statements, but in the future I would like to refactor these statements in a more object-oriented approach. Obviously, I wrote tests first for these tasks that made sure the Price was being properly imported into Calculator, that the price was being taxed correctly, that the price was being updated in the array with the added taxes, and that the Total Taxes were being calculated during the loop. Once all these tests passed, I knew the application was almost functional!</p>
*<p> I then set up the Receipt class and just a few tests to make sure the Receipt was getting the Basket array list data properly and outputting the proper String to display the product lists.</p>
*<p> The final step was simply to add all of the products to the basket in the Main class and call my methods to output them to the console as three separate lists. This was a challenge to approach test-wise without a 3rd party testing library such as "Mockito" to test specific console log output. Since I didn't have time to implement "Mockito" console log testing, I went ahead and relied on my tests in the ReceiptTest class to ensure the console log was printing what it was supposed to.</p>
<h2>
    4. Reflection / Refactor
</h2>
*<p> I know I could do a lot of refactoring on this app to better adhere more closely to the four pillars of OOP such as encapsulation, SOLID OOP principles, Object Oriented Design patterns, and of course I could write so many more tests to really obtain close to 100% code coverage for testing. However, myself, John B., and Zack J., thought it would be more beneficial to help our classmates who were struggling to complete this assignment using the knowledge we gained from working together earlier when starting this project. I'm very glad we were able to help a few other classmates better understand how to properly test applications, and I don't regret spending as much time as I have this week to help anyone I could. </p>
*<p> I did refactor two more of my classes to be singletons since there was no need for them to be able to create multiple instances. I also wrote new tests to make sure the class was in fact a single instance only.</p>
*<p> I do plan to continue refactoring this application and adding some creative flare and possibly features like additional tax rates depending on where the orders were purchased.</p>
*<p> I would also learn how to use the testing library "Mockito" to properly test my console output. This required making my project a Maven project as well as performing other setup tasks and learning the Mockito syntax, and I just didn't have time to implement it for this round.</p>
*<p> One thing that was bothersome about this project was that a couple of the totals were 3 or 4 cents off what was expected for the print output according to the ReadMe. I also saw in our Slack chat that several of my classmates were noticing this apparent oversight as well. I hate that a few of my totals don't match up with the expected output on the readme, but I have double and triple checked all my tests and by-hand calculations, and the output from my app exactly matches my own calculations for taxes.</p>
*<p> I learned so much from building this app and I think it will be instrumental to my success as a developer going forward. I plan to continue honing my TDD mindset and will try to implement a Test-driven approach to apps I make in the future! I am looking forward to feedback from the client about my approach to this project don't mind answering any other questions they might have for me.</p>
*<p> </p>
*<p> </p>
*<p> </p>