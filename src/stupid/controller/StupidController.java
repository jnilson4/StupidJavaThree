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
		
		System.out.println("How old are you " + userInput + "?");
		Double intInput = readKeyboardInput.nextDouble();
		System.out.println("Wow, you are " + intInput+ "?!");
		
		System.out.println("That's cool! How many pets do you have?");
		int dogInput = readKeyboardInput.nextInt();
		System.out.println("I wish I had " + dogInput + " pets!");
		
		System.out.println("What school do you go to?");
		String schoolInput = readKeyboardInput.next();
		System.out.println("I bet " + schoolInput + " is a cool school!");
		readKeyboardInput.nextLine();
		//Doesn't have a space to let you type in your school name!
		
		System.out.println("What is your favorite color?");
		String colorInput = readKeyboardInput.nextLine();
		System.out.println(colorInput + " is my favorite too!");
	}
}
