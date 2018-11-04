package com.company;

public   class registration {
   private String name;
    private String surname;
    private String mail;
    private   String password;
public registration(String n,String s,String m,String p){
    this.name=n; this.surname=s; this.mail=m; this.password=p;
}


public String toString(){
    return String.format(" Name %s Surname %s E-mail %s password %s",name,surname,mail,password );
}
}
