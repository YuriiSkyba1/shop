
package com.company;

public class Market {
    public static void main(String[] args){
        System.out.println(getPerson());
        Seller  first_seller = new Seller();
        System.out.print("Seller  name is ");
        System.out.print(first_seller.getName());
        System.out.print(" ");
        System.out.print("Seller  surname is ");
        System.out.print(first_seller.getSurname());
        System.out.print(" ");
        System.out.print("Nember of sales ");
        System.out.print(first_seller.getNumber_of_sales());
        System.out.print(" ");
        System.out.print("Reputation ");
        System.out.print(first_seller.getReputation());
        System.out.println();
//викликаю за допомогою композиції
        registration us = new registration("Ivan","petrenko","yura@gmail.com"," dog " );
        User man = new User(us);
        System.out.printf("%s",man);
        System.out.print("\n");
        Purchase first_user_bought = new Purchase();
        System.out.println(getPerson()+" buy "+first_user_bought.getMeat() + " price "+first_user_bought.getPrice() );
        Purchase second_user_bought = new Purchase();
        System.out.println(man+" buy "+ second_user_bought.getVegetables()+  " price "+ second_user_bought.getPrice1());
        System.out.println("Suma price + price1 = "+second_user_bought.getSuma());
        System.out.println("Komisia = "+second_user_bought.getSuma()/100*5);
        System.out.println("Prubytok =99.5 ");
    }
    public static Person getPerson(){
        return  new Person("Yura", "Skyba", "programmer", " man ", 22, 1500 );


    }



}


