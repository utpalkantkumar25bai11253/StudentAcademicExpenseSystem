package studentmanagement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();
    public List<Student> getStudents() { return students; }
    public void addStudent(Student s) throws ValidationException {
        if (s.getId().isEmpty() || s.getName().isEmpty()) throw new ValidationException("ID and name cannot be empty.");
        if (s.getCgpa() < 0 || s.getCgpa() > 10) throw new ValidationException("CGPA must be 0 to 10.");
        if (s.getSemester() < 1) throw new ValidationException("Semester must be positive.");
        if (searchStudent(s.getId()) != null) throw new ValidationException("Student ID already exists.");
        students.add(s);
    }
    public Student searchStudent(String id) {
        for (Student s : students) if (s.getId().equalsIgnoreCase(id)) return s;
        return null;
    }
    public boolean updateStudent(String id, String name, String course, double cgpa, int sem) throws ValidationException {
        Student s = searchStudent(id); if (s == null) return false;
        if (name.isEmpty() || course.isEmpty()) throw new ValidationException("Name/course cannot be empty.");
        if (cgpa < 0 || cgpa > 10) throw new ValidationException("CGPA must be 0 to 10.");
        if (sem < 1) throw new ValidationException("Semester must be positive.");
        s.setName(name); s.setCourse(course); s.setCgpa(cgpa); s.setSemester(sem); return true;
    }
    public boolean deleteStudent(String id) { Student s = searchStudent(id); return s != null && students.remove(s); }
    public void viewStudents() {
        if (students.isEmpty()) { System.out.println("No students available."); return; }
        for (Student s : students) s.displayInfo();
    }
}
