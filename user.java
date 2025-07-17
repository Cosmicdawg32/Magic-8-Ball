// Author: Nicholas Bleeker
// Created: July 16, 2025
// Description: Magic 8 Ball User Info

public class user {
    private String name;

    public user() {
        this.name = "";
    }

    public boolean isNameSet() {
        if (name != null && ! name.isBlank()) {
            return true;
        }
        return false;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }
}