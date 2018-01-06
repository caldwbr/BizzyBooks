package com.bizzybooks.bizzybooks;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 1/6/18.
 */

public class AccountItem implements MultiversalItem {

    public String key;
    public String name;
    public Long accountTypeId;
    public String phoneNumber;
    public String email;
    public String street;
    public String city;
    public String state;
    public Long startingBal;
    public Boolean creditDetailsAvailable;
    public Boolean isLoan;
    public Long loanType;
    public Long loanTypeSubcategory;
    public Double loanPercentOne;
    public Double loanPercentTwo;
    public Double loanPercentThree;
    public Double loanPercentFour;
    public Long loanIntFactorOne;
    public Long loanIntFactorTwo;
    public Long loanIntFactorThree;
    public Long loanIntFactorFour;
    public Long maxLimit;
    public Long maxCashAdvanceAllowance;
    public Long closeDay;
    public Long dueDay;
    public Long cycle;
    public Long minimumPaymentRequired;
    public Long lateFeeAsOneTimeInt;
    public Double lateFeeAsPercentageOfTotalBalance;
    public Long cycleDues;
    public Long duesCycle;
    public Long minimumPaymentToBeSmart;
    public Double interestRate;
    public Long interestKind;
    public Object timeStamp;
    public DatabaseReference ref;

    public AccountItem() {
    }

    public AccountItem(String name, Long accountTypeId, String phoneNumber, String email, String street, String city, String state, Long startingBal, Boolean creditDetailsAvailable,
                      Boolean isLoan, Long loanType, Long loanTypeSubcategory, Double loanPercentOne, Double loanPercentTwo, Double loanPercentThree, Double loanPercentFour,
                      Long loanIntFactorOne, Long loanIntFactorTwo, Long loanIntFactorThree, Long loanIntFactorFour, Long maxLimit, Long maxCashAdvanceAllowance,
                      Long closeDay, Long dueDay, Long cycle, Long minimumPaymentRequired, Long lateFeeAsOneTimeInt, Double lateFeeAsPercentageOfTotalBalance,
                      Long cycleDues, Long duesCycle, Long minimumPaymentToBeSmart, Double interestRate, Long interestKind, Object timeStamp){
        this.key = "";
        this.name = name;
        this.accountTypeId = accountTypeId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.startingBal = startingBal;
        this.creditDetailsAvailable = creditDetailsAvailable;
        this.isLoan = isLoan;
        this.loanType = loanType;
        this.loanTypeSubcategory = loanTypeSubcategory;
        this.loanPercentOne = loanPercentOne;
        this.loanPercentTwo = loanPercentTwo;
        this.loanPercentThree = loanPercentThree;
        this.loanPercentFour = loanPercentFour;
        this.loanIntFactorOne = loanIntFactorOne;
        this.loanIntFactorTwo = loanIntFactorTwo;
        this.loanIntFactorThree = loanIntFactorThree;
        this.loanIntFactorFour = loanIntFactorFour;
        this.maxLimit = maxLimit;
        this.maxCashAdvanceAllowance = maxCashAdvanceAllowance;
        this.closeDay = closeDay;
        this.dueDay = dueDay;
        this.cycle = cycle;
        this.minimumPaymentRequired = minimumPaymentRequired;
        this.lateFeeAsOneTimeInt = lateFeeAsOneTimeInt;
        this.lateFeeAsPercentageOfTotalBalance = lateFeeAsPercentageOfTotalBalance;
        this.cycleDues = cycleDues;
        this.duesCycle = duesCycle;
        this.minimumPaymentToBeSmart = minimumPaymentToBeSmart;
        this.interestRate = interestRate;
        this.interestKind = interestKind;
        this.timeStamp = timeStamp;
        this.ref = null;
    }

