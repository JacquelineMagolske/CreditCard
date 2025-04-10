import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile
	{

		public static void readCards() throws IOException
		{
			
			Scanner myFile = new Scanner(new File("cardNumbers"));
			ArrayList <Long> cardList = new ArrayList<>();
			
			while(myFile.hasNext())
				{
					String cardNumber = myFile.nextLine();
					long number = Long.parseLong(cardNumber);
					cardList.add(number);
				}
			System.out.println(cardList.size());
			
			
		}
		
		
	}
