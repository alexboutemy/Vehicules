public class Hangar {
    public static void main(String[] args) {

        Car Clio = new Car("Clio", 1000);
        Boat QE = new Boat("Queen Elisabeth 2", 1000000);

        System.out.println(Clio.doStuff());
        System.out.println(QE.doStuff());
    }
}
