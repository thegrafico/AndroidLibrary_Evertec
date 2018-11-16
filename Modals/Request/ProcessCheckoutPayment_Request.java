/*--------------- Checkout Payment Request -----------------------

   * Here are the variables that Checkout Payment need to make the request.
   * You need to use this object to make a request for Checkout Payment

  ----------------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Request;

//class
public class ProcessCheckoutPayment_Request {


    //Variables to make request
    private String
                    username        = null,
                    password        = null,
                    accountID       = null,
                    customerName    = null,
                    customerEmail   = null,
                    address1        = null,
                    address2        = null,
                    city            = null,
                    state           = null,
                    zipcode         = null,
                    phone           = null,
                    fax             = null,
                    trxDescription  = null,
                    trxAmount       = null,
                    language        = null,
                    ignoreValues    = null;

    //array to store this data
    private String taxAmount[] = new String [5];
    private String filler[] = new String[3];

    //constructor
    public ProcessCheckoutPayment_Request(){super();}

    //---------------------------------GETTERS and SETTERS--------------------------
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIgnoreValues() {
        return ignoreValues;
    }

    public void setIgnoreValues(String ignoreValues) {
        this.ignoreValues = ignoreValues;
    }

    public String[] getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String[] taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String[] getFiller() {
        return filler;
    }

    public void setFiller(String[] filler) {
        this.filler = filler;
    }
}
