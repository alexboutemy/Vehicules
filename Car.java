public class Car extends Vehicule {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        return "I am " + this.getBrand() + " and I go zoom zoom zoom!";
    }
}
