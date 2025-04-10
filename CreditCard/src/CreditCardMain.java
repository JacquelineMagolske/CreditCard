import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardMain
	{

		static int total = 0;
		static ArrayList <Long> cardList = new ArrayList<>();
		
		public static void main(String[] args) throws IOException
			{
				TextFile.readCards();
				doubleAlternates(); //do the math in here
				//make a final method to actually validate
			}
		
		public static void doubleAlternates()
		{
			
			long value; //instantiate - set to other value later
			
			for(int i=0; i < cardList.size(); i = i+2) 
			{
				value = cardList.indexOf(i);
				cardList.set(i, value);
				
				
				if(cardList.indexOf(i) > 9)
					{
						long sum = 0;
						String cardString = String.valueOf(cardList.indexOf(i));
						
						for(int j=0; j < cardList.size(); j++)
							{
								
							}
					}
			}
			
			
			
			
			
		}

	}
