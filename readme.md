# Android API for Web service

This is an API for a web service. The main functionality of this API is to make request from a type of object that we created here. That request will return a Response and we use this Response in the way we want.

We have 7 differences types of object for Request and Response:
  - Process Debit
  - Process Credit
  - Process ACH
  - Process Wallet
  - Process Checkout Payment
  - Process Online
  - Process Transaction Search

Our API only can make the request and get Response with this type of objects. Below we start to explain all the folders and they respective functionality.

## Connector Listener:

This folder is in charge, as their name say it, to bring the communication from Response Object to our main activity or wherever we want to use it the response. The listener are object that save the Response data into they parameters. In the listener is where we get the Response and where we can manipulate it.

## Modals:

Modals Folder is where the Schema, the body of Request and Response data is store. Here are 2 sub-folders, the schema for Request and the schema for Response. the Request folder have our 7 Object, plus 1 that is used for inheritance. Same for Response Folder. All objects in Modals are used to make the request and get a response.

## Request:

The request Folder is one of the most important. Is in charge to make the request. All the request that we made are 'POST'. The file inside this folder make the request and return a Response, in the same way, is in charge to set the URL, that is, where our POST request is going to.

## Response:

This is the main Folder. Here we call the Request file and use it. Here are our 7 objects in form of Constructor. When a constructor is called, the logic of Request is activated and the Response is send to the respective Listener. all this Process is running on background, so, our main thread is not blocked and we can do more stuff. The process that run on background wait until the request is finish, then the function onPostExecute is called automatic and this function is where our listener is fill out. you can find the onPostExecute function on Response File.

## Examples:
if you want to make a request for *Debit Transaction*
  ```
  //init the Request that you want to make request
  ProcessDebit_Request processDebit = new ProcessDebit_Request();
    //fill up the request with the date
        processDebit.setUsername("Jesus123");
        processDebit.setPassword("1234");
        processDebit.setAccountID("001");
        processDebit.setCustomerName("jesus");
        processDebit.setCustomerEmail("test@test.com");
        ...  //here are more fill methods
        ...
        ...
         /*
          *init the ProcessResponse, this is the same for all request,
           the only that change is the parameters.
          *The parameters for this request are: the object that we are
           fill up and the respective listener for it.
         */
        new ProcessResponse(processDebit,  new DebitListenerResponse() {
            @Override
            public void downloadCompleted(String result, ResponseDebit response) {
                Log.d("Result: ", result); //the result we get
                Log.d("Response: ", response.toString()); //Response object where we can manipulate Data.
            }
        }).execute();

  ```
  as you can see, we first fill the request object, then create the ProcessResponse, what is the same for all request, and there we received the response object.

  Another Example using *Wallet Transaction*

  ```
  //create the object
       ProcessWalletTransaction_Request walletT= new ProcessWalletTransaction_Request();
       //fill the object
       walletT.setUsername("Jesus123");
       walletT.setPassword("1234");
       walletT.setAccountNumber("123456");
       walletT.setTrxOper("sale");
       walletT.setTrxID("123456");
       walletT.setTrxAmout("0.01");
       walletT.setRefNumber("");
       walletT.setFiller1("TESTING");
       walletT.setTrxDescription("Jesus");

       //execute the Process with the object Filled.
       new ProcessResponse(walletT,  new WalletListenerResponse() {
           @Override
           public void downloadCompleted(String result, ResponseWalletTransaction response) {
               Log.d("Result: ", result);
               Log.d("Response: ", response.toString());

           }

       }).execute();
  ```  
as we can see, the process is similar to the last one, the most important change is
  - Wallet Transaction have different data to fill
  - ProcessResponse parameters are different
  - For each request the parameters of ProcessResponse change, but the call of the class don't.

## Note:

- You can read the method have available to make Request (7 possible ways to do it).
- The application was tested with a personal NodeJs server and https://app.apiary.io. if you want to test you need
  a server or you can test it on apiary. changing the URL in the file *makeRequest* for the URl of apiary.
- Still the API is not complete, there are some important change to do, like data validation.

In this Repo, is only available the code, if you want to see the android full project and the process of creating a API, go to this other Repo: https://github.com/thegrafico/Android_Library_EVT
