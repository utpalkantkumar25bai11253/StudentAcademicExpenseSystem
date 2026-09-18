package studentmanagement;
public class Student extends Person {
    private String course;
    private double cgpa;
    private int semester;
    public Student(String id, String name, String course, double cgpa, int semester) {
        super(id, name); this.course = course; this.cgpa = cgpa; this.semester = semester;
    }
    public String getCourse() { return course; }
    public double getCgpa() { return cgpa; }
    public int getSemester() { return semester; }
    public void setCourse(String c) { course = c; }
    public void setCgpa(double c) { cgpa = c; }
    public void setSemester(int s) { semester = s; }
    public void displayInfo() { System.out.println(this); }
    public String toString() { return "ID: " + getId() + " | Name: " + getName() + " | Course: " + course + " | CGPA: " + cgpa + " | Semester: " + semester; }
}
