# Challenge Week 1
This repository contains the solutions for the challenges of the first week of the Challenge.

## Question 1 - Scoreboard
Implementation:
In this challenge, Java was used to create a program that manages student information and determines who will fail based on their performance in tasks.

The program starts by reading the number of students in an instance. Then, it reads the name and the number of problems solved by each student. The program organizes the students in ascending order of problems solved and, in case of a tie, in alphabetical order. The student with the lowest number of problems solved and a more advanced alphabetical name is considered the one who fails.

The code creates a Student class to store the information of each student, including the name and the number of problems solved. The main method controls the data reading, the sorting of students, and the identification of the failing student in each instance.

## Question 2 - Sentiment Expressed in Message
Implementation:

Development of a Java program that uses the Scanner class to read an input line representing a message containing emoticons. The program calculates the quantity of positive emoticons (":-)") and negative emoticons (":-(") present in the message and compares the numbers. Based on the comparison, the program determines the sentiment expressed in the message as "neutral," "fun," or "upset."

*The auxiliary function countOccurrences counts the number of occurrences of a specific pattern in a string. This allows us to calculate the quantity of positive and negative emoticons in the message.

## Question 3 - Calculator
Implementation:

We have developed a Java program that implements a simple calculator capable of evaluating arithmetic expressions. The program receives the expressions and performs addition and subtraction operations according to the operators present in the input. The Expression class is responsible for evaluating an expression, while the Main class controls the input and output.

The Expression class uses the evaluateExpression function to evaluate an arithmetic expression. It divides the input into tokens (numbers and operators), performs the calculations, and returns the result.

The Main class reads the input, calls the evaluateExpression function, and prints the results of each tested expression.

*An input.txt file was created for input testing.

## Question 4 - SQL Script
In this question, an SQL script was created to generate tables Person and Address with relationships between them. Fields such as name, age, address, etc., were defined. The id_address field in the Person table is a foreign key referencing the address_id field in the Address table, establishing a relationship between the two tables.

## Question 5 - MongoDB Script
Implementation:
In this question, a MongoDB script was created that uses the db.createCollection() method to create two collections: Person and Address. The script defines validations to ensure that the documents inserted into the collections follow the specified structure, including mandatory fields and their types following the required format.
