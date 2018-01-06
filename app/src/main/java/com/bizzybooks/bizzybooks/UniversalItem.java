package com.bizzybooks.bizzybooks;

/**
 * Created by Owner on 10/29/16.
 */

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class UniversalItem implements MultiversalItem {

    public Long balOneAfter = 0L;
    public String balOneAfterString = "$0.00";
    public Long balTwoAfter = 0L;
    public String balTwoAfterString = "$0.00";
    public Long projectStatusId = -1L;
    public String projectStatusString = "";
    public String key;
    public Long universalItemType;
    public String projectItemName;
    public String projectItemKey;
    public Long odometerReading;
    public String whoName;
    public String whoKey;
    public Long what;
    public String whomName;
    public String whomKey;
    public String taxReasonName;
    public Long taxReasonId;
    public String vehicleName;
    public String vehicleKey;
    public String workersCompName;
    public Long workersCompId;
    public String advertisingMeansName;
    public Long advertisingMeansId;
    public String personalReasonName;
    public Long personalReasonId;
    public Long percentBusiness;
    public String accountOneName;
    public String accountOneKey;
    public Long accountOneType;
    public String accountTwoName;
    public String accountTwoKey;
    public Long accountTwoType;
    public Long howMany;
    public String fuelTypeName;
    public Long fuelTypeId;
    public Boolean useTax;
    public String notes;
    public String picUrl;
    public Long picAspectRatio;
    public Long picNumber;
    public String projectPicTypeName;
    public Long projectPicTypeId;
    public Object timeStamp;
    public Double latitude;
    public Double longitude;
    public Boolean atmFee; // For future use
    public Long feeAmount; // For future use
    public DatabaseReference ref;

    public UniversalItem() {}

    public UniversalItem(Long balOneAfter, String balOneAfterString, Long balTwoAfter, String balTwoAfterString, Long projectStatusId,
                      String projectStatusString, Long universalItemType, String projectItemName, String projectItemKey, Long odometerReading,
                      String whoName, String whoKey, Long what, String whomName, String whomKey, String taxReasonName, Long taxReasonId, String vehicleName,
                      String vehicleKey, String workersCompName, Long workersCompId, String advertisingMeansName, Long advertisingMeansId, String personalReasonName,
                      Long personalReasonId, Long percentBusiness, String accountOneName, String accountOneKey, Long accountOneType, String accountTwoName,
                      String accountTwoKey, Long accountTwoType, Long howMany, String fuelTypeName, Long fuelTypeId, Boolean useTax, String notes, String picUrl,
                      Long picAspectRatio, Long picNumber, String projectPicTypeName, Long projectPicTypeId, Object timeStamp, Double latitude, Double longitude,
                      Boolean atmFee, Long feeAmount, DatabaseReference ref){
        this.balOneAfter = balOneAfter;
        this.balOneAfterString = balOneAfterString;
        this.balTwoAfter = balTwoAfter;
        this.balTwoAfterString = balTwoAfterString;
        this.projectStatusId = projectStatusId;
        this.projectStatusString = projectStatusString;
        this.key = "";
        this.universalItemType = universalItemType;
        this.projectItemName = projectItemName;
        this.projectItemKey = projectItemKey;
        this.odometerReading = odometerReading;
        this.whoName = whoName;
        this.whoKey = whoKey;
        this.what = what;
        this.whomName = whomName;
        this.whomKey = whomKey;
        this.taxReasonName = taxReasonName;
        this.taxReasonId = taxReasonId;
        this.vehicleName = vehicleName;
        this.vehicleKey = vehicleKey;
        this.workersCompName = workersCompName;
        this.workersCompId = workersCompId;
        this.advertisingMeansName = advertisingMeansName;
        this.advertisingMeansId = advertisingMeansId;
        this.personalReasonName = personalReasonName;
        this.personalReasonId = personalReasonId;
        this.percentBusiness = percentBusiness;
        this.accountOneName = accountOneName;
        this.accountOneKey = accountOneKey;
        this.accountOneType = accountOneType;
        this.accountTwoName = accountTwoName;
        this.accountTwoKey = accountTwoKey;
        this.accountTwoType = accountTwoType;
        this.howMany = howMany;
        this.fuelTypeName = fuelTypeName;
        this.fuelTypeId = fuelTypeId;
        this.useTax = useTax;
        this.notes = notes;
        this.picUrl = picUrl;
        this.picAspectRatio = picAspectRatio;
        this.picNumber = picNumber;
        this.projectPicTypeName = projectPicTypeName;
        this.projectPicTypeId = projectPicTypeId;
        this.timeStamp = timeStamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.atmFee = atmFee;
        this.feeAmount = feeAmount;
        this.ref = null;
    }

    public UniversalItem(DataSnapshot snapshot) {
        key = snapshot.getKey();
        @SuppressWarnings({"unchecked"})
        Map<String, Object> map = (Map<String, Object>)snapshot.getValue(); // The reason we don't set multiversalType is it gets set automatically at top
        universalItemType = map.get("universalItemType") != null ? (Long)map.get("universalItemType") : 0L; // We don't set balOneAfter or projStatus b/c
        projectItemName = map.get("projectItemName") != null ? (String)map.get("projectItemName") : ""; // they get set at runtime as they are ever changing
        projectItemKey = map.get("projectItemKey") != null ? (String)map.get("projectItemKey") : ""; // as project updates or users update already entered items.
        odometerReading = map.get("odometerReading") != null ? (Long)map.get("odometerReading") : 0L;
        whoName = map.get("whoName") != null ? (String)map.get("whoName") : "";
        whoKey = map.get("whoKey") != null ? (String)map.get("whoKey") : "";
        what = map.get("what") != null ? (Long)map.get("what") : 0L;
        whomName = map.get("whomName") != null ? (String)map.get("whomName") : "";
        whomKey = map.get("whomKey") != null ? (String)map.get("whomKey") : "";
        taxReasonName = map.get("taxReasonName") != null ? (String)map.get("taxReasonName") : "";
        taxReasonId = map.get("taxReasonId") != null ? (Long)map.get("taxReasonId") : 0L;
        vehicleName = map.get("vehicleName") != null ? (String)map.get("vehicleName") : "";
        vehicleKey = map.get("vehicleKey") != null ? (String)map.get("vehicleKey") : "";
        workersCompName = map.get("workersCompName") != null ? (String)map.get("workersCompName") : "";
        workersCompId = map.get("workersCompeId") != null ? (Long)map.get("workersCompId") : 0L;
        advertisingMeansName = map.get("advertisingMeansName") != null ? (String)map.get("advertisingMeansName") : "";
        advertisingMeansId = map.get("advertisingMeansId") != null ? (Long)map.get("advertisingMeansId") : 0L;
        personalReasonName = map.get("personalReasonName") != null ? (String)map.get("personalReasonName") : "";
        personalReasonId = map.get("personalReasonId") != null ? (Long)map.get("personalReasonId") : 0L;
        percentBusiness = map.get("percentBusiness") != null ? (Long)map.get("percentBusiness") : 0L;
        accountOneName = map.get("accountOneName") != null ? (String)map.get("accountOneName") : "";
        accountOneKey = map.get("accountOneKey") != null ? (String)map.get("accountOneKey") : "";
        accountOneType = map.get("accountOneType") != null ? (Long)map.get("accountOneType") : 0L;
        accountTwoName = map.get("accountTwoName") != null ? (String)map.get("accountTwoName") : "";
        accountTwoKey = map.get("accountTwoKey") != null ? (String)map.get("accountTwoKey") : "";
        accountTwoType = map.get("accountTwoType") != null ? (Long)map.get("accountTwoType") : 0L;
        howMany = map.get("howMany") != null ? (Long)map.get("howMany") : 0L;
        fuelTypeName = map.get("fuelTypeName") != null ? (String)map.get("fuelTypeName") : "";
        fuelTypeId = map.get("fuelTypeId") != null ? (Long)map.get("fuelTypeId") : 0L;
        useTax = map.get("useTax") != null ? (Boolean)map.get("useTax") : false;
        notes = map.get("notes") != null ? (String)map.get("notes") : "";
        picUrl = map.get("picUrl") != null ? (String)map.get("picUrl") : "";
        picAspectRatio = map.get("picAspectRatio") != null ? (Long)map.get("picAspectRatio") : 1;
        picNumber = map.get("picNumber") != null ? (Long)map.get("picNumber") : 0L; //Only AddUniversal uses this, but not as a check (picUrl != "" is used instead)
        //But, it is still important because AddUniversal uses it in editing an item if user replaces image, ALSO for creating name for url Path
        projectPicTypeName = map.get("projectPicTypeName") != null ? (String)map.get("projectPicTypeName") : "";
        projectPicTypeId = map.get("projectPicTypeId") != null ? (Long)map.get("projectPicTypeId") : 0L;
        timeStamp = map.get("timeStamp") != null ? (Long)map.get("timeStamp") : 0L; // WILL THIS WORK FOR ANY IE OBJECT???
        latitude = map.get("latitude") != null ? (Double)map.get("latitude") : 0.0;
        longitude = map.get("longitude") != null ? (Double)map.get("longitude") : 0.0;
        atmFee = map.get("atmFee") != null ? (Boolean)map.get("atmFee") : false;
        feeAmount = map.get("feeAmount") != null ? (Long)map.get("feeAmount") : 0L;
        ref = snapshot.getRef(); //Why is this line needed?!??
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("universalItemType", universalItemType); // Key is autogenerated in AddUniversal or wherever
        map.put("projectItemName", projectItemName);
        map.put("projectItemKey", projectItemKey);
        map.put("odometerReading", odometerReading);
        map.put("whoName", whoName);
        map.put("whoKey", whoKey);
        map.put("what", what);
        map.put("whomName", whomName);
        map.put("whomKey", whomKey);
        map.put("taxReasonName", taxReasonName);
        map.put("taxReasonId", taxReasonId);
        map.put("vehicleName", vehicleName);
        map.put("vehicleKey", vehicleKey);
        map.put("workersCompName", workersCompName);
        map.put("workersCompId", workersCompId);
        map.put("advertisingMeansName", advertisingMeansName);
        map.put("advertisingMeansId", advertisingMeansId);
        map.put("personalReasonName", personalReasonName);
        map.put("personalReasonId", personalReasonId);
        map.put("accountOneName", accountOneName);
        map.put("accountOneKey", accountOneKey);
        map.put("accountOneType", accountOneType);
        map.put("accountTwoName", accountTwoName);
        map.put("accountTwoKey", accountTwoKey);
        map.put("accountTwoType", accountTwoType);
        map.put("howMany", howMany);
        map.put("fuelTypeName", fuelTypeName);
        map.put("fuelTypeId", fuelTypeId);
        map.put("useTax", useTax);
        map.put("notes", notes);
        map.put("picUrl", picUrl);
        map.put("picAspectRatio", picAspectRatio);
        map.put("picNumber", picNumber);
        map.put("projectPicTypeName", projectPicTypeName);
        map.put("projectPicTypeId", projectPicTypeId);
        map.put("timeStamp", timeStamp);
        map.put("latitude", latitude);
        map.put("longitude", longitude);
        map.put("atmFee", atmFee);
        map.put("feeAmount", feeAmount);
        return map;
    }

    @Override
    public void setMultiversalType(Long multiversalType) {
        multiversalType = 0L;
    }

    @Override
    public Long getMultiversalType() {
        return 0L;
    }

    //public Long getTheMultiversalType() {
        //return multiversalType;
    //}

}
