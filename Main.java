package me.lester.test;

import org.mindrot.jbcrypt.BCrypt;

public class Main
{

	public static void main(String[] args)
	{
		
		String test1 = "HI!";
		System.out.println("Unencrypted text: " + test1);
		String test2 = "HI!";
		String test3 = BCrypt.gensalt(10);
		String test4 = BCrypt.hashpw(test2, test3);
		System.out.println("Salt: " + test3 + "\n" + "Hashed: " + test4);
		boolean test5 = BCrypt.checkpw(test2, test4);
		boolean test6 = BCrypt.checkpw(test2, test3);
		
		if(test5)
		{
			System.out.println("CORRECT!");
		}
		else if(!test5)
			System.out.println("NOPE..");
		
		if(test6)
		{
			System.out.println("CORRECT!");
		}else if(!test6)
			System.out.println("NOPE..");
	}
}
