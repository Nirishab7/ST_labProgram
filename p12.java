import java.util.Scanner;

public class p12 {
   public static void main(String[] args) {
        int eng,kan,hindi,math,social,science;
        float per;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter english marks: ");
        eng=scan.nextInt();
        System.out.print("Enter kannada marks: ");
        kan=scan.nextInt();
        System.out.print("Enter hindi marks: ");
        hindi=scan.nextInt();
        System.out.print("Enter maths marks: ");
        math=scan.nextInt();
        System.out.print("Enter social marks: ");
        social=scan.nextInt();
        System.out.print("Enter science marks: ");
        science=scan.nextInt();
        per=(float) ((eng+kan+hindi+math+social+science)/6.25);
        System.out.print("Percentage: ");
        System.out.println(per);
        if(per<35 && per >0)
            System.out.println("Fail");
        else if(per<=40 && per>35)
            System.out.println("Grade C");
        else if(per<=50 && per>40)
            System.out.println("Grade C+");
        else if(per<=60 && per>50)
            System.out.println("Grade B");
        else if(per<=70 && per>60)
            System.out.println("Grade B+");
        else if(per<=80 && per>70)
            System.out.println("Grade A");
        else 
            System.out.println("Grade A+"); 
        scan.close();       
}
}
