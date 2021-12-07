/*
 * Class to test and make sure that the Flight class is working properly.
 */
public class FlightTest {

	public static void main (String[] args) {
		
	
		Flight flight1 = new Flight("Delta Airlines","DA101","USA","Spain");
		Flight flight2 = new Flight("Saint Peter's Airline","SPA200","Spain","USA");
		Flight flight3 = new Flight("Turbulent Skies","TS250","California","Washington");
		
		System.out.println(flight1);
		System.out.println(flight2);
		System.out.println(flight3);
	}
}
