/*This is the super constructor, Some classes inheritance from this one.*/

package com.thegrafico.raul.evertectest.Modals.Request.InheritanceData;

public class Data {
    //Variables
    private String
            username        = null,
            password        = null,
            trxOper         = null,
            accountID       = null,
            customerName    = null,
            customerEmail   = null,
            address1        = null,
            address2        = null,
            city            = null,
            state           = null,
            zipcode         = null,
            trxID           = null,
            refNumber       = null,
            trxDescription  = null,
            trxAmount       = null,
            trxTermID       = null;

    private String filler[] = new String[3];

    public Data(){}

    //----------------------GETTERS AND SETTERS----------------------------
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrxOper() {
        return trxOper;
    }

    public void setTrxOper(String trxOper) {
        this.trxOper = trxOper;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getTrxDescription() {
        return trxDescription;
    }

    public void setTrxDescription(String trxDescription) {
        this.trxDescription = trxDescription;
    }

    public String getTrxAmount() {
        return trxAmount;
    }

    public void setTrxAmount(String trxAmount) {
        this.trxAmount = trxAmount;
    }

    public String getTrxTermID() {
        return trxTermID;
    }

    public void setTrxTermID(String trxTermID) {
        this.trxTermID = trxTermID;
    }

    public String[] getFiller() {
        return filler;
    }

    public void setFiller(String[] filler) {
        this.filler = filler;
    }
}
