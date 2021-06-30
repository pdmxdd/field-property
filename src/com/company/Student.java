package com.company;

public class Student {
    // fields:
    private String firstName;
    private String lastName;

    // constructor:
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // technically the getters and setters are properties because they define how we access the underlying field
    // getters
    // the external property getFirstName()
    public String getFirstName() {
        // the internal field:
        return this.firstName;
    }

    // the external property getLastName()
    public String getLastName() {
        // the internal field
        return this.lastName;
    }

    // setters
    // the field is exposed by the external property setFirstName()
    public void setFirstName(String firstName) {
        // the internal field:
        this.firstName = firstName;
    }

    // the field is exposed by the external property setLastName()
    public void setLastName(String lastName) {
        // the internal field
        this.lastName = lastName;
    }

}
