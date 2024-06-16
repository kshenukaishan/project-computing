package model;

import type.ComputerType;

import java.util.Date;

public class Laptop extends Computer{

    public Laptop(int id, ComputerType type, String brand, Date entryDate) {
        super(id, type, brand, entryDate);
    }


}
