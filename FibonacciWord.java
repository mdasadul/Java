public class FibonacciWord{
public static String fibcat(String a, String b){
 return b+a;
}
public static void main(String[] args){
String f0 = "a";
String f1 = "b";
String result = "";
for(int i=2;i<=10;i++)
{	result = fibcat(f0,f1);
	System.out.println(result+ "\n");
	f0 = f1;
	f1 = result;
}
}
}
