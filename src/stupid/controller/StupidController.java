package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput;
	
	public StupidController()
	{
		myName = "Jake Nilson";
		readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("This is slightly less stupid :D");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("Nice to meet you " + userInput + "!");
		
		if (userInput.equalsIgnoreCase("Jake"))
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
