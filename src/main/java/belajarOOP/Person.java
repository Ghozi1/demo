package belajarOOP;

public class Person {
    String name;
    String lastname;
    String address;
    final String country = "Indonesia";

    Person(String name, String lastname, String address){
        this.name = name; 
        this.address = address;
        this.lastname = lastname;
    }

    Person(String paraName){
        //this(paramName,Null);
    }

    Person(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Halo "+name+" My Name Is " +this.name+"." + lastname);
    }
}
