package com.company;

public class Seller {
  private  String name;
    private String surname;
    private int number_of_sales;
    private double reputation;
    Seller(){
        this.name = "Victor";
        this.surname = "Petrenko";
        this.number_of_sales = 300;
        this.reputation = 4.5;
    }


    String getName(){ return name; }
    void setName(String newname){this.name =newname;}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber_of_sales() {
        return number_of_sales;
    }

    public void setNumber_of_sales(int number_of_sales) {
        this.number_of_sales = number_of_sales;
    }

    public double getReputation() {
        return reputation;
    }

    public void setReputation(double reputation) {
        this.reputation = reputation;
    }
}
