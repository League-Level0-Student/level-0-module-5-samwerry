package algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String cents = JOptionPane.showInputDialog("how many dimes do you have?");



		// Tell them how many cents they have (hint multiply by 10)
int cent = Integer.parseInt(cents);
 JOptionPane.showMessageDialog(null, "You have "+ cent*10+ " cents");



		// Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("how tall are you");


int h = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
if(h<36) {
	JOptionPane.showMessageDialog(null, "eat your Wheaties");
}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for(int i =3; i < 31;i++) {
	if(i%3==0) {
	System.out.println(i);
	}
	}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 

int ran = new Random().nextInt(20);
System.out.println(ran);
		// Get another random number that is less than 10 and print it to the console 
int rand = new Random().nextInt(10);
System.out.println(rand);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null,  ran-rand +"is the difference between these two numbers");


		}

		void skill4() { // In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog("what city do you live in");

		// If they answered "San Diego", tell them they live in America's Finest City 
if(city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "you live in the finest city in America");
	
}
else {
	JOptionPane.showMessageDialog(null, "move to San Diego");
}

		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = "2";


		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
JOptionPane.showMessageDialog(null, "the cars have 8 wheels between them");


		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("Whats the name of your school");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " is a fantastic school ");


		}
		}

