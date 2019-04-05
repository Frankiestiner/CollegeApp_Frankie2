package com.fwhite.collegeapp_frankie;
public class Guardian extends FamilyMember {
    String firstName;
    String lastName;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Guardian(){
        super();
    }}
