package com.example.viewsandviewgroups;

import java.util.Objects;

public class Person {

    private String mFirstName;
    private String mLastName;

    public Person() {
    }

    public Person(String mFirstName, String mLastName) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person name = (Person) o;
        return Objects.equals(mFirstName, name.mFirstName) &&
                Objects.equals(mLastName, name.mLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mFirstName, mLastName);
    }
}
