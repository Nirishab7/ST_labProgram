import java.util.*;
class p1
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int a=-1;
	int b=-1;
	int c=-1;
	System.out.println("Enter the values of a,b,c");
	try{
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	}
	catch(Exception e){
	}
	if(a<=0||b<=0||c<=0||a>=10||b>=10||c>=10)
	{
		System.out.println("Not a Triangle");
        in.close();
		return;
	}
	if((a+b)<=c & (b+c)<=a & (a+c)<=b)
	{
		System.out.println("Not a Triangle");
        in.close();
		return;
	}
	if(a==b && b==c)
	{
		System.out.println("Equilateral");
        in.close();
		return;
	}
	if(a!=b && b!=c && c!=a)
	{
		System.out.println("Scalene");
        in.close();
		return;
	}
	else
		System.out.println("Isosceles");
in.close();
return;
}
}