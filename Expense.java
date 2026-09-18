package studentmanagement;
public class Expense {
    private static int nextId = 1;
    private int id; private String category, description; private double amount;
    public Expense(String category, double amount, String description) {
        this.id = nextId++; this.category = category; this.amount = amount; this.description = description;
    }
    public Expense(int id, String category, double amount, String description) {
        this.id = id; this.category = category; this.amount = amount; this.description = description;
        if (id >= nextId) nextId = id + 1;
    }
    public int getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public String toString() { return "ID: " + id + " | " + category + " | Rs." + String.format("%.2f", amount) + " | " + description; }
}
