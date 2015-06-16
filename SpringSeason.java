public class SpringSeason{
private static boolean isInRange(int m,int d){
if(m==3 && d>=20 && d<=31||
   m==4 && d>=1 && d<=30 ||
   m==5 && d>=1 && d<=31 ||
   m==6 && d>=1 && d<=20
)
{
	return true;
}
else{
	return false;
}
}
public static void main(String[] args){
int month=0,day=0;
try{
	month = Integer.parseInt(args[0]);
	day = Integer.parseInt(args[1]);
}
catch(Exception e){
	System.out.println("Month and Date should be integer value"+ e);
}
boolean result = isInRange(month,day);
System.out.println(result);
}
}
