# Student Academic & Expense Management System

## Problem Statement

Students often need to maintain academic information and track their daily expenses separately. Managing these records manually can make it difficult to organize information, search records, calculate summaries, and generate useful reports.

The **Student Academic & Expense Management System** provides a simple command-line Java application that combines student academic record management and expense tracking in one system.

## Project Objective

The objective of this project is to develop a modular Java application that allows users to:

- Manage student academic records
- Track daily expenses
- Store data using local files
- Search, update, and delete records
- Perform basic academic and expense analysis
- Generate useful reports
- Apply core Java programming concepts

## Scope

The project covers:

- Student academic record management
- Expense record management
- Searching, updating, and deleting records
- Category-wise expense analysis
- Academic and expense summaries
- File-based data storage
- Text report generation
- Input validation and exception handling

The current version is a **command-line application with local file-based persistence**.

## Target Users

The primary target users are students who want to maintain basic academic information and track their personal expenses using a simple Java-based application.

## Functional Requirements

1. The system shall allow users to add student records.
2. The system shall allow users to view student records.
3. The system shall allow users to search students using their student ID.
4. The system shall allow users to update student information.
5. The system shall allow users to delete student records.
6. The system shall allow users to add expense records.
7. The system shall allow users to view expense records.
8. The system shall allow users to delete expense records.
9. The system shall calculate category-wise expense summaries.
10. The system shall calculate academic and expense summaries.
11. The system shall save and load records using text files.
12. The system shall generate a final text-based report.
13. The system shall validate user input and handle invalid data.

## Non-Functional Requirements

### 1. Usability

The application shall provide a menu-driven command-line interface for simple navigation.

### 2. Reliability

The application shall use input validation and exception handling to reduce invalid data and handle runtime errors.

### 3. Maintainability

The system shall use separate classes and service components to keep the implementation modular and easier to maintain.

### 4. Resource Efficiency

Buffered character streams shall be used for efficient reading and writing of local data files.

### 5. Portability

The application shall run on systems with **JDK 17 or above** without requiring a graphical environment.

## Major Modules

### Module 1: Student Academic Management

Handles:

- Adding student academic records
- Viewing student records
- Searching students
- Updating student information
- Deleting student records

### Module 2: Expense Management

Handles:

- Adding expense records
- Viewing expense records
- Deleting expense records
- Generating category-wise expense summaries

### Module 3: Reports & Analytics

Handles:

- Academic summaries
- Expense summaries
- Overall analysis
- Generating and storing the final report in a text file

## Technologies Used

- **Programming Language:** Java
- **JDK:** 17+
- **Collections:** Java Collections Framework
- **File Handling:** File I/O and Character Streams
- **Multithreading:** Java Threads
- **Version Control:** GitHub

## Data Storage

The application uses local text files for data persistence.

```text
data/
├── students.txt
└── expenses.txt

reports/
└── final_report.txt
```

### Data Files

- `data/students.txt` — stores student academic records.
- `data/expenses.txt` — stores expense records.
- `reports/final_report.txt` — stores the generated final report.

## Future Enhancements

The system can be extended with the following features:

- JDBC and MySQL database integration
- User authentication and login
- Graphical User Interface (GUI)
- Interactive dashboard
- PDF and CSV report export
- Advanced academic analytics
- Advanced expense analytics
- Cloud-based data storage

## Conclusion

The **Student Academic & Expense Management System** is a modular Java-based command-line application designed to combine academic record management and personal expense tracking in a single system. It demonstrates practical use of Java programming, collections, file handling, exception handling, input validation, and multithreading while providing a foundation for future database and GUI-based enhancements.
