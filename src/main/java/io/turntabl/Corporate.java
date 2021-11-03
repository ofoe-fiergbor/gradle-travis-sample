package io.turntabl;

import io.turntabl.enums.Levels;

public class Corporate extends Client{
    private String accountManager;

    public Corporate(int ID, String name, Levels serviceLevel, String accountManager) {
        super(ID, name, serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getContactName() {
        return accountManager;
    }
}
