package studentmanagement;
import java.io.*;
import java.util.List;

public class ReportGenerator implements Reportable {
    private final List<Student> students; private final List<Expense> expenses; private final String path;
    public ReportGenerator(List<Student> s, List<Expense> e, String path) { students=s; expenses=e; this.path=path; }
    public void generateReport() {
        new File("reports").mkdirs();
        double total=0, cgpa=0;
        for (Expense e: expenses) total += e.getAmount();
        for (Student s: students) cgpa += s.getCgpa();
        double avg = students.isEmpty() ? 0 : cgpa/students.size();
        try (BufferedWriter w=new BufferedWriter(new FileWriter(path))) {
            w.write("STUDENT ACADEMIC & EXPENSE REPORT\n");
            w.write("=================================\n");
            w.write("Total Students: "+students.size()+"\n");
            w.write(String.format("Average CGPA: %.2f%n",avg));
            w.write(String.format("Total Expenses: ₹%.2f%n%n",total));
            w.write("STUDENT DETAILS\n");
            for(Student s:students) w.write(s+"\n");
            w.write("\nEXPENSE DETAILS\n");
            for(Expense e:expenses) w.write(e+"\n");
        } catch(IOException e) { System.out.println("Report error: "+e.getMessage()); return; }
        System.out.println("Report generated: "+path);
    }
    public static void generate(List<Student> s, List<Expense> e) {
        ReportGenerator g=new ReportGenerator(s,e,"reports/final_report.txt");
        Thread t=new Thread(g::generateReport,"ReportThread");
        System.out.println("Starting "+t.getName()+"...");
        t.start();
        try { t.join(); } catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    }
}
