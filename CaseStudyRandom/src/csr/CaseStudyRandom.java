package csr;

import java.security.SecureRandom; //program uses class SecureRandom

public class CaseStudyRandom {

	public static void WinMessage()
	{
		System.out.println(" 									Congraturation, You Win! ");
	}
	
	public static void LoseMessage()
	{
		System.out.println("									You Lose! ");
	}
	
	public static void PointMessage()
	{
		System.out.println(" 									POINT! ");
	}
	public static void MenuMessage(int firDice, int secDice, int sumDices)
	{
		System.out.println("+-------------------+-------------------+-----------------+");
		System.out.println("|       FIRST       |       SECOND      |       SUM       |");
		System.out.println("+-------------------+-------------------+-----------------+");
		if(sumDices >=10)
		{
			System.out.println("|         "+firDice+"         |          "+secDice+"        |        "+ sumDices + "       |");
		}
		else
		{
			System.out.println("|         "+firDice+"         |          "+secDice+"        |        "+ sumDices + "        |");

		}
		System.out.println("+-------------------+-------------------+-----------------+");
	}
	
	public static void endOfGame()
	{
		
	}
	
	public static void rollDice()
	{
				int point =0;
		// randomNUmbers object will produce secure random numbers
				SecureRandom randomNumbers = new SecureRandom();
				
				for (int coun =1; coun <=7; coun++)
				{
					int firDice = 1 + randomNumbers.nextInt(6);
					int secDice = 1 + randomNumbers.nextInt(6);
					
					int sum = firDice + secDice;
					
						MenuMessage( firDice,secDice, sum);
						if(sum == 7 || sum == 11)
						{
							WinMessage();
							point++;
						}
						else if(sum == 2 || sum == 3 || sum == 12)
						{
							LoseMessage();
						}
						else
						{
							PointMessage();
							point=point+2;
						}
					
						// Show user's current point
						System.out.println("									Your point is " + point);	
						System.out.println();	
				}
		}
	
	public static void main(String[] args) {
		
		 rollDice();
		
	}

}
