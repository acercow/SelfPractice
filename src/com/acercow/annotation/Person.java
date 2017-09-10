package com.acercow.annotation;

public class Person {


    @Name(value = "Zhao sen") // or: @Name("Zhao Sen")
    private String name;

    @Gender(gender = Gender.GenderType.Male)
    private String gender;

    @Profile(id = 9324, height = 178, nativePlace = "BeiJing")
    private String profile;

    public Person() {

    }

    public Person(String name, String gender, String profile) {
        this.name = name;
        this.gender = gender;
        this.profile = profile;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
