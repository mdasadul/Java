public class LeapYear{
public static void main(String args[]){ 
int lyear = Integer.parseInt(args[0]);
if( lyear%4 ==0)
{
  if(lyear%100 ==0 && lyear%400 != 0)
  {
    System.out.println(lyear + " is not a leap year");
  }
  else{ 
    System.out.println(lyear + " is a leap year");
 }
}
else{
 System.out.println(lyear + " is not a leap year");
}
}
}
