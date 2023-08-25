package belajarOOP;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager(null);
        manager.name = "Eko";
        manager.sayHello("Farhan");

        var vicePresident = new VicePresident(null);
        vicePresident.name = "Kurniawan";
        vicePresident.sayHello("Ohlins");
    }
}
