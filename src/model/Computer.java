package model;

import type.ComputerType;

import java.util.Date;

public class Computer {

    private int id;
    private ComputerType type;
    private String brand;
    private String entryDate;

    public Computer(int id, ComputerType type, String brand, String entryDate) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.entryDate = entryDate;
    }

    public Computer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ComputerType getType() {
        return type;
    }

    public void setType(ComputerType type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                ", entryDate=" + entryDate +
                '}';
    }
}
