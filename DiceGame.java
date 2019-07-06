
import java.util.Random;

public class DiceGame{
    static public void main(String[] args){
	Random rnd = new Random();
	int dice1 = rnd.nextInt(6)+1;
	int dice2 = rnd.nextInt(6)+1;
	int sum = dice1+dice2;
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: "+dice1);
	System.out.println("Die 2: "+dice2);
	System.out.println("Total value: "+sum);
	if(sum>=7)System.out.println("You won");
	else System.out.println("You lost");

    }
}
