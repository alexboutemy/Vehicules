public class Boat extends Vehicule {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        return "I am " + this.getBrand() + " and I go glug glug!";
    }

}
