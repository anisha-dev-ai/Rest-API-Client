# Rest-API-Client

COMPANY:CODTECH IT SOLUTIONS PRIVATE LIMITED

NAME:ANISHA PRIYADARSHINI

INTERN ID:CITS333

DOMAIN:JAVA PROGRAMMING

DURATION:6 WEEKS

MENTOR:NEELA SANTOSH

REST API Client Using Java

Introduction

In modern software development, REST APIs play an important role in enabling communication between applications and web services. A REST API (Representational State Transfer Application Programming Interface) allows applications to request and exchange data over the internet using HTTP methods such as GET, POST, PUT, and DELETE. This project demonstrates the implementation of a Java-based REST API client that fetches weather information from a public weather service and displays the data in a structured format.

Objective

The main objective of this project is to develop a Java application that consumes a public REST API, handles HTTP requests, parses JSON responses, and presents the retrieved information to the user in a readable format. The project helps in understanding how Java applications interact with web services and process real-time data.

Project Overview

The Weather Information System is a console-based Java application that allows users to enter the name of a city and receive current weather information for that location. The application uses the free wttr.in weather API to obtain real-time weather data. The response from the API is received in JSON format and then processed using the org.json library.

The project follows an object-oriented design and is divided into three separate classes:

Weather.java
WeatherService.java
WeatherApiClient.java

This modular structure improves code readability, maintainability, and reusability.

Working of the Application

When the program starts, the user is prompted to enter a city name. The WeatherApiClient class receives this input and sends it to the WeatherService class. The WeatherService class creates a URL for the API request and establishes a connection using HttpURLConnection.

An HTTP GET request is sent to the weather API. The API responds with weather data in JSON format. The program reads the response and extracts important information such as temperature, humidity, wind speed, and atmospheric pressure. These values are then stored in a Weather object.

Finally, the application displays the weather details in a well-formatted report on the console.

Technologies Used

Java Programming Language
REST API
HTTPURLConnection
JSON Parsing using org.json Library
Object-Oriented Programming (OOP)

Features

Accepts user input for city names.
Connects to a public weather REST API.
Sends HTTP GET requests.
Parses JSON responses efficiently.
Displays weather information in a structured format.
Uses separate classes for better organization and maintainability.