    public AccountItem(DataSnapshot snapshot){
        key = snapshot.getKey();
        @SuppressWarnings({"unchecked"})
        Map<String, Object> map = (Map<String, Object>) snapshot.getValue(); // The reason we don't set multiversalType is it gets set automatically at top
        name = map.get("name") != null ? (String) map.get("name") : "";
        accountTypeId = map.get("accountTypeId") != null ? (Long) map.get("accountTypeId") : 0L;
        phoneNumber = map.get("phoneNumber") != null ? (String) map.get("phoneNumber") : "";
        email = map.get("email") != null ? (String) map.get("email") : "";
        street = map.get("street") != null ? (String) map.get("street") : "";
        city = map.get("city") != null ? (String) map.get("city") : "";
        state = map.get("state") != null ? (String) map.get("state") : "";
        startingBal = map.get("startingBal") != null ? (Long) map.get("startingBal") : 0L;
        creditDetailsAvailable = map.get("creditDetailsAvailable") != null ? (Boolean) map.get("creditDetailsAvailable") : false;
        isLoan = map.get("isLoan") != null ? (Boolean) map.get("isLoan") : false;
        loanType = map.get("loanType") != null ? (Long) map.get("loanType") : 0L;
        loanTypeSubcategory = map.get("loanTypeSubcategory") != null ? (Long) map.get("loanTypeSubcategory") : 0L;
        loanPercentOne = map.get("loanPercentOne") != null ? (Double) map.get("loanPercentOne") : 0.0;
        loanPercentTwo = map.get("loanPercentTwo") != null ? (Double) map.get("loanPercentTwo") : 0.0;
        loanPercentThree = map.get("loanPercentThree") != null ? (Double) map.get("loanPercentThree") : 0.0;
        loanPercentFour = map.get("loanPercentFour") != null ? (Double) map.get("loanPercentFour") : 0.0;
        loanIntFactorOne = map.get("loanIntFactorOne") != null ? (Long) map.get("loanIntFactorOne") : 0L;
        loanIntFactorTwo = map.get("loanIntFactorTwo") != null ? (Long) map.get("loanIntFactorTwo") : 0L;
        loanIntFactorThree = map.get("loanIntFactorThree") != null ? (Long) map.get("loanIntFactorThree") : 0L;
        loanIntFactorFour = map.get("loanIntFactorFour") != null ? (Long) map.get("loanIntFactorFour") : 0L;
        maxLimit = map.get("maxLimit") != null ? (Long) map.get("maxLimit") : 0L;
        maxCashAdvanceAllowance = map.get("maxCashAdvanceAllowance") != null ? (Long) map.get("maxCashAdvanceAllowance") : 0L;
        closeDay = map.get("closeDay") != null ? (Long) map.get("closeDay") : 0L;
        dueDay = map.get("dueDay") != null ? (Long) map.get("dueDay") : 0L;
        cycle = map.get("cycle") != null ? (Long) map.get("cycle") : 0L;
        minimumPaymentRequired = map.get("minimumPaymentRequired") != null ? (Long) map.get("minimumPaymentRequired") : 0L;
        lateFeeAsOneTimeInt = map.get("lateFeeAsOneTimeInt") != null ? (Long) map.get("lateFeeAsOneTimeInt") : 0L;
        lateFeeAsPercentageOfTotalBalance = map.get("lateFeeAsPercentageOfTotalBalance") != null ? (Double) map.get("lateFeeAsPercentageOfTotalBalance") : 0.0;
        cycleDues = map.get("cycleDues") != null ? (Long) map.get("cycleDues") : 0L;
        duesCycle = map.get("duesCycle") != null ? (Long) map.get("duesCycle") : 0L;
        minimumPaymentToBeSmart = map.get("minimumPaymentToBeSmart") != null ? (Long) map.get("minimumPaymentToBeSmart") : 0L;
        interestRate = map.get("interestRate") != null ? (Double) map.get("interestRate") : 0.0;
        interestKind = map.get("interestKind") != null ? (Long) map.get("interestKind") : 0L;
        timeStamp = map.get("timeStamp") != null ? (Long) map.get("timeStamp") : 0L; // WILL THIS WORK FOR ANY IE OBJECT???
        ref = snapshot.getRef(); //Why is this line needed?!??
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("accountTypeId", accountTypeId);
        map.put("phoneNumber", phoneNumber);
        map.put("email", email);
        map.put("street", street);
        map.put("city", city);
        map.put("state", state);
        map.put("startingBal", startingBal);
        map.put("creditDetailsAvailable", creditDetailsAvailable);
        map.put("isLoan", isLoan);
        map.put("loanType", loanType);
        map.put("loanTypeSubcategory", loanTypeSubcategory);
        map.put("loanPercentOne", loanPercentOne);
        map.put("loanPercentTwo", loanPercentTwo);
        map.put("loanPercentThree", loanPercentThree);
        map.put("loanPercentFour", loanPercentFour);
        map.put("loanIntFactorOne", loanIntFactorOne);
        map.put("loanIntFactorTwo", loanIntFactorTwo);
        map.put("loanIntFactorThree", loanIntFactorThree);
        map.put("loanIntFactorFour", loanIntFactorFour);
        map.put("maxLimit", maxLimit);
        map.put("maxCashAdvanceAllowance", maxCashAdvanceAllowance);
        map.put("closeDay", closeDay);
        map.put("dueDay", dueDay);
        map.put("cycle", cycle);
        map.put("minimumPaymentRequired", minimumPaymentRequired);
        map.put("lateFeeAsOneTimeInt", lateFeeAsOneTimeInt);
        map.put("lateFeeAsPercentageOfTotalBalance", lateFeeAsPercentageOfTotalBalance);
        map.put("cycleDues", cycleDues);
        map.put("duesCycle", duesCycle);
        map.put("minimumPaymentToBeSmart", minimumPaymentToBeSmart);
        map.put("interestRate", interestRate);
        map.put("interestKind", interestKind);
        map.put("timeStamp", timeStamp);
        return map;
    }

    @Override
    public void setMultiversalType(Long multiversalType) {
        multiversalType = 3L;
    }

    @Override
    public Long getMultiversalType() {
        return 3L;
    }

}
