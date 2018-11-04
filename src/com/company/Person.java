package com.company;
public class Person {
   private String name;
   private String surname;
   private String job;
   private   String sex;
   private int age;

    @Override
    public String toString() {
        return
                " Person name = " + name  +
                " surname= " + surname  +
                " job =" + job  +
                " sex = " + sex  +
                " age = " + age +
                " salary =" + salary
                ;
    }

    private int salary;
    public Person(String name, String surname,String job,String sex, int age,int salary) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.sex = sex;
        this.age = age;
        this.salary = salary;


    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getJob() {
        return job;
    }
    public String getSex() {
        return sex;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    }





