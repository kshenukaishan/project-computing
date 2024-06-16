package model;

public class PurchaseOrder {

    private int id;
    private String description;
    private String deadLine;
    private int delivered;

    public PurchaseOrder() {
    }

    public PurchaseOrder(int id, String description, String deadLine, int delivered) {
        this.id = id;
        this.description = description;
        this.deadLine = deadLine;
        this.delivered = delivered;
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

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public int isDelivered() {
        return delivered;
    }

    public void setDelivered(int delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", deadLine='" + deadLine + '\'' +
                ", delivered=" + delivered +
                '}';
    }
}
