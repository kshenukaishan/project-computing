package model;

public class RepairOrder {

    private int id;
    private String description;
    private String returnDate;
    private boolean completed;

    public RepairOrder(int id, String description, String returnDate, boolean completed) {
        this.id = id;
        this.description = description;
        this.returnDate = returnDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
