public class Quadratic{
public static void main(String[] args){
double b = Double.parseDouble(args[0]);
double c = Double.parseDouble(args[1]);
double rootOne = (-b+Math.sqrt(b*b-4*c))/2;
double rootTwo = (-b - Math.sqrt(b*b-4*c))/2;
System.out.println(rootOne + " "+ rootTwo);
}
}
