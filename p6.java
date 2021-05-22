import java.util.*;
public class p6{
  public static void main(String[] args) {
      int month[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
      int d,m,y,ndays,nm,ny,nd;
      int flag=0;
      System.out.println("Enter the date,month,year");
      Scanner scan=new Scanner(System.in);
      d=scan.nextInt();
      m=scan.nextInt();
      y=scan.nextInt();
      scan.close();
      if (y<=1812 || y>2012)
      {
          System.out.println("year not in range");
          flag=1;
      }
     if(m<=0 || m>12){
        System.out.println("month not in range");
        flag=1;
    } 
     if(d<=0 || d>31){
        System.out.println("day not in range");
        flag=1;
     }

     if(flag==1){
         return;
     }

      ndays=month[m-1];
      if (m==2){
      if(y%4==0 || y%100==0 && y%400==0){
            ndays=29;
      }
      if(y%4!=0 || y%100!=0 && y%400!=0){
          if(d==29){
          System.out.println(d+ "/"+m+"/"+y+" date doesnt exist");
        return;
          }
      }
    }
    if (d>ndays){
        System.out.println(d+ "/"+m+"/"+y+" date doesnt exist");
        return;
    }

      nd=d+1;
      nm=m;
      ny=y;

      if(nd>ndays)
      {
      nd=1;
      nm++;
      }

      if(nm>12)
      {
      nm=1;
      ny++;
      }
        System.out.println("Current Day is "+d+ "/"+m+"/"+y);
        System.out.println("Next Day is "+nd+ "/"+nm+"/"+ny);
        return;
      }

  }  

