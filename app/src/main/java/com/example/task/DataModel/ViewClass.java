package com.example.task.DataModel;

public class ViewClass {
    private String name;
    private String weekOff;

    public ViewClass(String name, String weekOff) {
        this.name = name;
        this.weekOff = weekOff;
    }

    public String getNameText() {
        return name;
    }

    public String getWeekOffText() {
        return weekOff;
    }


}
