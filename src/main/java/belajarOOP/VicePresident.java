package belajarOOP;

public class VicePresident extends Manager {
    String name;

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name Is VP" + this.name);
    }
}
