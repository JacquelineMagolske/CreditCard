import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardMain
	{

		static int counter = 0;
		
		public static void main(String[] args) throws IOException
			{
			
				TextFile.readCards();
				doubleAlternates(); //do the math in here
				System.out.print("There are " + counter + " valid credit cards");
				
				
			}
		
		public static void doubleAlternates()
		{
			
			long cardNumber; //instantiate - set to other value later - use long for more digits than int
			
			for(int i = 0; i < TextFile.cardList.size(); i++) //credit card by credit card
			{
				
				
				cardNumber = TextFile.cardList.get(i);
				TextFile.cardList.set(i, cardNumber);
				
				//digit stripping - evaluate individually
				long temporary = cardNumber; 
				int totalDigits = 0;
			
				while(temporary > 0)
				{
					temporary = temporary / 10;
					totalDigits++;
				}
				
				int[] cardDigits = new int[totalDigits];
				temporary = cardNumber;
				
				for(int j = totalDigits - 1; j >= 0; j--) //extracting
				{
					cardDigits[j] = (int)(temporary % 10);
					temporary = temporary/10;
				}
				
				int total = 0;
				//actual math
					
					for(int h = 0; h < cardDigits.length; h++)
					{
						int individualDigit = cardDigits[h];
						
						if(h % 2 == 0)
						{
							individualDigit = individualDigit*2;
							
							if(individualDigit > 9)
							{
								individualDigit = (individualDigit / 10) + (individualDigit % 10);
							}
						}
						
						total = total + individualDigit;
					}
					
				validateCard(cardNumber, total); //separate method for checking
				
				
			}
			
		}
		
		
		
		public static void validateCard(long cardNumber, int total)
		{
			
			
			
			if(total % 10 == 0)
			{
				System.out.println(cardNumber + " is a potential combination for a credit card");
				counter++;
				
			}
			
			else
				{
					System.out.println(cardNumber + " is NOT valid");
				}
			
			
		}

	}
