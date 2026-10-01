package com.adventurexp.model;

import java.time.LocalDateTime;

public class Activity {

    private int activityId;
    private String name;
    private int pricePerPerson;
    private int tagId;
    private boolean open;
    private LocalDateTime timePeriod;

    public Activity() {
    }

    public Activity(int activityId,
                    String name,
                    int pricePerPerson,
                    int tagId,
                    boolean open,
                    LocalDateTime timePeriod) {

        this.activityId = activityId;
        this.name = name;
        this.pricePerPerson = pricePerPerson;
        this.tagId = tagId;
        this.open = open;
        this.timePeriod = timePeriod;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(int pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public LocalDateTime getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(LocalDateTime timePeriod) {
        this.timePeriod = timePeriod;
    }
}

