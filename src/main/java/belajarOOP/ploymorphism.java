package belajarOOP;

public class ploymorphism {
    public static void main(String[] args){
        Employee employee = new Employee("eko");
        employee.sayHello("budi");

        employee = new Manager("eko");
        employee.sayHello("budi");

        employee = new VicePresident("eko");
        employee.sayHello("budi");

        sayhello(new Employee("eko"));
        sayhello(new Manager("Joko"));
        sayhello(new VicePresident("Rudi"));
    }
    static void sayhello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee; 
            System.out.println("Heloo Manager "+manager.name);
        }else{
            System.out.println("Helllo "+employee.name);
        }
    }
}
