package com.dilekcelebi.chatapp;

public class UserModel {

    String userID;
    String userName;
    String userEmail;

    public UserModel(String userID, String userName, String userEmail) {

        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
}



