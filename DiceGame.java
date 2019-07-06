
import java.io.*;
import java.util.Random;

public class DiceGame{
    static public void main(String[] args){
	String name = "";
	System.out.println("What is your name?");
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	try{
	    name = br.readLine();
	}
	catch(Exception e){
	}
	System.out.println("Hello, "+name+"!");

	Random rnd = new Random();
	int dice1 = rnd.nextInt(6)+1;
	int dice2 = rnd.nextInt(6)+1;
	int sum = dice1+dice2;
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: "+dice1);
	System.out.println("Die 2: "+dice2);
	System.out.println("Total value: "+sum);

    }
}
