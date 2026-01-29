/*7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.
BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
Explanation:
 Tests method overriding with percentage-based calculations.*/

import java.util.*;

class Ticket
{
	void calculatePrice()
	{
		System.out.println("");
	}
}

class MovieTicket extends Ticket
{
	double MTicket;
	MovieTicket(double MTicket)
	{
		this.MTicket = MTicket;
	}

	void calculatePrice()
	{
		double TotalPrice = MTicket + (MTicket * 18 /100); 
		System.out.println("Movie Ticket Price With 18% GST : "+ TotalPrice);
	}
}

class BusTicket extends Ticket
{
	double BTicket;
	BusTicket(double BTicket)
	{
		this.BTicket = BTicket;
	}
	void calculatePrice()
	{
		double TotalPrice = BTicket + (BTicket * 5 /100); 
		System.out.println("Bus Ticket Price With 5% GST : "+ TotalPrice);
	}
}

public class Cal_BusTicket_MovieTicket
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Movie Ticket Price: ");
		double movieTicket = sc.nextDouble();

		System.out.println("Enter the Bus Ticket Price: ");
		double busTicket = sc.nextDouble();

		MovieTicket m = new MovieTicket(movieTicket);
		 BusTicket b = new BusTicket(busTicket);

		m.calculatePrice();
		b.calculatePrice();
	}
}