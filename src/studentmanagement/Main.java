package studentmanagement;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentService ss = new StudentService();
    static ExpenseService es = new ExpenseService();

    public static void main(String[] args) {
        FileManager.loadStudents(ss.getStudents());
        FileManager.loadExpenses(es.getExpenses());
        int choice;
        do {
            System.out.println("\n===== STUDENT ACADEMIC & EXPENSE MANAGEMENT =====");
            System.out.println("1. Student Management\n2. Expense Management\n3. Generate Report\n4. Save Data\n0. Exit");
            choice = readInt("Enter choice: ");
            try {
                switch (choice) {
                    case 1 -> studentMenu();
                    case 2 -> expenseMenu();
                    case 3 -> ReportGenerator.generate(ss.getStudents(), es.getExpenses());
                    case 4 -> saveAll();
                    case 0 -> { saveAll(); System.out.println("Program closed."); }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (ValidationException e) {
                System.out.println("Validation error: " + e.getMessage());
            }
        } while (choice != 0);
    }

    static void studentMenu() throws ValidationException {
        int c;
        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add  2. View  3. Search  4. Update  5. Delete  0. Back");
            c = readInt("Enter choice: ");
            switch (c) {
                case 1 -> {
                    String id = readText("ID: "), name = readText("Name: "), course = readText("Course: ");
                    double cgpa = readDouble("CGPA (0-10): ");
                    int sem = readInt("Semester: ");
                    ss.addStudent(new Student(id, name, course, cgpa, sem));
                    System.out.println("Student added.");
                }
                case 2 -> ss.viewStudents();
                case 3 -> {
                    Student s = ss.searchStudent(readText("ID: "));
                    System.out.println(s == null ? "Student not found." : s);
                }
                case 4 -> {
                    String id = readText("ID: "), name = readText("New name: "), course = readText("New course: ");
                    double cgpa = readDouble("New CGPA: ");
                    int sem = readInt("New semester: ");
                    System.out.println(ss.updateStudent(id, name, course, cgpa, sem) ? "Student updated." : "Student not found.");
                }
                case 5 -> System.out.println(ss.deleteStudent(readText("ID: ")) ? "Student deleted." : "Student not found.");
                case 0 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (c != 0);
    }

    static void expenseMenu() throws ValidationException {
        int c;
        do {
            System.out.println("\n--- Expense Management ---");
            System.out.println("1. Add  2. View  3. Delete  4. Category Summary  0. Back");
            c = readInt("Enter choice: ");
            switch (c) {
                case 1 -> {
                    String cat = readText("Category: "), desc = readText("Description: ");
                    double amount = readDouble("Amount: ");
                    es.addExpense(new Expense(cat, amount, desc));
                    System.out.println("Expense added.");
                }
                case 2 -> es.viewExpenses();
                case 3 -> System.out.println(es.deleteExpense(readInt("Expense ID: ")) ? "Expense deleted." : "Expense not found.");
                case 4 -> es.categorySummary();
                case 0 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (c != 0);
    }

    static void saveAll() {
        FileManager.saveStudents(ss.getStudents());
        FileManager.saveExpenses(es.getExpenses());
    }
    static String readText(String m) { System.out.print(m); return sc.nextLine().trim(); }
    static int readInt(String m) {
        while (true) try { return Integer.parseInt(readText(m)); }
        catch (NumberFormatException e) { System.out.println("Enter a valid integer."); }
    }
    static double readDouble(String m) {
        while (true) try { return Double.parseDouble(readText(m)); }
        catch (NumberFormatException e) { System.out.println("Enter a valid number."); }
    }
}
