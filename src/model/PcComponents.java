package model;

import type.ComputerType;

import java.util.Date;

public class PcComponents extends Computer{

    public PcComponents(int id, ComputerType type, String brand, Date entryDate) {
        super(id, type, brand, entryDate);
    }
}
