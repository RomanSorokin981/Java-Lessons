package com.rs.homework;

public class Student implements Person{

    String name;
    int personAge;
    int currentHour;
    String soWhat;
    int whenThePersonComesToUniversity = 18;
    int whenThePersonLeave = 25;

    public Student(String name, int personAge){
        this.name = name;
        this.personAge = personAge;
    }

    @Override
    public void whatThePersonDo(int currentHour) {
        if (currentHour > 8 && currentHour < 14 && personAge > 18 && personAge < 25) {
            soWhat = "Person is study";
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
