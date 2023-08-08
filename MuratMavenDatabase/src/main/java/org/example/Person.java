package org.example;

public class Person {
    int UserID;
    String UserName;
    String UserSurname;
    int UserAge;
    String UserJob;
    Double UserNetWorth;

    public Double getUserNetWorth() {
        return UserNetWorth;
    }

    public void setUserNetWorth(Double userNetWorth) {
        UserNetWorth = userNetWorth;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserJob() {
        return UserJob;
    }

    public void setUserJob(String userJob) {
        UserJob = userJob;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserSurname() {
        return UserSurname;
    }

    public void setUserSurname(String userSurname) {
        UserSurname = userSurname;
    }

    public int getUserAge() {
        return UserAge;
    }

    public void setUserAge(int userAge) {
        UserAge = userAge;
    }
}
