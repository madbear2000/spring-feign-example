package com.example;

public class Message {
    private String text;

    private String updateBy;

    public Message() {
    }

    public Message(String text, String updateBy) {
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

    @Override
    public String toString() {
        return "Message [text=" + text + ", updateBy=" + updateBy + "]";
    }

}
