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

This is the main Folder. Here we call the Request file and use it. Here are our 7 objects in form of Constructor. When a constructor is called, the logic of Request is activated and the Response is send to the respective Listener. all this Process is running in background, so, our main thread is not blocked and we can do more stuff. The process that run on background wait until the request is finish, then the function onPostExecute is called automatic and this function is where our listener is fill out. you can find the onPostExecute function on Response File.   
