import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class TextFile
	{

		public static void readCards() throws IOException
		{
			
			Scanner myFile = new Scanner(new File("untitledTextFile2.txt"));
			
			while(myFile.hasNext())
				{
					String cardNumbers = myFile.nextLine();
				}
			
			
		}
		
		
	}
