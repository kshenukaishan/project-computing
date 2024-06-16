package model;

public class Payment {

    private int id;
    private double amount;
    private boolean completed;

    public Payment(int id, double amount, boolean completed) {
        this.id = id;
        this.amount = amount;
        this.completed = completed;
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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
