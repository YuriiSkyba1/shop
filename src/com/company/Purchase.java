package com.company;

public class Purchase {
private String meat;
 private  int price;
 private  String vegetables;
 private  int price1;
 private int Suma;



    Purchase(){
    this.meat="rabbit";
    this.price=100;
    this.vegetables="onion";
    this.price1=10;
    this.Suma=price+price1;


}

    String getMeat(){ return meat; }
    void setMeat(String newmeat){this.meat =newmeat;}
    public int getPrice() {
        return price;
    }
     public String getVegetables(){ return vegetables; }
    void setVegetables(String newvegetables){this.vegetables =newvegetables;}
    public int getPrice1() { return price1; }
    public float getSuma() { return Suma; }

}
