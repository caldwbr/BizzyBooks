package com.bizzybooks.bizzybooks;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 1/6/18.
 */

public class ProjectItem implements MultiversalItem {

    public String key;
    public String name;
    public String customerName;
    public String customerKey;
    public String howDidTheyHearOfYouString;
    public Long howDidTheyHearOfYouId;
    public String projectTags;
    public String projectAddressStreet;
    public String projectAddressCity;
    public String projectAddressState;
    public String projectNotes;
    public String projectStatusName;
    public Long projectStatusId; // 0 - Job lead, 1 - Bid, 2 - Contract, 3 - Paid, 4 - Lost, 5 - Other
    public Object timeStamp;
    public DatabaseReference ref;

    public ProjectItem() {
    }

    public ProjectItem(String name, String customerName, String customerKey, String howDidTheyHearOfYouString, Long howDidTheyHearOfYouId,
                       String projectTags, String projectAddressStreet, String projectAddressCity, String projectAddressState, String projectNotes, String projectStatusName,
                       Long projectStatusId, Object timeStamp, DatabaseReference ref) {
        this.key = "";
        this.name = name;
        this.customerName = customerName;
        this.customerKey = customerKey;
        this.howDidTheyHearOfYouString = howDidTheyHearOfYouString;
        this.howDidTheyHearOfYouId = howDidTheyHearOfYouId;
        this.projectTags = projectTags;
        this.projectAddressStreet = projectAddressStreet;
        this.projectAddressCity = projectAddressCity;
        this.projectAddressState = projectAddressState;
        this.projectNotes = projectNotes;
        this.projectStatusName = projectStatusName;
        this.projectStatusId = projectStatusId;
        this.timeStamp = timeStamp;
        this.ref = null;
    }

    public ProjectItem(DataSnapshot snapshot) {
        key = snapshot.getKey();
        @SuppressWarnings({"unchecked"})
        Map<String, Object> map = (Map<String, Object>) snapshot.getValue(); // The reason we don't set multiversalType is it gets set automatically at top
        name = map.get("name") != null ? (String) map.get("name") : "";
        customerName = map.get("customerName") != null ? (String) map.get("customerName") : "";
        customerKey = map.get("customerKey") != null ? (String) map.get("customerKey") : "";
        howDidTheyHearOfYouString = map.get("howDidTheyHearOfYouString") != null ? (String) map.get("howDidTheyHearOfYouString") : "";
        howDidTheyHearOfYouId = map.get("howDidTheyHearOfYouId") != null ? (Long) map.get("howDidTheyHearOfYouId") : 0L;
        projectTags = map.get("projectTags") != null ? (String) map.get("projectTags") : "";
        projectAddressStreet = map.get("projectAddressStreet") != null ? (String) map.get("projectAddressStreet") : "";
        projectAddressCity = map.get("projectAddressCity") != null ? (String) map.get("projectAddressCity") : "";
        projectAddressState = map.get("projectAddressState") != null ? (String) map.get("projectAddressState") : "";
        projectNotes = map.get("projectNotes") != null ? (String) map.get("projectNotes") : "";
        projectStatusName = map.get("projectStatusName") != null ? (String) map.get("projectStatusName") : "";
        projectStatusId = map.get("projectStatusId") != null ? (Long) map.get("projectStatusId") : 0L;
        timeStamp = map.get("timeStamp") != null ? (Long) map.get("timeStamp") : 0L; // WILL THIS WORK FOR ANY IE OBJECT???
        ref = snapshot.getRef(); //Why is this line needed?!??
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("customerName", customerName);
        map.put("customerKey", customerKey);
        map.put("howDidTheyHearOfYouString", howDidTheyHearOfYouString);
        map.put("howDidTheyHearOfYouId", howDidTheyHearOfYouId);
        map.put("projectTags", projectTags);
        map.put("projectAddressStreet", projectAddressStreet);
        map.put("projectAddressCity", projectAddressCity);
        map.put("projectAddressState", projectAddressState);
        map.put("projectNotes", projectNotes);
        map.put("projectStatusName", projectStatusName);
        map.put("projectStatusId", projectStatusId);
        map.put("timeStamp", timeStamp);
        return map;
    }

    @Override
    public void setMultiversalType(Long multiversalType) {
        multiversalType = 1L;
    }

    @Override
    public Long getMultiversalType() {
        return 1L;
    }

}
