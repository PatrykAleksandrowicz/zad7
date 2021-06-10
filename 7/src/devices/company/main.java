package devices.company;

public class main {
    public static void  main(String[] args){
        Car auto = new Car("A3","Audi","120k", 100000.0, 2015);
        Phone iphone = new Phone("11 pro", "Apple", 2019, "IoS");
        auto.turnOn();
        iphone.turnOn();

    }
}