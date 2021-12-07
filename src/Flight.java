/*
 * A flight class that contains getters, setters, and a constructor to help setup the FlightTest class.
 */
public class Flight {

	String airLine;
	String flightNumber;
	String origin;
	String destination;
	
	
	public Flight(String airLine, String flightNumber, String origin, String destination) {
		super();
		this.airLine = airLine;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
	}


	public String getAirLine() {
		return airLine;
	}


	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Flight [airLine=" + airLine + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination="
				+ destination + "]";
	}
	
}
