package studentmanagement;
import java.io.*;
import java.util.List;

public class FileManager {
    static final String DIR = "data";
    static void saveStudents(List<Student> list) {
        new File(DIR).mkdirs();
        try (BufferedWriter w = new BufferedWriter(new FileWriter(DIR + "/students.txt"))) {
            for (Student s : list) w.write(s.getId()+"|"+s.getName().replace("|"," ")+"|"+s.getCourse().replace("|"," ")+"|"+s.getCgpa()+"|"+s.getSemester()+"\n");
        } catch (IOException e) { System.out.println("Student save error: " + e.getMessage()); }
    }
    static void saveExpenses(List<Expense> list) {
        new File(DIR).mkdirs();
        try (BufferedWriter w = new BufferedWriter(new FileWriter(DIR + "/expenses.txt"))) {
            for (Expense e : list) w.write(e.getId()+"|"+e.getCategory().replace("|"," ")+"|"+e.getAmount()+"|"+e.getDescription().replace("|"," ")+"\n");
        } catch (IOException e) { System.out.println("Expense save error: " + e.getMessage()); }
    }
    static void loadStudents(List<Student> list) {
        File f = new File(DIR + "/students.txt"); if (!f.exists()) return;
        try (BufferedReader r = new BufferedReader(new FileReader(f))) {
            String line; while ((line=r.readLine()) != null) {
                String[] p=line.split("\\|",-1); if(p.length==5) list.add(new Student(p[0],p[1],p[2],Double.parseDouble(p[3]),Integer.parseInt(p[4])));
            }
        } catch (IOException | NumberFormatException e) { System.out.println("Student load error: " + e.getMessage()); }
    }
    static void loadExpenses(List<Expense> list) {
        File f = new File(DIR + "/expenses.txt"); if (!f.exists()) return;
        try (BufferedReader r = new BufferedReader(new FileReader(f))) {
            String line; while ((line=r.readLine()) != null) {
                String[] p=line.split("\\|",-1); if(p.length==4) list.add(new Expense(Integer.parseInt(p[0]),p[1],Double.parseDouble(p[2]),p[3]));
            }
        } catch (IOException | NumberFormatException e) { System.out.println("Expense load error: " + e.getMessage()); }
    }
}
