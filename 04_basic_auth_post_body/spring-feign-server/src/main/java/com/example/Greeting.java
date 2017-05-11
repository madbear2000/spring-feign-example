package com.example;

public class Greeting {
    
    private String text;
    
    private String updateBy;

    public Greeting() {
        // Needed by Jackson 
    }

    public Greeting(String text, String updateBy) {
        this.text = text;
        this.updateBy = updateBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}