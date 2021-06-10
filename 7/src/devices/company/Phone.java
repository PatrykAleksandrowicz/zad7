package devices.company;
public class Phone extends Device {
    String System;

    public Phone(String model, String producer, int yearOfProduction, String system) {
        this.System = system;
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn(){
        java.lang.System.out.println("Telefon wlaczyl sie!");
    }
    @Override
    public String toString() {
            String x = "Model: " + this.model + ";" +
                    "Producent: " + this.producer + ";" +
                    "Cena: " + this.System + ";" +
                    "Rok produkcji: " + this.yearOfProduction;
            return x;
        }
}