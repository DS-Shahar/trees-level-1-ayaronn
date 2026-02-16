
public class Main {
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


	public static void main(String[] args) {

	}

}
