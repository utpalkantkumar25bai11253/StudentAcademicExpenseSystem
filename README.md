# Student Academic & Expense Management System

A Java command-line project for managing student academic records and expenses.

## Major Modules
1. Student Academic Management
2. Expense Management
3. Reports & Analytics

## Java Concepts
OOP, encapsulation, inheritance, abstraction, interfaces, polymorphism, ArrayList, HashMap, custom exceptions, character streams, file handling, packages and multithreading.

## Run
Requires JDK 17+.

```bash
javac -d out src/studentmanagement/*.java
java -cp out studentmanagement.Main
```

Data is stored in `data/` and the generated report is stored in `reports/final_report.txt`.

## Testing
Test add/search/update/delete student, add/view/delete expense, category summary, report generation, and restart the program to verify file loading.
