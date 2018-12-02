package main;
import java.util.Scanner;

public class TicketSeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ticket = 10;
		int quantity;
		int cnt = 0;
		while(ticket > 0)
		{
			System.out.println("Enter the number of ticket : ");
			int m = input.nextInt();
			if(m <= 4 && m > 0)
			{
				if(ticket < m)
					System.out.println(m + " ticket not available");
				else
				{
					cnt++;
					ticket = ticket - m;
				}
					
				System.out.println(ticket + " ticket available");
			}
			else
			{
				System.out.println("You can buy (0 - 4) ticket");
			}
				
		}
		
		input.close();
		System.out.println("Numbers of Buyers: " + cnt);

	}

}
