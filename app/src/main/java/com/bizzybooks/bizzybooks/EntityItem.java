package com.bizzybooks.bizzybooks;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 1/6/18.
 */

public class EntityItem implements MultiversalItem {

    public String key;
    public Long type;
    public String name;
    public String phoneNumber;
    public String email;
    public String street;
    public String city;
    public String state;
    public String ssn;
    public String ein;
    public Object timeStamp;
    public DatabaseReference ref;

    public EntityItem() {
    }

    public EntityItem(Long type, String name, String phoneNumber, String email, String street, String city, String state, String ssn, String ein,
                      Object timeStamp){
        this.key = "";
        this.type = type;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.ssn = ssn;
        this.ein = ein;
        this.timeStamp = timeStamp;
        this.ref = null;
    }

    public EntityItem(DataSnapshot snapshot){
        key = snapshot.getKey();
        @SuppressWarnings({"unchecked"})
        Map<String, Object> map = (Map<String, Object>) snapshot.getValue(); // The reason we don't set multiversalType is it gets set automatically at top
        type = map.get("type") != null ? (Long) map.get("type") : 0L;
        name = map.get("name") != null ? (String) map.get("name") : "";
        phoneNumber = map.get("phoneNumber") != null ? (String) map.get("phoneNumber") : "";
        email = map.get("email") != null ? (String) map.get("email") : "";
        street = map.get("street") != null ? (String) map.get("street") : "";
        city = map.get("city") != null ? (String) map.get("city") : "";
        state = map.get("state") != null ? (String) map.get("state") : "";
        ssn = map.get("ssn") != null ? (String) map.get("ssn") : "";
        ein = map.get("ein") != null ? (String) map.get("ein") : "";
        timeStamp = map.get("timeStamp") != null ? (Long) map.get("timeStamp") : 0L; // WILL THIS WORK FOR ANY IE OBJECT???
        ref = snapshot.getRef(); //Why is this line needed?!??
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("type", type);
        map.put("name", name);
        map.put("phoneNumber", phoneNumber);
        map.put("email", email);
        map.put("street", street);
        map.put("city", city);
        map.put("state", state);
        map.put("ssn", ssn);
        map.put("ein", ein);
        map.put("timeStamp", timeStamp);
        return map;
    }

    @Override
    public void setMultiversalType(Long multiversalType) {
        multiversalType = 2L;
    }

    @Override
    public Long getMultiversalType() {
        return 2L;
    }
}
