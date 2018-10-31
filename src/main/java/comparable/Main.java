package comparable;

import java.util.ArrayList;

public class Main {
    public static void main(String ...args) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("A123"));
        flights.add(new Flight("ZZ123"));
        flights.add(new Flight("523FF"));
        flights.add(new Flight("IOI123"));
        flights.add(new Flight("MASDJAS"));

        flights.sort(Flight::compareTo);

        flights.forEach(System.out::println);
    }
}
