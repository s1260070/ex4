
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
  if(sum>=7)System.out.println(name+" won");
  else System.out.println(name+" lost");

  //my original feature
  System.out.println("Do you want to try again? -> Y/n");
  String answer = "";
	InputStreamReader isr1 = new InputStreamReader(System.in);
	BufferedReader br1 = new BufferedReader(isr);
	try{
	    answer = br1.readLine();
	}
	catch(Exception e){
	}
  if(answer.equals("Y")){
    int dice11 = rnd.nextInt(6)+1;
    int dice21 = rnd.nextInt(6)+1;
    int sum1 = dice11+dice21;
    System.out.println("Rolling the dice...");
    System.out.println("Die 1: "+dice11);
    System.out.println("Die 2: "+dice21);
    System.out.println("Total value: "+sum);
    if(sum1>=7)System.out.println(name+" won");
    else System.out.println(name+" lost");
  }
}
}
