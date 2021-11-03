package io.turntabl;

import io.turntabl.enums.Levels;

public abstract class Client {
    private int ID;
    private String name;
    private Levels serviceLevel;

    public Client(int ID, String name, Levels serviceLevel) {
        this.ID = ID;
        this.name = name;
        this.serviceLevel = serviceLevel;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Levels getServiceLevel() {
        return serviceLevel;
    }
    abstract String getContactName();
}
