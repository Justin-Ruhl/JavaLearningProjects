package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        boolean teen = false;
        if (this.age > 12 && this.age < 20) {
            teen = true;
        }
        return teen;
    }

    public String getFullName() {
        String name = "";
        if (!this.firstName.isEmpty()) {
            name += this.firstName;
        }
        if (!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            name += " ";
        }
        if (!this.lastName.isEmpty()) {
            name += this.lastName;
        }
        return name;
    }
}
