import java.util.Queue;

public class FlightScheduler {

    public void assignFlightToPassenger(Flight[] flights, Passenger passenger) {
        Flight selectedFlight = null;
        int minDistance = Integer.MAX_VALUE;

        for (Flight flight : flights) {
            if (passenger.getKm() + flight.getKm() >= 20000 && flight.getCapacity() > flight.getPassengers().size()) {
                if (flight.getKm() < minDistance) {
                    selectedFlight = flight;
                    minDistance = flight.getKm();
                }
            }
        }

        if (selectedFlight != null) {
            if (selectedFlight.getCapacity() > selectedFlight.getPassengers().size()) {
                selectedFlight.getPassengers().add(passenger);
                passenger.setKm(passenger.getKm() + selectedFlight.getKm());
                if (passenger.getKm() >= 20000) {
                    passenger.setPermPass(true); 
                }
            } else {
                selectedFlight.getWaiting().add(passenger);
            }
        }
    }

    public void cancelPassenger(Flight[] flights, int flightIndex, Passenger passenger) {
        Flight flight = flights[flightIndex];

        if (flight.getPassengers().remove(passenger)) {
            passenger.setKm(passenger.getKm() - flight.getKm());

            Passenger permanentPassenger = null;
            for (Passenger p : flight.getWaiting()) {
                if (p.getPermPass()) {
                    if (permanentPassenger == null || p.getKm() > permanentPassenger.getKm()) {
                        permanentPassenger = p;
                    }
                }
            }

            if (permanentPassenger != null) {
                flight.getPassengers().add(permanentPassenger);
                flight.getWaiting().remove(permanentPassenger);
            } else {
                if (!flight.getWaiting().isEmpty()) {
                    Passenger waitingPassenger = flight.getWaiting().poll();
                    flight.getPassengers().add(waitingPassenger);
                }
            }
        }
    }
}
