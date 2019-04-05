package com.fwhite.collegeapp_frankie;

public abstract class FamilyMember {


    String mFirstName;
    String lastName;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void testMethod(){
        if (mFirstName == "test"){
            mFirstName = "hello world";
        }
    }

    public FamilyMember(){
        mFirstName = "Family";
        lastName = "Member";
    }

}
