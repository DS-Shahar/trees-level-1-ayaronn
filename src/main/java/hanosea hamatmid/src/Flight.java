import java.util.Queue;
import java.util.LinkedList;

public class Flight {
    private String flightNum;        
    private Queue<Passenger> passengers;  
    private int capacity;            
    private int km;                 
    private Queue<Passenger> waiting;    

    public Flight(String flightNum, int capacity, int km) {
        this.flightNum = flightNum;
        this.capacity = capacity;
        this.km = km;
        this.passengers = new LinkedList<>();
        this.waiting = new LinkedList<>();
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Queue<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Queue<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Queue<Passenger> getWaiting() {
        return waiting;
    }

    public void setWaiting(Queue<Passenger> waiting) {
        this.waiting = waiting;
    }
}
