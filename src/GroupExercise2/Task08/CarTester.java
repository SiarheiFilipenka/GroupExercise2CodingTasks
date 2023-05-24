package GroupExercise2.Task08;

public class CarTester {
    public static void main(String[] args) {

        Truck truck = new Truck(50000, "Black", 3000);
        Sedan sedan = new Sedan(45000, "Blue", 18);

        System.out.println(truck.calculateSalePrice());
        System.out.println(sedan.calculateSalePrice());
    }
}