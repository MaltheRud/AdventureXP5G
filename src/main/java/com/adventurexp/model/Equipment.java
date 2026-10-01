package com.adventurexp.model;


public class Equipment {

    private int equipmentId;
    private Activity activity;
    private String equipmentName;
    private boolean equipmentStatus;
    private int numberOfGivenEquipment;

    public Equipment() {
    }

    public Equipment(int equipmentId,
                     Activity activity,
                     String equipmentName,
                     boolean equipmentStatus,
                     int numberOfGivenEquipment) {

        this.equipmentId = equipmentId;
        this.activity = activity;
        this.equipmentName = equipmentName;
        this.equipmentStatus = equipmentStatus;
        this.numberOfGivenEquipment = numberOfGivenEquipment;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public boolean isEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(boolean equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public int getNumberOfGivenEquipment() {
        return numberOfGivenEquipment;
    }

    public void setNumberOfGivenEquipment(int numberOfGivenEquipment) {
        this.numberOfGivenEquipment = numberOfGivenEquipment;
    }
}