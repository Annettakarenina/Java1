package first;

import java.util.Scanner;


public class Hello {
    public static void main(String[] args) {
    	
    	String name, gender, originalcity, currentcity, workplace, jobrole;
    	int age;
    	double salary, salaryraise;
    	
    	Scanner user=new Scanner (System.in);
    	Scanner userInt=new Scanner (System.in);
    	Scanner userDoubleInt=new Scanner (System.in);
    	
    	System.out.println("What is your name?");
    	name=user.nextLine();
    	
    	System.out.println("How old are you?");
    	age=userInt.nextInt();
    	
    	System.out.println("What is your gender?");
    	gender=user.nextLine();
    	
    	System.out.println("Where are you from?");
    	originalcity=user.nextLine();
    	
    	System.out.println("Where do you live now?");
    	currentcity=user.nextLine();
    	
    	System.out.println("Where do you work now?");
    	workplace=user.nextLine();
    	
    	System.out.println("What is your jobrole?");
    	jobrole=user.nextLine();
    	
    	System.out.println("What is your salary?");
    	salary=userDoubleInt.nextDouble();
    	
    	System.out.println("How much raise are you getting next year?");
    	salaryraise=userDoubleInt.nextDouble();
  
    	System.out.print("My name is "+name+".");  
    	System.out.print("I am "+age+" years old, "+gender+".");
    	System.out.print("I work at "+workplace+" as an "+jobrole+".");
    	System.out.print("I currently live in "+currentcity+".");
    	System.out.print("I am originally from "+originalcity+".");
    	System.out.print("I make "+salary+" dollars.");
    	System.out.print("I will get a "+salaryraise+" raise next year so my total salary would be "+(salary+salaryraise)+".");
    }
    public static void pro() {
    	System.out.println("java is smart");
    }
    
}
