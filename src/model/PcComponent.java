package model;

import type.ComputerType;

import java.util.Date;

public class PcComponent extends Computer{

    public PcComponent(int id, ComputerType type, String brand, String entryDate) {
        super(id, type, brand, entryDate);
    }
}
