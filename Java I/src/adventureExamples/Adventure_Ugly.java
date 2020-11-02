package adventureExamples;
// Mr. David's Adventure Project
// I got help from Mohammed, Mr. Nadim, and StackOverflow

import java.util.Scanner;

public class Adventure_Ugly {

	// we generally shouldn't make one big main method, but 
	// here we'll break that rule to show bad style
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Amazon. What's your name?");
		
		String answer = input.next();
		
		System.out.println("Of course, you're " + answer + " the famous explorer. "
				+ "You must be here in search of the ancient treasure.");
		
		System.out.println("You are standing on a path leading into the jungle. Besides the path"
				+ " is a river. What do you do?");
		
		System.out.println("a. Head down the path. \nb. Hop in the river and start swimming downstream.");
		
		answer = input.next();
		
		if (answer.equals("a")) {
			
			System.out.println("You head down the path. Suddenly, an arrow zips past your head."
					+ "What do you do?" );
			System.out.println("a. Run! \nb. Climb a tree to get out of view of your attacker. "
					+ "\nc. Pull out your knife and start yelling.");
			answer = input.next();
			
			if (answer.equals("a")) {
				System.out.println("Well, you're alive, but you've run off the path into the middle of"
						+ " unexplored jungle. Good luck ever getting out.");
			}
			else {
			
				if (answer.equals("b")) {
					System.out.println("You climb up the tree, out of sight of your attacker."
							+ "However you immediately discover there are ravenous chimpanzees up here who throw you "
							+ "off for invading their territory. RIP");
				}
				else {
					if (answer.equals("c")) {
						System.out.println("A native warrior emerges from the jungle. He orders you to follow him."
								+ "What do you do?");
						
						System.out.println("a. You don't take orders from anybody. You attack him with your little pocketknife.\n"
								+ "b. You follow him obediently. \nc. You act crazy, waving your arms in the air and yelling nonsense.");
						answer = input.next();
						
						if (answer.equals("a")) {
							System.out.println("Probably not a great idea. RIP");
						}
						
						else {
							if (answer.equals("b")) {
								System.out.println("He leads you down a path. After a bit, you take a turn onto a new path. "
										+ "In the middle of the path is a 20 foot python, looking at the two of you hungrily. "
										+ "It immediately lunges towards you. What do you do?");
								System.out.println("a. Push the warrior into the python's path. Better him than you. \nb. Grab the warrior and "
										+ "jump into the river.\nc. Draw your knife and rush at the python.");
								
								answer = input.next();
								
								if (answer.equals("a")) {
									System.out.println("The python happily starts swallowing the warrior. You run back the way you came.");
								}
								else {
									if (answer.equals("b")) {
										System.out.println("You and the warrior float down the river for a bit, safe from the danger of the python."
												+ " Once you're sure its safe, \nyou both get back onto dry land. He expresses his deep gratitude for saving his life,"
												+ "and as thanks, leads you to the lost city of gold. \nYou found it! Now you just have to get all this treasure out of the "
												+ "jungle...");
									}
									else {
										if (answer.equals("c")) {
											System.out.println("You are a tasty lunch for the python. RIP");
										}
										else {
											System.out.println("Not a valid input");
										}
									}
								}
							}
							else {
								if (answer.equals("c")) {
									System.out.println("The chimpanzees up in the trees recognize you as one of their own."
											+ " They hop down and protect you from your attackers, then adopt you. \nLooks like you'll be living with "
											+ "monkeys for the rest of your days.");
								}
								else {
									System.out.println("Not a valid input");
								}
							}
						}
					}
				}
			}	
		}
		else {
			if (answer.equals("b")) {
				System.out.println("Maybe not the smartest choice. As soon as you hop in, a group of piranhas make a tasty breakfast out of you. RIP");
			}
			else {
				System.out.println("Not a valid input");
			}
		}
		
		input.close();
	}
}
