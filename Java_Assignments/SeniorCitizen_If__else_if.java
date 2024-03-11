package blocks;
public class SeniorCitizen_If__else_if {
	public static void main(String[] args) {
		int a = 1000;
		double s = a * (75.0 / 100);// if we put 75, 0.0 is output
		int b = a - a;
		String n= "Obama";//name of the passenger
		int d = 65;//age of the passenger
		if (d < 4) {System.out.println("Passenger Name :"+n+" ; Fare with Kids' Concession ="+b+" INR");
		}
		else {
		if (d < 60) {System.out.println("Passenger Name :"+n+" ; Fare without any concession = "+a+" INR");} 
		else if (d >= 60) {System.out.println("Passenger Name :"+n+" ; Fare with Senior Citizen Concession ="+s+" INR");}
		}
	}

}
