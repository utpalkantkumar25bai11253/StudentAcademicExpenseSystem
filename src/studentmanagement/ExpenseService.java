package studentmanagement;
import java.util.*;

public class ExpenseService {
    private final List<Expense> expenses = new ArrayList<>();
    public List<Expense> getExpenses() { return expenses; }
    public void addExpense(Expense e) throws ValidationException {
        if (e.getCategory().isEmpty()) throw new ValidationException("Category cannot be empty.");
        if (e.getAmount() <= 0) throw new ValidationException("Amount must be greater than zero.");
        expenses.add(e);
    }
    public boolean deleteExpense(int id) { return expenses.removeIf(e -> e.getId() == id); }
    public void viewExpenses() {
        if (expenses.isEmpty()) { System.out.println("No expenses available."); return; }
        for (Expense e : expenses) System.out.println(e);
    }
    public void categorySummary() {
        Map<String, Double> m = new HashMap<>();
        for (Expense e : expenses) m.merge(e.getCategory(), e.getAmount(), Double::sum);
        if (m.isEmpty()) { System.out.println("No expenses available."); return; }
        for (Map.Entry<String, Double> x : m.entrySet()) System.out.printf("%s : Rs.%.2f%n", x.getKey(), x.getValue());
    }
}
