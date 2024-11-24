# socialmedia-analysis
This project is a web scraping tool designed to extract data from Instagram profiles using Selenium WebDriver. It gathers key profile metrics, such as the number of followers, following, and other relevant details, and stores the scraped data in a MySQL database for further analysis.

## Key Features
- Automated Data Extraction: Scrapes profile metrics like followers, following, and other public information.
- Data Storage: Utilizes MySQL to store and retrieve data for analysis.
- Cross-Browser Compatibility: Built with Selenium WebDriver for robust browser automation.
- Structured Testing: Implements TestNG for test case management and validation.

 ## Tech Stack
- Programming Language: Java
- Automation Tool: Selenium WebDriver
- Database: MySQL
- Testing Framework: TestNG

## Project Setup
### Prerequisites
- java Development Kit (JDK)
- Selenium WebDriver
- MySQL Server
- TestNG (integrated with your Java IDE)

## Installation
- Clone the repository:
  ```bash
  git clone https://github.com/your-username/instagram-scraper.git  
- Install required libraries using Maven or manually:
    - Selenium WebDriver
    - TestNG
    - MySQL Connector for Java
-  Set up the MySQL database
      - Create a database and table to store Instagram profile data.
      - Use the following SQL script as a template:
        
CREATE DATABASE InstagramScraper;  
USE InstagramScraper;  
CREATE TABLE ProfileData (  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    username VARCHAR(50),  
    followers INT,  
    following INT,  
    scraped_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP  
);  
- Update the database credentials in the project code:
     - String dbUrl = "jdbc:mysql://localhost:3306/InstagramScraper";  
     - String username = "your-username";  
     - String password = "your-password";
- Configure the Selenium WebDriver for your preferred browser (e.g., ChromeDriver).       
       
