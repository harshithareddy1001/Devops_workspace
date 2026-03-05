package com.example.model;

public class Device {
    String name;
    String type;
    public Device(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }
    public Device() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Device [name=" + name + ", type=" + type + "]";
    }
}
