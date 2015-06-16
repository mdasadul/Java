public class ThreeSort{
public static void main(String Args[]){
double t = Double.parseDouble(Args[0]);
double v = Double.parseDouble(Args[1]);
double w = Double.parseDouble(Args[2]);
double max =  Math.max(v,w)<t?t:Math.max(v,w);
double min = Math.min(t,v)<w?Math.min(t,v):w;
double middle = w+v+t - min - max;
System.out.println(min+ " " + middle +" " + max);

}
}
