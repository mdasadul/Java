public class SumOfTwoDice{
private static int getSum(int firstDice,int secondDice){
return firstDice + secondDice;
}
public static void main(String args[]){
int SEED = 6;
int randomFirstDice = (int)(1+ Math.random()*SEED);
int randomSecondDice = (int)(1+ Math.random()*SEED);
System.out.println(getSum(randomFirstDice,randomSecondDice));
}
}
