package belajarOOP;

public class Inheritnace {
    class Employee {
        String name;
        Employee(String name){
            this.name = name;
        }
    }

    class Manager extends Employee{
        Manager(String name){
            super(name);
        }
    }

    class VicePresident extends Manager{
        VicePresident(String name){
            super(name);
        }
    }
}

