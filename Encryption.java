public class Encryption
{
	public String encrypt(String mystring, int n)
	{
		int newChar = 0;
		int offset = 97;
		String end = "";
		char hold = 'a';
		if (n < 1)
			return;
		mystring.toLowerCase();
		//System.out.println(mystring);
		for (int i = 0; i < mystring.length(); i++)
		{
			newChar = mystring.charAt(i);
			newChar = newChar - offset;
			if (newChar > 0)
			{
				//System.out.println(newChar + " ");
				newChar = (newChar*n)%26;
				//System.out.println("The new char is " + newChar);
			}
			hold = (char) (newChar+97);
			end += hold;
				
		}
		
		return end;
	}
	public static void main(String [] args)
	{
		Encryption e = new Encryption();
		System.out.println(e.encrypt("a time boi", 4));
	}
}
