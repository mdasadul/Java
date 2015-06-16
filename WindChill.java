public class WindChill{
public static void main(String Args[]){
double t = Double.parseDouble(Args[0]);
double v = Double.parseDouble(Args[1]);
double w = 34.75 + 0.6215 * t +(0.4275*t-35.75)*Math.pow(v,0.16);
System.out.println(w);
}
}
