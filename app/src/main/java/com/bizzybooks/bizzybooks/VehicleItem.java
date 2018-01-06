package com.bizzybooks.bizzybooks;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 1/6/18.
 */

public class VehicleItem implements MultiversalItem {
    public String key;
    public String year;
    public String make;
    public String model;
    public String color;
    public Long fuelId;
    public String fuelString;
    public String placedInCommissionDate;
    public String licensePlateNumber;
    public String vehicleIdentificationNumber;
    public Object timeStamp;
    public DatabaseReference ref;

    public VehicleItem() {
    }

    public VehicleItem(Long type, String year, String make, String model, String color, Long fuelId, String fuelString, String placedInCommissionDate,
                       String licensePlateNumber, String vehicleIdentificationNumber, Object timeStamp){
        this.key = "";
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuelId = fuelId;
        this.fuelString = fuelString;
        this.placedInCommissionDate = placedInCommissionDate;
        this.licensePlateNumber = licensePlateNumber;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.timeStamp = timeStamp;
        this.ref = null;
    }

    public VehicleItem(DataSnapshot snapshot){
        key = snapshot.getKey();
        @SuppressWarnings({"unchecked"})
        Map<String, Object> map = (Map<String, Object>) snapshot.getValue(); // The reason we don't set multiversalType is it gets set automatically at top
        year = map.get("year") != null ? (String) map.get("year") : "";
        make = map.get("make") != null ? (String) map.get("make") : "";
        model = map.get("model") != null ? (String) map.get("model") : "";
        color = map.get("color") != null ? (String) map.get("color") : "";
        fuelId = map.get("fuelId") != null ? (Long) map.get("fuelId") : 0L;
        fuelString = map.get("fuelString") != null ? (String) map.get("fuelString") : "";
        placedInCommissionDate = map.get("placedInCommissionDate") != null ? (String) map.get("placedInCommissionDate") : "";
        licensePlateNumber = map.get("licensePlateNumber") != null ? (String) map.get("licensePlateNumber") : "";
        vehicleIdentificationNumber = map.get("vehicleIdentificationNumber") != null ? (String) map.get("vehicleIdentificationNumber") : "";
        timeStamp = map.get("timeStamp") != null ? (Long) map.get("timeStamp") : 0L; // WILL THIS WORK FOR ANY IE OBJECT???
        ref = snapshot.getRef(); //Why is this line needed?!??
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("year", year);
        map.put("make", make);
        map.put("model", model);
        map.put("color", color);
        map.put("fuelId", fuelId);
        map.put("fuelString", fuelString);
        map.put("placedInCommissionDate", placedInCommissionDate);
        map.put("licensePlateNumber", licensePlateNumber);
        map.put("vehicleIdentificationNumber", vehicleIdentificationNumber);
        map.put("timeStamp", timeStamp);
        return map;
    }

    @Override
    public void setMultiversalType(Long multiversalType) {
        multiversalType = 4L;
    }

    @Override
    public Long getMultiversalType() {
        return 4L;
    }
}
