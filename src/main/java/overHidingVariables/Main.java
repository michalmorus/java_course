package overHidingVariables;

public class Main {
    public static void main(String ...args) {
        Car car = new Car();
        System.out.println("car seats: " + car.seats);

        SportsCar sportsCar = new SportsCar();
        System.out.println("sport car seats: " + sportsCar.seats);

        // IMPORTANT!!!
        Car car2 = new SportsCar();
        System.out.println("sport car2 seats: !!!! " + car2.seats);


        Car car3 = new Car();
        System.out.println("car seats: " + car3.getSeats());

        SportsCar sportsCar2 = new SportsCar();
        System.out.println("sport car seats: " + sportsCar2.getSeats());

        Car car4 = new SportsCar();
        System.out.println("sport car seats: !!!! " + car4.getSeats());
    }
}
