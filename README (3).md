# Student Academic & Expense Management System

A Java-based command-line application designed to manage student academic records and personal expenses in a simple and organized way.

## Overview

The Student Academic & Expense Management System provides a menu-driven interface for managing student information, recording expenses, generating category-wise summaries, and producing a final report.

The project demonstrates important Java programming concepts including Object-Oriented Programming, Collections, Exception Handling, File I/O, Character Streams, Interfaces, and Multithreading.

## Major Features

### 1. Student Academic Management
- Add new student records
- View all students
- Search students by ID
- Update student details
- Delete student records
- Validate student information

### 2. Expense Management
- Add new expenses
- View recorded expenses
- Delete expenses
- Generate category-wise expense summaries
- Validate expense details

### 3. Reports & Analytics
- Generate a complete academic and expense report
- Calculate total expenses
- Display category-wise expense information
- Store the generated report in a text file
- Generate reports using a separate thread

## Java Concepts Used

- Classes and Objects
- Encapsulation
- Inheritance
- Abstraction
- Interfaces
- Polymorphism
- Constructors
- ArrayList
- HashMap
- Custom Exception Handling
- Try-Catch and Exception Handling
- Character Streams
- File Handling
- BufferedReader and BufferedWriter
- Packages
- Multithreading

## Technologies and Tools

- Java
- JDK 17 or above
- Command Prompt / Terminal
- GitHub
- Text File Storage

## Project Structure

```text
StudentAcademicExpenseSystem/
├── data/
│   ├── students.txt
│   └── expenses.txt
├── reports/
│   └── final_report.txt
├── src/
│   └── studentmanagement/
│       ├── Main.java
│       ├── Person.java
│       ├── Student.java
│       ├── Expense.java
│       ├── StudentService.java
│       ├── ExpenseService.java
│       ├── FileManager.java
│       ├── Reportable.java
│       ├── ReportGenerator.java
│       └── ValidationException.java
├── README.md
└── statement.md
```

## Installation and Requirements

1. Install JDK 17 or above.
2. Download or clone this repository.
3. Open the project folder in Command Prompt or Terminal.
4. Make sure the `data` and `reports` folders are present.

## How to Run

Compile the project using:

```bash
javac -d out src/studentmanagement/*.java
```

Run the application using:

```bash
java -cp out studentmanagement.Main
```

## Application Workflow

```text
Start Application
       ↓
Main Menu
       ↓
 ┌───────────────┬───────────────┬────────────────┐
 ↓               ↓               ↓
Student       Expense          Generate
Management    Management        Report
 ↓               ↓               ↓
Add/View/      Add/View/       Analytics &
Search/        Delete/         Report File
Update/Delete Summary
       ↓
   Save Data
       ↓
      Exit
```

## Data Storage

Student and expense records are stored in text files inside the `data/` directory.

- `data/students.txt` — stores student records
- `data/expenses.txt` — stores expense records
- `reports/final_report.txt` — stores the generated report

The project uses Java character streams and buffered file handling for reading and writing data.

## Testing

The following functionalities were tested:

- Add student
- View student records
- Search student by ID
- Update student details
- Delete student
- Add expense
- View expenses
- Delete expense
- Generate category-wise expense summary
- Save data to files
- Load saved data after restarting the application
- Generate final report
- Verify report file creation

## Error Handling

The application validates user input and handles invalid data using custom exception handling.

Examples include:

- Invalid student ID
- Invalid student name
- Invalid CGPA
- Invalid semester
- Invalid expense amount
- Invalid menu choices
- File input/output errors

## Non-Functional Features

- **Usability:** Menu-driven command-line interface for simple navigation.
- **Reliability:** Input validation and exception handling reduce invalid data entry.
- **Maintainability:** Functionality is divided into separate classes and services.
- **Resource Efficiency:** Buffered character streams are used for file operations.

## Project Objective

The main objective of this project is to develop a functional Java application that applies core Java programming concepts to a practical student-management problem while maintaining modularity, validation, file persistence, and report generation.

## Future Enhancements

- Add a graphical user interface
- Add database support using JDBC
- Add user authentication
- Add more advanced academic analytics
- Export reports to PDF or Excel
- Add monthly and yearly expense analysis

## Author

Student Academic & Expense Management System  
Developed as a Java course project.