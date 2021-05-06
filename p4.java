import java.util.*;
public class p4 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
	int a=-1;
	int b=-1;
	int c=-1;
    int flag=0;
    String v=" ";
	System.out.println("Enter the values of a,b,c");
	try{
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
    in.close();
	}
	catch(Exception e){
	}
	if(a<=0||a>=10)
	{
       v=v+"a ";
       flag=1;
	}
    if(b<=0||b>=10)
	{
       v=v+"b ";
       flag=1;
	}
    if(c<=0||c>=10)
	{
       v=v+"c ";
       flag=1;
	}
    if (flag==1){
        System.out.println("Side" +v+"out of range");
        return;
    }
	if((a+b)<=c & (b+c)<=a & (a+c)<=b)
	{
		System.out.println("Not a Triangle");
		return;
	}
	if(a==b && b==c)
	{
		System.out.println("Equilateral");
		return;
	}
	if(a!=b && b!=c && c!=a)
	{
		System.out.println("Scalene");
		return;
	}
	else
		System.out.println("Isosceles");
return;
    }
}
