package com.example.cleando.client;

public class JobModel {
    private String title, room, price, flooring, bathroom, uri;

    public JobModel() {
    }

    public JobModel(String title, String room, String price, String flooring, String bathroom, String uri) {
        this.title = title;
        this.room = room;
        this.price = price;
        this.flooring = flooring;
        this.bathroom = bathroom;
        this.uri = uri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFlooring() {
        return flooring;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
