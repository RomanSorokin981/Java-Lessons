package com.rs.homework;

public class Teacher implements Person{
    String name;
    int personAge;
    int currentHour;
    String soWhat;
    int whenThePersonComesToUniversity = 25;
    int whenThePersonLeave = 60;

    public Teacher(String name, int personAge){
        this.name = name;
        this.personAge = personAge;
    }

    @Override
    public void whatThePersonDo(int currentHour) {
        if (currentHour > 8 && currentHour < 14 && personAge > 25 && personAge < 60) {
            soWhat = "Person is teaching";
        } else if (currentHour > 0 && currentHour < 8) {
            soWhat = "Person is sleeping";
        } else {
            soWhat = "Person is cheeling";
        }
        System.out.println(soWhat);
    }

    @Override
    public Integer howLongThePersonInUniversity(int personAge) {
        return personAge - whenThePersonComesToUniversity;
    }

    @Override
    public  Integer howLongThePersonCanStayInUniversity(int personAge){
        return whenThePersonLeave - personAge;

    }
}
