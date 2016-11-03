package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput;
	private String myLove;
	
	public StupidController()
	{
		myName = "Jake Nilson";
		readKeyboardInput = new Scanner(System.in);
		myLove = "Lyss";
	}
	
	public void start()
	{
		substringTest();
		//indexOfTest();
		//loopTester();
		//System.out.println("This is slightly less stupid :D");
		//System.out.println(myName);
		//askQuestions();
	}
	
	private void substringTest()
	{
		String test = "The quick brown fox ...";
		String words = "... jumped over the lazy dog";
		
		
		String other = test.substring(4);
		System.out.println("Here is the substring: " + other);
		
		other = words.substring(2,2);
		System.out.println("Here is the partial substring: " + other);
	}
	
	private void indexOfTest()
	{
		String words = " ";
		String sample = "a";
		int index = -99;
		
		index = "sdfsdfsdf".indexOf(sample, 3);
		
		System.out.println("The index of the sample in words is: " + index);
		
		index = sample.indexOf("");
		
		System.out.println("The index of words in sample is: " + index );
	}
	
	private void loopTester()
	{
		for(int i=0; i<=4; i++)
		{
			System.out.println("James Gosling");
		}
		
		for(int i=0; i<=2; i++)
		{
			System.out.printf(".o%do.", i);
		}
		
		for(int i=2; i<=22; i+=4)
		{
			System.out.printf("%d", i);
		}
		
		for(int i=5; i>=-4; i-=3)
		{
			System.out.printf("%d", i);
		}
	}
	
	private void loopMonster()
	{
		//for loop #1
		for (int myNum = 0; myNum<=10; myNum++)
		{		
			System.out.println("My number is: " + myNum);
		}
		
		//for loop #2
		for (int num = 0; num<12; num+=2)
		{
			System.out.println("My name is: " +  num);
		}
		
		//while loop #1
		int hey = 10;
		while (hey>1)
		{
			System.out.println("My monsters name is " + myName);
			hey++;
			break;
		}
		
		//while loop #2
		int go = 10;
		while (go>1)
		{
			System.out.println("I love " + myLove);
			go++;
			break;
		}
		
		//nested loop
				for (int numb = 0; numb<12; numb++)
				{
					if (numb<=6)
					{
						System.out.println("My number is: " + numb + ", and it's 6 or less!");
					} else {
						System.out.println("My number is: " + numb + ", and its more than 6!");
					}
				}
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("Nice to meet you " + userInput + "!");
		
		if (userInput.equalsIgnoreCase("Alyssa"))
		{
			System.out.println("You have the same name as me!");
		}
		
		System.out.println("How old are you " + userInput + "?");
		double intInput = readKeyboardInput.nextDouble();
		System.out.println("Wow, you are " + intInput+ "?!");
		
		System.out.println("That's cool! How many pets do you have?");
		int dogInput = readKeyboardInput.nextInt();
		System.out.println("I wish I had " + dogInput + " pets!");
		
		System.out.println("What school do you go to?");
		String schoolInput = readKeyboardInput.next();
		System.out.println("I bet " + schoolInput + " is a cool school!");
		readKeyboardInput.nextLine(); //Used to consume the remainder of the text buffer.
		
		System.out.println("What is your favorite color?");
		String colorInput = readKeyboardInput.nextLine();
		System.out.println(colorInput + " is my favorite too!");
		
		System.out.println("What state do you live in?");
		String stateInput = readKeyboardInput.nextLine();
		System.out.println(stateInput + " is a beautiful state!");
		
		System.out.println("How many people are in your family?");
		Float famInput = readKeyboardInput.nextFloat();
		System.out.println("Your family of " + famInput + " is really cool!");
		
		System.out.println("What kind of car do you have?");
		String carInput = readKeyboardInput.next();
		System.out.println("Wow, " + userInput + "! " + carInput + " is a really cool car!");
		readKeyboardInput.nextLine();
		
		System.out.println("Are you having fun?");
		String ynInput = readKeyboardInput.nextLine();
		System.out.println(ynInput + ", this is fun!");
		
		System.out.println("Wait, what was your name again?");
		String nameInput = readKeyboardInput.nextLine();
		System.out.println("Oh yeah, " + nameInput + ". That's right!");
	}
}
