
public class Driver {
	
		public static void main(String[] args)
		{	

			System.out.println(findVowels("Romans"));
			
		}
		
		static int findVowels(String a) 	{
			String s = a.toLowerCase();
			int vowels= 0;
				
			for (int i = 0; i < s.length(); i++)
			{
				char letter = s.charAt(i);
				
				if (letter == 'a') 
				{
					vowels++;
				}
				else if (letter == 'e') 
				{
					vowels++;
				}
				else if (letter == 'i') 
				{
					vowels++;
				}
				else if (letter == 'o') 
				{
					vowels++;
				}
				else if (letter == 'u') 
				{
					vowels++;
				}
			}
			return vowels;

		
		}
		
		
	}


