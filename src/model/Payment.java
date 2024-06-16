package model;

public class Payment {

    private int id;
    private String description;
    private double amount;
    private int completed;

    public Payment(int id, String description, double amount, int completed) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.completed = completed;
    }

    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int isCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", completed=" + completed +
                '}';
    }
}
