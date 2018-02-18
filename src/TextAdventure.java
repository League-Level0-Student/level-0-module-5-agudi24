import java.util.Scanner;

public class TextAdventure {
public static void main(String[] args) {
	int score = 0;
	System.out.println("Welcome to Text Adventures!");
	System.out.println("What is your name?");
	Scanner kb = new Scanner(System.in);
	String name = kb.nextLine();
	System.out.println(name + ", you are a person in a forest and you don't have food, what do you do?");
	Scanner kb2 = new Scanner(System.in);
	String name2 = kb2.nextLine();
	if (name2.equalsIgnoreCase("hunt for animals")){
		GoodChoice();
		score++;
	}
	else {
		BadChoice();
	}
	System.out.println("If you are alone and somehow find food in the forest, should you share it?");
	Scanner kb3 = new Scanner(System.in);
	String name3 = kb3.nextLine();
	if (name3.equalsIgnoreCase("No")) {
		GoodChoice();
		score++;
	}else {
		BadChoice();
	}
	System.out.println("If you find a rattlesnake should you run away or kill it?");
	Scanner kb4 = new Scanner(System.in);
	String name4 = kb4.nextLine();
	if (name4.equalsIgnoreCase("Run away")) {
		GoodChoice();
		score++;
	}else {
		BadChoice();
	}
	System.out.println("If you find another bear, should you try to see if it is a harmless bear?");
	Scanner kb5 = new Scanner(System.in);
	String name5 = kb5.nextLine();
	if (name5.equalsIgnoreCase("Yes")) {
		GoodChoice();
		score++;
	}else {
		BadChoice();
	}
	int f = score*25;
	System.out.println("Congratulations " + name + "! You are " + f + "% ready to explore the wilderness by yourself.");
	}
	
	static void GoodChoice() {
		System.out.println("Good Choice!");
	}
	static void BadChoice() {
		System.out.println("Bad Choice!");
	}

}

