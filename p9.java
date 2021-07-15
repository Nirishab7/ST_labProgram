import java.util.*;
public class p9 {
    public static void main(String[] args) {
        int locks,stocks,barrels;
        float t_sales;
        int flag = 0;
        double commission;
        System.out.println("Enter no. of locks,stocks,barrels values");
        Scanner scan=new Scanner(System.in);
        locks=scan.nextInt();
        stocks=scan.nextInt();
        barrels=scan.nextInt();
        if ((locks <= 0) || (locks > 70))
        {
            System.out.println("value of locks not in range 1...70");
            flag=1;
        }

        if ((stocks <= 0) || (stocks > 80))
        {
            System.out.println("value of stocks not in range 1...80");
            flag=1;
        }

        if ((barrels <= 0) || (barrels > 90))
        {
            System.out.println("value of barrels not in range 1...90");
            flag=1;
        }

        if (flag == 1)
        {
            scan.close();
            return;
        }

        t_sales = (locks * 45) + (stocks * 30) + (barrels * 25);
        if (t_sales <= 1000)
        {
             commission = 0.10 * t_sales;
        }
        else if (t_sales < 1800)
        {
            commission = 0.10 * 1000;
            commission = commission + (0.15 * (t_sales - 1000));
        }
        else
        {
            commission = 0.10 * 1000;
            commission = commission + (0.15 * 800);
            commission = commission + (0.20 * (t_sales - 1800));
        }
        System.out.println("The total sales is " + t_sales + "\nThe commission is " + commission);
        scan.close();
        return;
} 
}
