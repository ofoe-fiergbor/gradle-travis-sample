package io.turntabl;

import io.turntabl.enums.Levels;

public class Private extends Client{
    public Private(int ID, String name, Levels serviceLevels) {
        super(ID, name, serviceLevels);
    }

    @Override
    public String getContactName() {
        return super.getName();
    }
}
