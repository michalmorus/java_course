package comparable;

public class Flight implements Comparable<Flight> {

    String name;

    public Flight(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Flight o) {
       return this.getName().equals(o.getName()) ? -1 : 1;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                '}';
    }
}
