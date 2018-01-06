package com.bizzybooks.bizzybooks;

/**
 * Created by Owner on 10/29/16.
 */

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universals {

    private Integer multiversalType = 0;
    private Integer balOneAfter = 0;
    private String balOneAfterString = "$0.00";
    private Integer balTwoAfter = 0;
    private String balTwoAfterString = "$0.00";
    private Integer projectStatusId = -1;
    private String projectStatusString = "";
    private String key;
    private Integer universalItemType;
    private String projectItemName;
    private String projectItemKey;
    private Integer odometerReading;
    private String whoName;
    private String whoKey;
    private Integer what;
    private String whomName;
    private String whomKey;
    private String taxReasonName;
    private Integer taxReasonId;
    private String vehicleName;
    private String vehicleKey;
    private String workersCompName;
    private Integer workersCompId;
    private String advertisingMeansName;
    private Integer advertisingMeansId;
    private String personalReasonName;
    private Integer personalReasonId;
    private Integer percentBusiness;
    private String accountOneName;
    private String accountOneKey;
    private Integer accountOneType;
    private String accountTwoName;
    private String accountTwoKey;
    private Integer accountTwoType;
    private Integer howMany;
    private String fuelTypeName;
    private Integer fuelTypeId;
    private Boolean useTax;
    private String notes;
    private String picUrl;
    private Integer picAspectRatio;
    private Integer picNumber;
    private String projectPicTypeName;
    private Integer projectPicTypeId;
    private Object timeStamp;
    private Double latitude;
    private Double longitude;
    private Boolean atmFee; // For future use
    private Integer feeAmount; // For future use
    private DatabaseReference ref;

    public Universals() {}

    public Universals(Integer multiversalType, Integer balOneAfter, String balOneAfterString, Integer balTwoAfter, String balTwoAfterString, Integer projectStatusId,
                      String projectStatusString, String key, Integer universalItemType, String projectItemName, String projectItemKey, Integer odometerReading,
                      String whoName, String whoKey, Integer what, String whomName, String whomKey, String taxReasonName, Integer taxReasonId, String vehicleName,
                      String vehicleKey, String workersCompName, Integer workersCompId, String advertisingMeansName, Integer advertisingMeansId, String personalReasonName,
                      Integer personalReasonId, Integer percentBusiness, String accountOneName, String accountOneKey, Integer accountOneType, String accountTwoName,
                      String accountTwoKey, Integer accountTwoType, Integer howMany, String fuelTypeName, Integer fuelTypeId, Boolean useTax, String notes, String picUrl,
                      Integer picAspectRatio, Integer picNumber, String projectPicTypeName, Integer projectPicTypeId, Object timeStamp, Double latitude, Double longitude,
                      Boolean atmFee, Integer feeAmount, DatabaseReference ref){
        this.multiversalType = multiversalType;
        this.balOneAfter = balOneAfter;
        this.balOneAfterString = balOneAfterString;
        this.balTwoAfter = balTwoAfter;
        this.balTwoAfterString = balTwoAfterString;
        this.projectStatusId = projectStatusId;
        this.projectStatusString = projectStatusString;
        this.key = key;
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

    public Universals(DataSnapshot snapshot) {
        key = snapshot.getKey();
        @SuppressWarnings({"unchecked"})
        Map<String, Object> map = snapshot.getValue(Map.class); // The reason we don't set multiversalType is it gets set automatically at top.
        universalItemType = map.get("universalItemType") != null ? (Integer)map.get("universalItemType") : 0; // We don't set balOneAfter or projStatus b/c
        projectItemName = map.get("projectItemName") != null ? (String)map.get("projectItemName") : ""; // they get set at runtime as they are ever changing
        projectItemKey = map.get("projectItemKey") != null ? (String)map.get("projectItemKey") : ""; // as project updates or users update already entered items.
        odometerReading = map.get("odometerReading") != null ? (Integer)map.get("odometerReading") : 0;
        whoName = map.get("whoName") != null ? (String)map.get("whoName") : "";
        whoKey = map.get("whoKey") != null ? (String)map.get("whoKey") : "";
        what = map.get("what") != null ? (Integer)map.get("what") : 0;
        whomName = map.get("whomName") != null ? (String)map.get("whomName") : "";
        whomKey = map.get("whomKey") != null ? (String)map.get("whomKey") : "";
        taxReasonName = map.get("taxReasonName") != null ? (String)map.get("taxReasonName") : "";
        taxReasonId = map.get("taxReasonId") != null ? (Integer)map.get("taxReasonId") : 0;
        vehicleName = map.get("vehicleName") != null ? (String)map.get("vehicleName") : "";
        vehicleKey = map.get("vehicleKey") != null ? (String)map.get("vehicleKey") : "";
        workersCompName = map.get("workersCompName") != null ? (String)map.get("workersCompName") : "";
        workersCompId = map.get("workersCompeId") != null ? (Integer)map.get("workersCompId") : 0;
        advertisingMeansName = map.get("advertisingMeansName") != null ? (String)map.get("advertisingMeansName") : "";
        advertisingMeansId = map.get("advertisingMeansId") != null ? (Integer)map.get("advertisingMeansId") : 0;
        personalReasonName = map.get("personalReasonName") != null ? (String)map.get("personalReasonName") : "";
        personalReasonId = map.get("personalReasonId") != null ? (Integer)map.get("personalReasonId") : 0;
        percentBusiness = map.get("percentBusiness") != null ? (Integer)map.get("percentBusiness") : 0;
        accountOneName = map.get("accountOneName") != null ? (String)map.get("accountOneName") : "";
        accountOneKey = map.get("accountOneKey") != null ? (String)map.get("accountOneKey") : "";
        accountOneType = map.get("accountOneType") != null ? (Integer)map.get("accountOneType") : 0;
        accountTwoName = map.get("accountTwoName") != null ? (String)map.get("accountTwoName") : "";
        accountTwoKey = map.get("accountTwoKey") != null ? (String)map.get("accountTwoKey") : "";
        accountTwoType = map.get("accountTwoType") != null ? (Integer)map.get("accountTwoType") : 0;
        howMany = map.get("howMany") != null ? (Integer)map.get("howMany") : 0;
        fuelTypeName = map.get("fuelTypeName") != null ? (String)map.get("fuelTypeName") : "";
        fuelTypeId = map.get("fuelTypeId") != null ? (Integer)map.get("fuelTypeId") : 0;
        useTax = map.get("useTax") != null ? (Boolean)map.get("useTax") : false;
        notes = map.get("notes") != null ? (String)map.get("notes") : "";
        picUrl = map.get("picUrl") != null ? (String)map.get("picUrl") : "";
        picAspectRatio = map.get("picAspectRatio") != null ? (Integer)map.get("picAspectRatio") : 1;
        picNumber = map.get("picNumber") != null ? (Integer)map.get("picNumber") : 0; //Only AddUniversal uses this, but not as a check (picUrl != "" is used instead)
        //But, it is still important because AddUniversal uses it in editing an item if user replaces image, ALSO for creating name for url Path
        projectPicTypeName = map.get("projectPicTypeName") != null ? (String)map.get("projectPicTypeName") : "";
        projectPicTypeId = map.get("projectPicTypeId") != null ? (Integer)map.get("projectPicTypeId") : 0;
        timeStamp = map.get("timeStamp") != null ? (Integer)map.get("timeStamp") : 0; // WILL THIS WORK FOR ANY IE OBJECT???
        latitude = map.get("latitude") != null ? (Double)map.get("latitude") : 0.0;
        longitude = map.get("longitude") != null ? (Double)map.get("longitude") : 0.0;
        atmFee = map.get("atmFee") != null ? (Boolean)map.get("atmFee") : false;
        feeAmount = map.get("feeAmount") != null ? (Integer)map.get("feeAmount") : 0;
        ref = snapshot.getRef();
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

    //public Integer getTheMultiversalType() {
        //return multiversalType;
    //}

}
